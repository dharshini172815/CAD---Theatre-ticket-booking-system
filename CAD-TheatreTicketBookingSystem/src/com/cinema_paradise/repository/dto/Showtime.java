package com.cinema_paradise.repository.dto;

public class Showtime {
	private String showtimeId;
    private String movieId;
    private String time;

    public Showtime(String showtimeId, String movieId, String time) {
        this.showtimeId = showtimeId;
        this.movieId = movieId;
        this.time = time;
    }

    public Showtime(Movie movie, String time2) {
		// TODO Auto-generated constructor stub
	}

	public String getShowtimeId() { return showtimeId; }
    public String getMovieId() { return movieId; }
    public String getTime() { return time; }
}
