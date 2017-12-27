package com.jia.mddemo.view;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Describtion:RecyclerView的点击事件监听
 * Created by jia on 2017/3/17 0017.
 * 人之所以能，是相信能
 */
public abstract class JsOnItemClickListener implements RecyclerView.OnItemTouchListener {

    private GestureDetectorCompat mGestureDetector;

    public JsOnItemClickListener(final RecyclerView recyclerView) {
        mGestureDetector = new GestureDetectorCompat(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View childView = recyclerView.findChildViewUnder(e.getX(), e.getY());
                Log.e("TAG", "onSingleTapUp: "+childView.getY());
                onItemY(childView.getY(),childView.getHeight());
                if (childView != null) {
                    RecyclerView.ViewHolder vh = recyclerView.getChildViewHolder(childView);
                    onJsItemClick(vh, recyclerView.getChildAdapterPosition(childView));
                }
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                View childView = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if (childView != null) {
                    RecyclerView.ViewHolder vh = recyclerView.getChildViewHolder(childView);
                    onJsItemLongClick(vh, recyclerView.getChildAdapterPosition(childView));
                }
            }
        });
    }

    //点击事件交给mGestureDetector处理
    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        return false;
    }

    public abstract void onItemY(double y,double height);

    /**
     * 点击监听
     * @param vh
     * @param position
     */
    public abstract void onJsItemClick(RecyclerView.ViewHolder vh, int position);

    /**
     * 长按监听
     * @param vh
     * @param position
     */
    public abstract void onJsItemLongClick(RecyclerView.ViewHolder vh, int position);


    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
