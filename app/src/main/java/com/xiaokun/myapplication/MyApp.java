package com.xiaokun.myapplication;

import android.app.Application;

/**
 * Created by 肖坤 on 2018/3/28.
 *
 * @author 肖坤
 * @date 2018/3/28
 */

public class MyApp extends Application
{

    @Override
    public void onCreate()
    {
        super.onCreate();
        Toasts.register(this);
    }
}
