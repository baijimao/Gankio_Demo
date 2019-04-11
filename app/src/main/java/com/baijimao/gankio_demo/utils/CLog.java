package com.baijimao.gankio_demo.utils;

import android.util.Log;

/**
 * @author: baijimao
 * @date: 2019/4/10
 * Description:
 */
public class CLog {
    private static final String TAG = "Cwxin";

    public static void i(String tag, String msg) {
        Log.i(TAG,"_" + tag +":" + msg);
    }
}
