package com.cinema_paradise.features.user;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cinema_paradise.repository.db.CinemaParadiseDb;
import com.cinema_paradise.repository.dto.Movie;
import com.cinema_paradise.repository.dto.Showtime;
import com.cinema_paradise.repository.dto.Ticket;

public class UserModel {
	private final UserView view;
	private Scanner scanner = new Scanner(System.in);
    private CinemaParadiseDb db = CinemaParadiseDb.getInstance();

    public UserModel(UserView view) {
        this.view = view;
    }

    public void init() {
    }

	public void browseMovies() {
		List<Movie> movies = db.getMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("\n--- Available Movies ---");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
		
	}

	public void bookTicket() {
		System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        Optional<Movie> movieOpt = db.getMovies().stream()
            .filter(m -> m.getTitle().equalsIgnoreCase(title))
            .findFirst();

        if (!movieOpt.isPresent()) {
            System.out.println("Movie not found.");
            return;
        }

        System.out.print("Enter showtime: ");
        String showTime = scanner.nextLine();

        Showtime showtime = new Showtime(movieOpt.get(), showTime);
        db.getShowtimes().add(showtime);

        Ticket ticket = new Ticket(movieOpt.get(), showTime);
        db.getTickets().add(ticket);

        System.out.println("Ticket booked successfully.");
		
	}

	public void cancelTicket() {
		System.out.print("Enter movie title to cancel ticket: ");
        String title = scanner.nextLine();

        Optional<Ticket> ticketOpt = db.getTickets().stream()
            .filter(t -> t.getMovie().getTitle().equalsIgnoreCase(title))
            .findFirst();

        if (ticketOpt.isPresent()) {
            db.getTickets().remove(ticketOpt.get());
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("No ticket found for the given movie.");
        }
	}

	public void viewBookingHistory() {
		List<Ticket> tickets = db.getTickets();
        if (tickets.isEmpty()) {
            System.out.println("No booking history.");
            return;
        }

        System.out.println("\n--- Booking History ---");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
	}
}
