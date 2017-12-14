package com.jia.mddemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Description: 卸载app的广播接收器
 * Created by jia on 2017/8/31.
 * 人之所以能，是相信能
 */
public class InstallReceiver extends BroadcastReceiver {

    private static final String TAG = "InstallReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: ");
        String action = intent.getAction();
        String packageNameStr = intent.getDataString();
        String[] split = packageNameStr.split(":");
        String packageName = split[1].trim();

        switch (action) {
            // 检测到应用卸载
            case Intent.ACTION_PACKAGE_REMOVED:

                Log.e(TAG, "onReceive: 卸载");

                break;
            // 检测到应用被替换
            case Intent.ACTION_PACKAGE_REPLACED:

                Log.e(TAG, "onReceive: 替换");

                break;
            // 检测到安装应用
            case Intent.ACTION_PACKAGE_ADDED:

                Log.e(TAG, "onReceive: 安装");

                break;
        }
    }

}
