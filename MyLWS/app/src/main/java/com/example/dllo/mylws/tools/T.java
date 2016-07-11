package com.example.dllo.mylws.tools;

import android.widget.Toast;

import com.example.dllo.mylws.ui.activity.MyApp;


/**
 * Created by dllo on 16/7/11.
 * Toast 吐司的工具类
 */
public class T {
    private static boolean isDebug = true;
    //吐司长时间的
    public static void longMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
    public static void shortMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();

        }
    }
}
