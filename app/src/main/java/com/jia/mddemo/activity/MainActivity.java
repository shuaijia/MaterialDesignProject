package com.jia.mddemo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.MainAdapter;
import com.jia.mddemo.fragment.BeijingFragment;
import com.jia.mddemo.fragment.NewsFragment;
import com.jia.mddemo.fragment.PictureFragment;
import com.jia.mddemo.fragment.TuijianFragment;
import com.jia.mddemo.fragment.VideoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;

    private FloatingActionButton fab;

    private RecyclerView rv_main;

    private ViewPager vp_content;

    private TabLayout tab;

    private NavigationView nav_view;

    private DrawerLayout drawer;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        initView();

        initToolBar();

        initListener();

        vp_content.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            private String[] titles={"推荐","新闻","视频","美图","北京"};

            @Override
            public Fragment getItem(int position) {
                if(position==0){
                    return new TuijianFragment();
                }else if(position==1){
                    return new NewsFragment();
                }else if(position==2){
                    return new VideoFragment();
                }else if(position==3){
                    return new PictureFragment();
                }else {
                    return new BeijingFragment();
                }
            }

            @Override
            public int getCount() {
                return 5;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        tab.setupWithViewPager(vp_content);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Snackbar.make(toolbar, "搜索", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.action_add:
                Snackbar.make(toolbar, "更多", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.action_setting:
                Snackbar.make(toolbar, "设置", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.action_help:
                Snackbar.make(toolbar, "帮助", Snackbar.LENGTH_LONG).show();
                break;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:

                Snackbar.make(view, "悬浮框", Snackbar.LENGTH_LONG).setAction("Action", null).show();

                break;
        }
    }

    private void initListener(){
        fab.setOnClickListener(this);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 从左侧打开抽屉
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        drawer.setDrawerListener(new DrawerLayout.DrawerListener() {

            // 抽屉被滑动时执行
            // slideOffset的值从0到1，表示滑动的幅度
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            // 抽屉完全打开时执行
            @Override
            public void onDrawerOpened(View drawerView) {
                drawer.setClickable(true);
            }

            // 抽屉完全关闭时执行
            @Override
            public void onDrawerClosed(View drawerView) {

            }

            // 状态改变时执行
            // slideOffset为0表示闲置，slideOffset为1表示正在拖拽，slideOffset为2表示固定
            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        // 侧拉菜单点击事件
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_camera:

                        startActivity(new Intent(mContext,AboutMeActivity.class));

                        break;
                }
                return false;
            }
        });
    }

    private void initToolBar(){
        //设置导航的图标
        toolbar.setNavigationIcon(R.mipmap.ic_menu);
        // 设置主标题
        toolbar.setTitle("J++");

        setSupportActionBar(toolbar);
    }

    private void initView(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        nav_view = (NavigationView) findViewById(R.id.nav_view);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        vp_content= (ViewPager) findViewById(R.id.vp_content);
        tab= (TabLayout) findViewById(R.id.tab);
    }
}
