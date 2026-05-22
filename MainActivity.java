package com.example.myfirstapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myfirstapp.Adapters.MovieAdapter;
import com.example.myfirstapp.Models.MovieModel;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MovieModel> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Movies Data with YOUR IMAGES
        movieList.add(new MovieModel(R.drawable.inception, "Inception", "2010", "Sci-Fi", "8.8"));
        movieList.add(new MovieModel(R.drawable.dark_knight, "The Dark Knight", "2008", "Action", "9.0"));
        movieList.add(new MovieModel(R.drawable.interstellar, "Interstellar", "2014", "Sci-Fi", "8.6"));
        movieList.add(new MovieModel(R.drawable.prestige, "The Prestige", "2006", "Drama", "8.5"));
        movieList.add(new MovieModel(R.drawable.oppenheimer, "Oppenheimer", "2023", "Biography", "8.9"));
        movieList.add(new MovieModel(R.drawable.john_wick, "John Wick", "2014", "Action", "7.4"));

        MovieAdapter adapter = new MovieAdapter(movieList, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}