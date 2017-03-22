package com.example.hprinters.flora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hprinters.flora.R;

public class LoginActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.activity_login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });

    }

    private void doLogin() {
        application.getAuth().getUser().setLoggedIn(true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
