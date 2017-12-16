package com.jia.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jia.mddemo.R;
import com.jia.mddemo.adapter.TuijianAdapter;
import com.jia.mddemo.domain.Tuijian;
import com.jia.mddemo.net.HttpMethod;

import rx.Subscriber;

/**
 * Describtion: 推荐界面
 * Created by jia on 2017/8/29.
 * 人之所以能，是相信能
 */
public class TuijianFragment extends Fragment {

    private static final String TAG = "TuijianFragment";

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

        HttpMethod.getInstance().getTuijian(new Subscriber<Tuijian>() {
            @Override
            public void onCompleted() {
                Log.e(TAG, "onCompleted: " );
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " );
            }

            @Override
            public void onNext(Tuijian tuijian) {
                TuijianAdapter adapter = new TuijianAdapter(getActivity());
                adapter.addData(tuijian.getNewslist());
                rv_tuijian_content.setLayoutManager(new LinearLayoutManager(getActivity()));
                rv_tuijian_content.setAdapter(adapter);
            }
        });
    }
}
