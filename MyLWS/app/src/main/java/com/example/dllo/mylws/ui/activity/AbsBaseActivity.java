package com.example.dllo.mylws.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by dllo on 16/7/11.
 */
public abstract class AbsBaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在setContentView 上方 去掉信息栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //加入一些进入退出的动画
//        overridePendingTransition();
        //绑定布局
        setContentView(setLayout());
        //定制流程
        //1.初始化组件
        initViews();
        //2.初始化数据
        initDatas();

    }

    /**
     * 设置xml布局文件
     * （protectde修饰 ： 子类和同包可访问）
     * （返回值是int：因为xml文件R.layout是int类型）
     * @return layout布局文件 eg.R.layout.acitivty——main
     */
    protected  abstract  int setLayout();
    /**
     * 初始化组件
     */
    protected abstract void initViews();

    //设置监听
//    protected abstract void setListeners();

    /**
     * 初始化数据
     */
    protected abstract void initDatas();
    /**
     * 简化findViewById
     * T 泛型 ：泛指一系列类型 T指的是View的子类
     */
    protected  <T extends View> T byView(int resId){
        T t = (T) findViewById(resId);
        return t;
    }
    /**
     * 简化intent跳转
     * from intent里的 xx.this
     * to inttent里的 xx.class
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from,to);
        startActivity(intent);
    }

    //隐式 Intent
    protected void goTo(String action, String uri){
        Intent intent = new Intent(action);
        intent.setData(Uri.parse(uri));
        startActivity(intent);

    }

    /**
     * 带值跳转
     * @param from
     * @param to
     * @param values Bundle类型的值
     *               Bundle 是一个轻量级存储数据的类，存储的形式key——value
     */
    protected void goTo(Context from,Class<? extends AbsBaseActivity> to, Bundle values){
        Intent intent = new Intent(from,to);
        intent.putExtras(values);
        startActivity(intent);
    }




}
