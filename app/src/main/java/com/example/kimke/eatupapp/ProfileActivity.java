package com.example.kimke.eatupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button recipes, home, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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
}
