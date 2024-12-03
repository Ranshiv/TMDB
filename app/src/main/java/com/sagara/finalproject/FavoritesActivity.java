package com.sagara.finalproject;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    private ListView favoritesListView;
    private MovieAdapter adapter;
    private ArrayList<Movie> favoriteMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Initialize views
        favoritesListView = findViewById(R.id.favoritesListView);

        // Load favorite movies (this is just a placeholder; replace with real data from a database or shared preferences)
        favoriteMovies = loadFavoriteMovies();

        // Set up the adapter
        adapter = new MovieAdapter(this, favoriteMovies);
        favoritesListView.setAdapter(adapter);

        // Handle empty favorites list
        if (favoriteMovies.isEmpty()) {
            Toast.makeText(this, "No favorite movies found!", Toast.LENGTH_SHORT).show();
        }
    }

    // Placeholder method to load favorite movies
    private ArrayList<Movie> loadFavoriteMovies() {
        // Replace this with actual data loading logic (e.g., from a database or shared preferences)
        ArrayList<Movie> favorites = new ArrayList<>();
        favorites.add(new Movie(
                "Inception",
                "2010-07-16",
                8.8,
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                "https://image.tmdb.org/t/p/w500/qmDpIHrmpJINaRKAfWQfftjCdyi.jpg"
        ));
        favorites.add(new Movie(
                "The Dark Knight",
                "2008-07-18",
                9.0,
                "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
                "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"
        ));
        return favorites;
    }
}
