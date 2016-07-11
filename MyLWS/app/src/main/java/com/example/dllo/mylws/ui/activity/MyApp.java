package com.example.dllo.mylws.ui.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/7/11.
 */
public class MyApp extends Application {
    //Application 是当前应用 只存在一个
    private static Context context;

    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();
    }
    //对外提供get方法
    public static Context getContext() {
        return context;
    }
}
