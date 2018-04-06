package com.example.kimke.eatupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView userWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(LoginActivity.USER_NAME_TEXT);

        userWelcome = findViewById(R.id.userWelcome);
        userWelcome.setText("Welcome " + userName + "!");

    }
}
