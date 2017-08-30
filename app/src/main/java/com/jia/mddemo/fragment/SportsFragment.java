package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.SportsAdapter;
import com.jia.mddemo.adapter.TuijianAdapter;
import com.jia.mddemo.domain.Sports;
import com.jia.mddemo.net.HttpMethod;

import rx.Subscriber;

/**
 * Describtion: 体育新闻
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class SportsFragment extends Fragment {

    private RecyclerView rv_sports_content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sports, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_sports_content = view.findViewById(R.id.rv_sports_content);

        HttpMethod.getInstance().getSports(new Subscriber<Sports>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Sports sports) {
                SportsAdapter adapter = new SportsAdapter(getActivity(), sports.getNewslist());
                rv_sports_content.setLayoutManager(new LinearLayoutManager(getActivity()));
                rv_sports_content.setAdapter(adapter);
            }
        });
    }
}
