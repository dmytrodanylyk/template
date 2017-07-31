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

    public Logger getLogger() {
        return logger;
    }

    public Preferences getPreferences() {
        return preferences;
    }
}
