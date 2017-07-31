package com.dd.template;

import android.content.Context;

import com.dd.template.dependecies.AndroidLogger;
import com.dd.template.dependecies.AndroidPreferences;
import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

public class ProdDependencies implements DependenciesFactory {

    private Context context;

    ProdDependencies(Context context) {
        this.context = context;
    }

    @Override
    public Logger newLogger() {
        return new AndroidLogger();
    }

    @Override
    public Preferences newPreferences() {
        return new AndroidPreferences(context);
    }
}
