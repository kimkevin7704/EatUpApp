package com.example.kimke.eatupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChickenActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton recipes, home, profile;
    private Button timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recipes = findViewById(R.id.recipes);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        timer = findViewById(R.id.startCooking);

        recipes.setOnClickListener(this);
        home.setOnClickListener(this);
        profile.setOnClickListener(this);
        timer.setOnClickListener(this);
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
                break;
            case R.id.startCooking:
                openTimerActivity();
                break;
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

    public void openTimerActivity() {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }
}