package com.sagara.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button searchMoviesButton, topRatedMoviesButton, trendingMoviesButton, favoritesButton, settingsButton;
    private TextView userNameTextView;
    private ImageView userAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        searchMoviesButton = findViewById(R.id.searchMoviesButton);
        topRatedMoviesButton = findViewById(R.id.topRatedMoviesButton);
        trendingMoviesButton = findViewById(R.id.trendingMoviesButton);
        favoritesButton = findViewById(R.id.favoritesButton);
        settingsButton = findViewById(R.id.settingsButton);
        userNameTextView = findViewById(R.id.userNameTextView);
        userAvatar = findViewById(R.id.userAvatar);

        // Mock user data
        userNameTextView.setText("Welcome, John Doe!");

        searchMoviesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        topRatedMoviesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MovieListActivity.class);
            intent.putExtra("query", "top_rated");
            startActivity(intent);
        });

        trendingMoviesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MovieListActivity.class);
            intent.putExtra("query", "trending");
            startActivity(intent);
        });

        favoritesButton.setOnClickListener(v -> {
            // Placeholder for FavoritesActivity
            Intent intent = new Intent(HomeActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });

        settingsButton.setOnClickListener(v -> {
            // Placeholder for SettingsActivity
            Intent intent = new Intent(HomeActivity.this, SettingsActivity.class);
            startActivity(intent);
        });
    }
}
