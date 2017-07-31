package com.dd.template.dependecies;

import android.util.Log;

public class AndroidLogger implements Logger {

    private static final String TAG = AndroidLogger.class.getSimpleName();

    @Override
    public void v(String message) {
        Log.v(TAG, message);
    }

    @Override
    public void d(String message) {
        Log.d(TAG, message);
    }
}
