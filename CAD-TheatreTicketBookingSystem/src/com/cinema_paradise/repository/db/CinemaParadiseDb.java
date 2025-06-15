package com.cinema_paradise.repository.db;

import java.util.ArrayList;
import java.util.List;

import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.Movie;
import com.cinema_paradise.repository.dto.Payment;
import com.cinema_paradise.repository.dto.Seat;
import com.cinema_paradise.repository.dto.Showtime;
import com.cinema_paradise.repository.dto.Theatre;
import com.cinema_paradise.repository.dto.Ticket;
import com.cinema_paradise.repository.dto.User;

public class CinemaParadiseDb {
	private static CinemaParadiseDb dbInstance;
	
	private List<Admin> admins;
	private List<User> users;
	private List<Movie> movies;
	private List<Seat> seats;
	private List<Showtime> showtimes;
	private List<Theatre> theatres;
	private List<Ticket> tickets;
	private List<Payment> payments;
	
	private CinemaParadiseDb() {
		admins = new ArrayList<>();
		users = new ArrayList<>();
	    movies = new ArrayList<>();
	    seats = new ArrayList<>();
	    showtimes = new ArrayList<>();
	    theatres = new ArrayList<>();
	    tickets = new ArrayList<>();
	    payments = new ArrayList<>();
	}
	
	public static CinemaParadiseDb getInstance() {
		if(dbInstance == null) {
			dbInstance = new CinemaParadiseDb();
		}
		return dbInstance;
	}
	
	public List<Admin> getAdmins() {
		return admins;
	}
	
	public List<User> getUsers() {
        return users;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Payment> getPayments() {
        return payments;
    }
	
}
