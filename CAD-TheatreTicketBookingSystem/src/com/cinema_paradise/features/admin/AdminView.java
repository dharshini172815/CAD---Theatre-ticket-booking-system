package com.cinema_paradise.features.admin;

import java.util.Scanner;

public class AdminView {
	 private final AdminModel model;
	 private Scanner sc = new Scanner(System.in);

	 public AdminView() {
	    this.model = new AdminModel(this);
	 }

	 public void init() {
	 }

	public void showAdminMenu() {
		while(true) {
			System.out.println("\n------Admin menu--------");
			System.out.println("1. Add Movie");
            System.out.println("2. Add Showtime");
            System.out.println("3. View All Bookings");
            System.out.println("4. View Registered Users");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	model.addMovie();
            	break;
            case 2:
            	model.addShowtime();
            	break;
            case 3:
            	model.viewAllBookings();
            	break;
            case 4:
            	model.viewRegisteredUsers();
            	break;
            case 5:
            	System.out.println("Logging out from admin...");
            	return;
            default:
            	System.out.println("Invalid choice. Try again..");
            }
		}
	}
}
