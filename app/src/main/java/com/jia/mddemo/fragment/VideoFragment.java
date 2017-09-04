package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jia.mddemo.R;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * Describtion:
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class VideoFragment extends Fragment {

    private IjkMediaPlayer ijkMediaPlayer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video, container,false);
    }
}
