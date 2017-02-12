package com.dd.template.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dd.template.BuildConfig;
import com.dd.template.R;

import static com.dd.template.utils.ViewUtils.findById;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView appVersionView = findById(this, R.id.appVersionView);
        appVersionView.setText(getString(R.string.main_app_version, BuildConfig.VERSION_NAME));

        TextView appNameView = findById(this, R.id.appNameView);
        appNameView.setText(getString(R.string.main_app_name, getString(R.string.app_name)));

        TextView appVersionCodeView = findById(this, R.id.appVersionCodeView);
        appVersionCodeView.setText(getString(R.string.main_app_version_code, BuildConfig.VERSION_CODE));

        Button exitView = findById(this, R.id.exitView);
        exitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onExitClicked();
            }
        });

        presenter = new MainPresenter(this);
    }

    @Override
    public void exit() {
        finish();
    }
}
