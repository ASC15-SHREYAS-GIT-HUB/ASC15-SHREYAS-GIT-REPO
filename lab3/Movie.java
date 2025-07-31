package com.demo.labs.lab3;

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;

    private final String movieId;
    private static int moviesCount = 0;

    // Mandatory constructor
    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Full constructor using `this()`
    public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public void acceptDetails(String directedBy, double duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String showDetails() {
        return "Movie ID: " + movieId + "\n" +
                "Name: " + movieName + "\n" +
                "Produced By: " + producedBy + "\n" +
                "Directed By: " + directedBy + "\n" +
                "Duration: " + duration + " hrs\n" +
                "Year: " + year + "\n" +
                "Category: " + category + "\n";
    }
}
