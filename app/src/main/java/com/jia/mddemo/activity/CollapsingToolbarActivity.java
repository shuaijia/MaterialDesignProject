package com.jia.mddemo.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.jia.mddemo.R;

/**
 * Description: 折叠式标题栏界面
 * Created by jia on 2017/9/19.
 * 人之所以能，是相信能
 */
public class CollapsingToolbarActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_collapsing_toolbar);
    }
}
