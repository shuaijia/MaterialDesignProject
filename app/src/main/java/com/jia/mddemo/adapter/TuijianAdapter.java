package com.jia.mddemo.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.jia.mddemo.R;

/**
 * Describtion:
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class TuijianAdapter extends RecyclerView.Adapter<TuijianAdapter.TuijianViewHolder>{
    private static final String TAG = "TuijianAdapter";
    private Context context;

    public TuijianAdapter(Context context){
        this.context=context;
    }

    @Override
    public TuijianViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tuijian, parent,false);
        return new TuijianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TuijianViewHolder holder, int position) {
        holder.tv_tuijian_title.setText("我爱北京");
        if(position%4==0){
            Glide.with(context)
                    .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504007017506&di=4d59c958d13bdb0224162a3682ddb479&imgtype=0&src=http%3A%2F%2Fnews.xiancn.com%2Fimages%2Fattachement%2Fjpg%2Fsite2%2F20140131%2F002564ab85ff145587e359.jpg")
                    .into(holder.iv_tuijian_img);
        }else if(position%4==1){
            Glide.with(context)
                    .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504007017505&di=67d8ddeaa176e8b238a7b7858cefc0cd&imgtype=0&src=http%3A%2F%2Fwww.0755cits.com%2Fpictures%2FTrustSoft%2FLines%2F2017125211123901.jpg")
                    .into(holder.iv_tuijian_img);
        }else if(position%4==2){
            Glide.with(context)
                    .load("http://img3.imgtn.bdimg.com/it/u=3964084318,2686569105&fm=26&gp=0.jpg")
                    .into(holder.iv_tuijian_img);
        }else {
            Glide.with(context)
                    .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504601853&di=2a2e8463a08adf3be153dcd4378ae2fe&imgtype=jpg&er=1&src=http%3A%2F%2Fimg06.tooopen.com%2Fimages%2F20161101%2Ftooopen_sy_184329544647.jpg")
                    .into(holder.iv_tuijian_img);
        }

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    class TuijianViewHolder extends RecyclerView.ViewHolder{

        public CardView cv_tuijian;
        public TextView tv_tuijian_title;
        public ImageView iv_tuijian_img;

        public TuijianViewHolder(View itemView) {
            super(itemView);
            cv_tuijian=itemView.findViewById(R.id.cv_tuijian);
            tv_tuijian_title=itemView.findViewById(R.id.tv_tuijian_title);
            iv_tuijian_img=itemView.findViewById(R.id.iv_tuijian_img);
        }
    }

}
