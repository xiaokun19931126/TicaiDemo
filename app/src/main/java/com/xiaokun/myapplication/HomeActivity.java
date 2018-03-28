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
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 肖坤 on 2018/3/28.
 *
 * @author 肖坤
 * @date 2018/3/28
 */

public class HomeActivity extends AppCompatActivity
{
    private static final String TAG = "HomeActivity";
    /**
     * 获取奖金对比url数字
     */
    String url = "http://i.sporttery.cn/odds_calculator/get_proportion?i_format=json&pool[]=had&pool[]=hhad&i_callback=getReferData1&_=";

    /**
     * 奖金对比url
     */
    String jjdbUrl = "http://info.sporttery.cn/football/info/fb_match_hhad.php?m=";

    private Context mContext;

    private static Pattern r = Pattern.compile("mid");
    private static Pattern p = Pattern.compile("<div class=\"g-bd\" >");

    OkHttpClient client = new OkHttpClient();

    int[] nums;
    private Button mShare;
    private WebView mWebview;
    private WebView mWebview1;
    private WebView mWebview2;
    private WebView mWebview3;
    private WebView mWebview4;
    private WebView mWebview5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            WebView.enableSlowWholeDocumentDraw();
        }
        setContentView(R.layout.activity_home);
        mContext = this;
        initView();
        getData();
    }

    private void initView()
    {
        mShare = (Button) findViewById(R.id.share);
        mWebview = (WebView) findViewById(R.id.webview);
        mWebview1 = (WebView) findViewById(R.id.webview1);
        mWebview2 = (WebView) findViewById(R.id.webview2);
        mWebview3 = (WebView) findViewById(R.id.webview3);
        mWebview4 = (WebView) findViewById(R.id.webview4);
        mWebview5 = (WebView) findViewById(R.id.webview5);


        setWebview(mWebview, mWebview1, mWebview2, mWebview3, mWebview4, mWebview5);

        mShare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveAndSharePicture();
            }
        });
    }

    private void setWebview(WebView... webViews)
    {
        for (WebView webView : webViews)
        {
            webView.getSettings().setJavaScriptEnabled(true);
        }
    }

    private void getData()
    {
        long l = System.currentTimeMillis();

        Request request = new Request.Builder().url(url + l).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                String data = response.body().string();
                Log.e(TAG, "onResponse: " + data);

                nums = getNums(data);
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {

                        mWebview.loadUrl("file:///android_asset/header.html?id=" + nums[0]);
                        mWebview1.loadUrl("file:///android_asset/header.html?id=" + nums[1]);
                        mWebview2.loadUrl("file:///android_asset/header.html?id=" + nums[2]);
                        mWebview3.loadUrl("file:///android_asset/header.html?id=" + nums[3]);
                        mWebview4.loadUrl("file:///android_asset/header.html?id=" + nums[4]);
                        mWebview5.loadUrl("file:///android_asset/header.html?id=" + nums[5]);
                    }
                });
            }
        });
    }

    /**
     * 保存和分享
     */
    private void saveAndSharePicture()
    {
        final Picture picture = mWebview.capturePicture();

        Observable.create(new ObservableOnSubscribe<Uri>()
        {
            @Override
            public void subscribe(ObservableEmitter<Uri> e) throws Exception
            {
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
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }

                Uri uri = Uri.fromFile(imgFile);
                // 通知图库更新
                Intent scannerIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, uri);
                mContext.sendBroadcast(scannerIntent);
                e.onNext(uri);
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Consumer<Uri>()
                        {
                            @Override
                            public void accept(Uri uri) throws Exception
                            {
                                Shares.shareImage(HomeActivity.this, uri, getString(R.string.picture_share));
                            }
                        }, new Consumer<Throwable>()
                        {
                            @Override
                            public void accept(Throwable throwable) throws Exception
                            {
                                Toasts.showSingleLong(throwable.getMessage() + "\n再试试...");
                            }
                        }
                );
    }


    /**
     * 抓取奖金对比html页面
     *
     * @param num
     */
    private void fetchJJDBHtml(int num)
    {
        Request request = new Request.Builder().url(jjdbUrl + num).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                String data = response.body().string().trim();

                Matcher m = p.matcher(data);
                int count = 0;
                int end = 0;
                while (m.find())
                {
                    count++;
                    if (count == 2)
                    {
                        break;
                    }
                }
                int i2 = m.start();
                Log.e(TAG, "count:" + count);
                Log.e(TAG, "end:" + end);


                int i = data.indexOf("<div class=\"m-hd\">");
//                int i1 = data.indexOf("<div class=\"g-bd\" >",1);
                String substring = data.substring(i, i2);
                Log.e(TAG, "index:" + i);
//                Log.e(TAG, "index:" + i1);
                Log.e(TAG, "index:" + i2);
                Log.e(TAG, "substring:" + substring);
            }
        });
    }

    /**
     * 获取数字
     *
     * @param data
     * @return
     */
    private int[] getNums(String data)
    {
        int count = 0;
        Matcher m = r.matcher(data);
        while (m.find())
        {
            count++;
        }
        int counts = count / 2;
        int mid = data.indexOf("mid");
        int win = data.indexOf("win");
        String res = data.substring(mid + 6, win - 3);
        try
        {
            Integer num = Integer.valueOf(res);
            nums = new int[counts];
            for (int i = 0; i < counts; i++)
            {
                nums[i] = num + i;
            }
            return nums;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


}
