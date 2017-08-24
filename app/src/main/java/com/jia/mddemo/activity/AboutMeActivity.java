package com.jia.mddemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.jia.mddemo.R;

/**
 * Describtion: 关于我的界面
 * Created by jia on 2017/8/24.
 * 人之所以能，是相信能
 */
public class AboutMeActivity extends AppCompatActivity {

    private Toolbar toolbar_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_me);

//        toolbar_me= (Toolbar) findViewById(R.id.toolbar_me);

//        setSupportActionBar(toolbar_me);
    }
}
