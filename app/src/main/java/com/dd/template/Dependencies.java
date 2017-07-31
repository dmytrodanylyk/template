package com.dd.template;

import android.content.Context;

import com.dd.template.dependecies.AndroidLogger;
import com.dd.template.dependecies.AndroidPreferences;
import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

public enum Dependencies {

    INSTANCE;

    private Logger logger;
    private Preferences preferences;

    void init(Context context) {
        logger = new AndroidLogger();
        preferences = new AndroidPreferences(context);
    }

    public Logger getLogger() {
        return logger;
    }

    public Preferences getPreferences() {
        return preferences;
    }
}
