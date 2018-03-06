package com.jia.mddemo;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Description:
 * Created by jia on 2018/1/12.
 * 人之所以能，是相信能
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
