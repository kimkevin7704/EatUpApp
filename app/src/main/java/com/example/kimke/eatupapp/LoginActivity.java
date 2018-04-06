package com.example.kimke.eatupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public static final String USER_NAME_TEXT = "com.example.kimke.eatupapp.USER_NAME_TEXT";
    private EditText userNameInput;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.loginToHome);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }

    public void openHomeActivity() {
        userNameInput = findViewById(R.id.loginInput);
        String userName = userNameInput.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(USER_NAME_TEXT, userName);
        startActivity(intent);
    }
}
