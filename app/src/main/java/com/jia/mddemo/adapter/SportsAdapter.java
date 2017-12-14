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
import com.jia.mddemo.domain.Sports;

import java.util.List;

/**
 * Description:
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.SportsViewHolder> {

    private Context context;
    private List<Sports.NewslistBean> list;

    public SportsAdapter(Context context, List<Sports.NewslistBean> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SportsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sports, parent, false);
        return new SportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SportsViewHolder holder, final int position) {
        holder.tv_sports_title.setText(list.get(position).getTitle() + "");
        holder.tv_sports_desc.setText(list.get(position).getDescription()+"");
        Glide.with(context)
                .load(list.get(position).getPicUrl() + "")
                .placeholder(R.drawable.bg)
                .error(R.drawable.bg)
                .into(holder.iv_sports_img);

        holder.cv_sports.setOnClickListener(new View.OnClickListener() {
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
        return list == null ? 0 : list.size();
    }

    class SportsViewHolder extends RecyclerView.ViewHolder {

        CardView cv_sports;
        ImageView iv_sports_img;
        TextView tv_sports_title;
        TextView tv_sports_desc;

        public SportsViewHolder(View itemView) {
            super(itemView);
            cv_sports=itemView.findViewById(R.id.cv_sports);
            iv_sports_img = itemView.findViewById(R.id.iv_sports_img);
            tv_sports_title = itemView.findViewById(R.id.tv_sports_title);
            tv_sports_desc = itemView.findViewById(R.id.tv_sports_desc);
        }
    }

}
