package com.cinema_paradise.features.admin;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cinema_paradise.repository.db.CinemaParadiseDb;
import com.cinema_paradise.repository.dto.Movie;
import com.cinema_paradise.repository.dto.Showtime;
import com.cinema_paradise.repository.dto.Ticket;
import com.cinema_paradise.repository.dto.User;

public class AdminModel {
	 private final AdminView view;
	 private Scanner sc = new Scanner(System.in);
	 private CinemaParadiseDb db = CinemaParadiseDb.getInstance();

	    public AdminModel(AdminView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Admin model initiated with view: " + view);
	    }

		public void addMovie() {
			System.out.println("Enter movie title : ");
			String title = sc.nextLine();
			System.out.println("Enter movie genre : ");
			String genre = sc.nextLine();
			Movie movie = new Movie(title, genre);
			db.getMovies().add(movie);
			System.out.println("Movie added successfully.");
			
		}

		public void addShowtime() {
			System.out.println("Enter movie title for the showtime : ");
			String movieTitle = sc.nextLine();
			Optional<Movie> movieOpt = db.getMovies().stream()
					.filter(m -> m.getTitle().equalsIgnoreCase(movieTitle))
					.findFirst();
			if(movieOpt.isPresent()) {
				System.out.print("Enter showtime (e.g. 6:00 PM) : ");
				String time = sc.nextLine();
				
				Showtime showtime = new Showtime(movieOpt.get(), time);
				db.getShowtimes().add(showtime);
				System.out.println("Showtime added successfully.");
			}else {
				System.out.println("Movie not found, Please add the movie first..");
			}
			
		}
		
		public void viewAllBookings() {
	        List<Ticket> tickets = db.getTickets();
	        if (tickets.isEmpty()) {
	            System.out.println("No bookings available.");
	            return;
	        }

	        System.out.println("\n--- All Bookings ---");
	        for (Ticket ticket : tickets) {
	            System.out.println(ticket);
	        }
	    }

		public void viewRegisteredUsers() {
			List<User> users = db.getUsers();
	        if (users.isEmpty()) {
	            System.out.println("No users registered.");
	            return;
	        }

	        System.out.println("\n--- Registered Users ---");
	        for (User user : users) {
	            System.out.println(user);
	        }
		}
}
