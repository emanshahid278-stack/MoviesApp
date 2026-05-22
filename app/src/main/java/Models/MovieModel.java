package com.example.myfirstapp.Models;

public class MovieModel {
    private int poster;
    private String title;
    private String year;
    private String genre;
    private String rating;

    // Constructor
    public MovieModel(int poster, String title, String year, String genre, String rating) {
        this.poster = poster;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters
    public int getPoster() { return poster; }
    public String getTitle() { return title; }
    public String getYear() { return year; }
    public String getGenre() { return genre; }
    public String getRating() { return rating; }
}