package com.jackson.daggertest.utils;

import android.util.Log;


/*
* LogUtil  2016-11-10
* Copyright (c) 2016 HYB Co.Ltd. All right reserved.
*/
/*
* 全局的Log调试信息配置
* @author Borje
* @version 1.0.0
* since 2016-11-10
*/
public class LogUtil {
    //控制是否打印调试信息
    private static final String TAG = "hbj--";

    public  void d(String msg) {
        if (msg != null) {

            Log.d(TAG, msg);

        }
    }

    public static void i(String msg) {
        if (msg != null) {

            Log.i(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (msg != null) {

            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (msg != null) {

            Log.e(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (msg != null) {

            Log.v(TAG, msg);
        }
    }
}