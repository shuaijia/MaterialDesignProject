package com.jia.mddemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jia.mddemo.R;
import com.jia.mddemo.video.bean.VideoInfo;
import com.jia.mddemo.video.listener.OnVideoControlListener;
import com.jia.mddemo.video.utils.DisplayUtils;
import com.jia.mddemo.video.video.JsPlayer;

import java.util.List;

/**
 * Describtion:视频界面适配器
 * Created by jia on 2017/9/4.
 * 人之所以能，是相信能
 */
public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private Context context;
    private List<VideoInfo> list;

    public VideoAdapter(Context context, List<VideoInfo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final VideoViewHolder holder, final int position) {

        holder.player.setOnVideoControlListener(new OnVideoControlListener() {
            @Override
            public void onBack() {

            }

            @Override
            public void onFullScreen() {
                DisplayUtils.toggleScreenOrientation((Activity) context);
            }

            @Override
            public void onRetry(int errorStatus) {

            }
        });

        holder.player.setPath(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class VideoViewHolder extends RecyclerView.ViewHolder {

        JsPlayer player;
        LinearLayout ll_video_content;

        public VideoViewHolder(View itemView) {
            super(itemView);
            player = itemView.findViewById(R.id.player);
            ll_video_content=itemView.findViewById(R.id.ll_video_content);
        }
    }
}
