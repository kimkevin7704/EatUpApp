package com.example.kimke.eatupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView userWelcome;
    private Button recipes, home, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(LoginActivity.USER_NAME_TEXT);

        userWelcome = findViewById(R.id.userWelcome);
        userWelcome.setText("Welcome " + userName + "!");

        recipes = findViewById(R.id.recipes);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);

        recipes.setOnClickListener(this);
        home.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.recipes:
                openRecipeActivity();
                break;
            case R.id.home:
                openHomeActivity();
                break;
            case R.id.profile:
                openProfileActivity();
        }
    }

    public void openRecipeActivity() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openHomeActivity() {
        Intent intent = new Intent( this, HomeActivity.class);
        startActivity(intent);
    }
}
