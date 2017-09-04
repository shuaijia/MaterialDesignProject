package com.jia.mddemo.video.listener;

/**
 * 视频控制监听
 */
public interface OnVideoControlListener {

    /**
     * 返回
     */
    void onBack();

    /**
     * 全屏
     */
    void onFullScreen();

    /**
     * 错误后的重试
     */
    void onRetry(int errorStatus);

}
