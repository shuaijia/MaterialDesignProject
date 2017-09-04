package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.VideoAdapter;
import com.jia.mddemo.video.bean.VideoInfo;

import java.util.ArrayList;
import java.util.List;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * Describtion:
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class VideoFragment extends Fragment {

    private RecyclerView rv_video;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_video = view.findViewById(R.id.rv_video);

        List<VideoInfo> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            VideoInfo info = new VideoInfo("艺术人生", "http://baobab.wdjcdn.com/1455782903700jy.mp4 ");
            list.add(info);

        }

        rv_video.setLayoutManager(new LinearLayoutManager(getActivity()));
        VideoAdapter adapter=new VideoAdapter(getActivity(),list);
        rv_video.setAdapter(adapter);
    }
}
