package com.dd.template;

import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

public enum Dependencies {

    INSTANCE;

    private Logger logger;
    private Preferences preferences;

    void init(DependenciesFactory dependenciesFactory) {
        logger = dependenciesFactory.newLogger();
        preferences = dependenciesFactory.newPreferences();
    }

    public static Logger logger() {
        return Dependencies.INSTANCE.logger;
    }

    public static Preferences preferences() {
        return Dependencies.INSTANCE.preferences;
    }
}
