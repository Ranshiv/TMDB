package com.sagara.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button searchMoviesButton, topRatedMoviesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        searchMoviesButton = findViewById(R.id.searchMoviesButton);
        topRatedMoviesButton = findViewById(R.id.topRatedMoviesButton);

        searchMoviesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        topRatedMoviesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MovieListActivity.class);
            intent.putExtra("query", "top_rated");
            startActivity(intent);
        });
    }
}
