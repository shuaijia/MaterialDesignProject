package com.jia.mddemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jia.mddemo.R;
import com.jia.mddemo.activity.DetailActivity;
import com.jia.mddemo.domain.Tuijian;

import java.util.ArrayList;
import java.util.List;

/**
 * Describtion:
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class TuijianAdapter extends RecyclerView.Adapter<TuijianAdapter.TuijianViewHolder> {

    private Context context;

    private List<Tuijian.NewslistBean> list = new ArrayList<>();

    public TuijianAdapter(Context context) {
        this.context = context;
    }

    public void addData(List<Tuijian.NewslistBean> list) {
        this.list=list;
    }

    @Override
    public TuijianViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tuijian, parent, false);
        return new TuijianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TuijianViewHolder holder, final int position) {
        holder.tv_tuijian_title.setText(list.get(position).getTitle() + "");
        holder.tv_tuijian_time.setText(list.get(position).getCtime()+"");
        Glide.with(context)
                .load(list.get(position).getPicUrl() + "")
                .placeholder(R.drawable.bg)
                .error(R.drawable.bg)
                .into(holder.iv_tuijian);

        holder.cv_tuijian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailActivity.class);
                intent.putExtra("url",list.get(position).getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TuijianViewHolder extends RecyclerView.ViewHolder {

        CardView cv_tuijian;
        ImageView iv_tuijian;
        TextView tv_tuijian_title;
        TextView tv_tuijian_time;

        public TuijianViewHolder(View itemView) {
            super(itemView);
            cv_tuijian=itemView.findViewById(R.id.cv_tuijian);
            iv_tuijian = itemView.findViewById(R.id.iv_tuijian);
            tv_tuijian_title = itemView.findViewById(R.id.tv_tuijian_title);
            tv_tuijian_time=itemView.findViewById(R.id.tv_tuijian_time);
        }
    }
}
