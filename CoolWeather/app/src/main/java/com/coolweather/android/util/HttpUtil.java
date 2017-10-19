package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xlj on 9/28/2017.
 */

public class HttpUtil {
    private static final String TAG = "HttpUtil";
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback)
    {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.d(TAG, "sendOkHttpRequest: request="+request);
        client.newCall(request).enqueue(callback);
    }
}
