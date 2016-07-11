package com.example.dllo.mylws.tools;

import android.util.Log;

/**
 * Created by dllo on 16/7/11.
 * log工具类
 */
public final class L {
    //被final修饰不能被继承
    //私有构造方法，外部不能创建对象
    //私有构造方法
    private L(){}
    //调试模式 目前定义为true
    private static boolean isDebug = true;
    //log日志的标签，定义的应用名
    private static String TAG = "MyLWS";
    public static  void  e(String msg){
        if (isDebug){
            Log.d(TAG, msg);
        }
    }

    /**
     * 自定义TAG标签的
     * @param tag
     * @param msg
     */
    public static void e(String tag,String msg){
        if (isDebug){
            Log.e(tag,msg);
        }
    }
}
