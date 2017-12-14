package com.jia.mddemo.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

import com.jia.mddemo.R;

/**
 * Describtion: 关于我的界面
 * Created by jia on 2017/8/24.
 * 人之所以能，是相信能
 */
public class AboutMeActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private CollapsingToolbarLayout toolbar_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_me);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar_layout= (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.mipmap.ic_arrow_back);

        toolbar_layout.setTitle("");


        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
