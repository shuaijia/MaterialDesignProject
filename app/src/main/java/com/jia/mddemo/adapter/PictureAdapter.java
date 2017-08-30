package com.jia.mddemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jia.mddemo.R;
import com.jia.mddemo.domain.Picture;

import java.util.List;

/**
 * Describtion:
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class PictureAdapter extends RecyclerView.Adapter {
    private static final String TAG = "PictureAdapter";
    private Context context;
    private List<Picture.NewslistBean> list;

    public PictureAdapter(Context context, List<Picture.NewslistBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==1){
            View view = LayoutInflater.from(context).inflate(R.layout.item_picture_two, parent, false);
            return new PictureViewHolderTwo(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_picture, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.e(TAG, "onBindViewHolder: "+list.get(position).getPicUrl() );
        if(holder instanceof PictureViewHolder){
            Glide.with(context)
                    .load(list.get(position).getPicUrl() + "")
                    .placeholder(R.drawable.bg)
                    .into(((PictureViewHolder)holder).iv_picture_img);
        }else{
            Glide.with(context)
                    .load(list.get(position).getPicUrl() + "")
                    .placeholder(R.drawable.bg)
                    .into(((PictureViewHolderTwo)holder).iv_picture_img2);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position%3==0){
            return 1;
        }
        return 2;
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class PictureViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_picture_img;

        public PictureViewHolder(View itemView) {
            super(itemView);
            iv_picture_img = itemView.findViewById(R.id.iv_picture_img);
        }
    }

    class PictureViewHolderTwo extends RecyclerView.ViewHolder {

        ImageView iv_picture_img2;

        public PictureViewHolderTwo(View itemView) {
            super(itemView);
            iv_picture_img2 = itemView.findViewById(R.id.iv_picture_img2);
        }
    }
}
