package com.cinema_paradise.repository.dto;


public class Ticket {
	private Movie movie;
	private String showtime;

	public Ticket(Movie movie, String showTime) {
		this.movie = movie;
		this.showtime = showTime;
	}

	public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }
    
    public String toString() {
        return "Ticket - Movie: " + movie.getTitle() + ", Showtime: " + showtime;
    }

	
}
