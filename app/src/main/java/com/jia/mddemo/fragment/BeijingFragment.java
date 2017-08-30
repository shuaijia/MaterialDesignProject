package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.BeijingAdapter;

/**
 * Describtion:
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class BeijingFragment extends Fragment {

    private RecyclerView rv_tuijian_content;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tuijian, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_tuijian_content=view.findViewById(R.id.rv_tuijian_content);

        BeijingAdapter adapter=new BeijingAdapter(getActivity());
        rv_tuijian_content.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_tuijian_content.setAdapter(adapter);
    }
}
