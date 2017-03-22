package com.example.hprinters.flora.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hprinters.flora.infrastructure.FloraApplication;

public abstract class BaseActivity extends AppCompatActivity {
    protected FloraApplication application;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (FloraApplication) getApplication();
    }
}
