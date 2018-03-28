package com.xiaokun.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "MainActivity";

    private WebView webView;
    private Button shareBtn;
    private Context mContext;
    private Document document;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            WebView.enableSlowWholeDocumentDraw();
        }
        setContentView(R.layout.activity_main);

        mContext = this;

        webView = (WebView) findViewById(R.id.webview);

        shareBtn = (Button) findViewById(R.id.share);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://www.baidu.com");

        shareBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveAndSharePicture();
            }
        });

        getOriginHtml();
        long l = System.currentTimeMillis();
        getNums(l);
    }

    private void getOriginHtml()
    {
        Observable.create(new ObservableOnSubscribe<String>()
        {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception
            {
                try
                {
                    String url = Constants.BASE_URL + Constants.FIRST_ONE;
                    document = Jsoup.connect(url).get();

                    parseDocument(document);
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                    e.onError(ex);
                }

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }

    private void getNums(long time)
    {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.GET_NUMS)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        apiService.getProEntity()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>()
                {
                    @Override
                    public void accept(String s) throws Exception
                    {
                        Log.e(TAG, s);
                    }
                }, new Consumer<Throwable>()
                {
                    @Override
                    public void accept(Throwable throwable) throws Exception
                    {

                    }
                });

    }

    /**
     * 解析document
     *
     * @param document
     */
    private void parseDocument(Document document)
    {
        long l = System.currentTimeMillis();
    }

    private void saveAndSharePicture()
    {
        Picture picture = webView.capturePicture();
        Bitmap bitmap = Bitmap.createBitmap(
                picture.getWidth(), picture.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bitmap);
        picture.draw(c);

        File file = new File(Environment.getExternalStorageDirectory(), "webview_demo");
        if (!file.exists())
        {
            file.mkdir();
        }
        String fileName = System.currentTimeMillis() + ".jpg";
        File imgFile = new File(file, fileName);
        try
        {
            FileOutputStream outputStream = new FileOutputStream(imgFile);
            assert bitmap != null;
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        Uri uri = Uri.fromFile(imgFile);
        // 通知图库更新
        Intent scannerIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, uri);
        mContext.sendBroadcast(scannerIntent);
    }
}
