package com.example.myfirstapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myfirstapp.Models.MovieModel;
import com.example.myfirstapp.R;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<MovieModel> movieList;
    private Context context;

    public MovieAdapter(ArrayList<MovieModel> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MovieModel movie = movieList.get(position);
        holder.poster.setImageResource(movie.getPoster());
        holder.title.setText(movie.getTitle());
        holder.yearGenre.setText(movie.getYear() + " • " + movie.getGenre());
        holder.rating.setText("⭐ " + movie.getRating());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView title;
        TextView yearGenre;
        TextView rating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.moviePoster);
            title = itemView.findViewById(R.id.movieTitle);
            yearGenre = itemView.findViewById(R.id.movieYearGenre);
            rating = itemView.findViewById(R.id.movieRating);
        }
    }
}