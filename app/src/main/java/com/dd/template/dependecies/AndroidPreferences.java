package com.dd.template.dependecies;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.dd.template.BuildConfig;

public class AndroidPreferences implements Preferences {

    private static final String SHARED_PREFS_NAME = BuildConfig.APPLICATION_ID;
    public static final String KEY_ID = "KEY_ID";

    private final SharedPreferences preferences;

    public AndroidPreferences(@NonNull Context context) {
        preferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }

    @Override
    public String getId() {
        return getString(KEY_ID);
    }

    @Override
    public void setId(String id) {
        putString(KEY_ID, id);
    }

    private String getString(String key) {
        return preferences.getString(key, null);
    }

    private void putString(String key, String value) {
        preferences.edit().putString(key, value).apply();
    }
}
