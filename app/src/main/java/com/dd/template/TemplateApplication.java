package com.dd.template;

import android.app.Application;
import android.os.StrictMode;

public class TemplateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Dependencies.INSTANCE.init(new DependenciesFactoryImpl(this));

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
        }
    }
}
