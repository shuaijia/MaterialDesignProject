package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.PictureAdapter;
import com.jia.mddemo.domain.Picture;
import com.jia.mddemo.net.HttpMethod;

import java.util.List;

import rx.Subscriber;

/**
 * Describtion:美图界面
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class PictureFragment extends Fragment {
    private static final String TAG = "PictureFragment";
    private RecyclerView rv_picture_content;
    private PictureAdapter adapter;

    private List<Picture.NewslistBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_picture, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_picture_content = view.findViewById(R.id.rv_picture_content);

        if(list!=null){
            adapter = new PictureAdapter(getActivity(),list );
            rv_picture_content.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
            rv_picture_content.setAdapter(adapter);
            return;
        }
//        new VideoView().setMediaController(new MediaController());
        HttpMethod.getInstance().getPicture(new Subscriber<Picture>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Picture picture) {
                list=picture.getNewslist();
                adapter = new PictureAdapter(getActivity(),list );
                rv_picture_content.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                rv_picture_content.setAdapter(adapter);
            }
        });

    }

}
