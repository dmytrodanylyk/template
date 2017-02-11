package com.dd.template;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.dd.template.ViewUtils.findById;

public class MainActivity extends AppCompatActivity {

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
    }
}
