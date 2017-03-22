package com.example.hprinters.flora.infrastructure;

import android.app.Application;

public class FloraApplication extends Application {

    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
