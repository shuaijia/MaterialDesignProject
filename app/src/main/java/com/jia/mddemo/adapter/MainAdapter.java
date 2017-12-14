package com.jia.mddemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jia.mddemo.fragment.TuijianFragment;

/**
 * Description:主界面适配器
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class MainAdapter extends FragmentPagerAdapter {

    private Context context;

    private String[] titles={"推荐","新闻","视频","美图"};

    public MainAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        return new TuijianFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
