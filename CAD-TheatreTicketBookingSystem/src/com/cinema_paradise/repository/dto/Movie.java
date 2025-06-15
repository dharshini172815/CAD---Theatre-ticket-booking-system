package com.cinema_paradise.repository.dto;

public class Movie {
	private String movieId;
    private String title;
    private String genre;

    public Movie(String movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }

    public Movie(String title2, String genre2) {
		// TODO Auto-generated constructor stub
	}

	public String getMovieId() { return movieId; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
}
