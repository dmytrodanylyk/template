package com.dd.template.main;

import java.util.UUID;

import static com.dd.template.Dependencies.logger;
import static com.dd.template.Dependencies.preferences;

public class MainPresenter {

    private final MainView view;

    MainPresenter(MainView view) {
        this.view = view;
    }

    public void onExitClicked() {
        preferences().setId(UUID.randomUUID().toString());
        logger().d("onExitClicked");
        view.exit();
    }
}