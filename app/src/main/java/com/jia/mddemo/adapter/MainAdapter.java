package com.jia.mddemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Describtion: 主界面适配器
 * Created by jia on 2017/8/21.
 * 人之所以能，是相信能
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {

    }

    public class MainViewHolder extends RecyclerView.ViewHolder{

        public MainViewHolder(View itemView) {
            super(itemView);
        }
    }
}
