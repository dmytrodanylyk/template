package com.dd.template.main;

import com.dd.template.Dependencies;
import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

import java.util.UUID;

public class MainPresenter {

    private final MainView view;
    private final Logger logger;
    private final Preferences preferences;

    MainPresenter(MainView view) {
        this.view = view;
        this.logger = Dependencies.INSTANCE.getLogger();
        this.preferences = Dependencies.INSTANCE.getPreferences();
    }

    public void onExitClicked() {
        preferences.setId(UUID.randomUUID().toString());
        logger.d("onExitClicked");
        view.exit();
    }
}
