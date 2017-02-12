package com.dd.template.main;

public class MainPresenter {

    private MainView view;

    MainPresenter(MainView view) {
        this.view = view;
    }

    public void onExitClicked() {
        view.exit();
    }
}
