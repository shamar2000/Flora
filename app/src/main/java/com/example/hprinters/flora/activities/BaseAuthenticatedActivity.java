package com.example.hprinters.flora.activities;

import android.content.Intent;
import android.os.Bundle;

public abstract class BaseAuthenticatedActivity extends BaseActivity {

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onFloraCreate(savedInstanceState);
    }

    protected abstract void onFloraCreate(Bundle savedInstanceState);
}
