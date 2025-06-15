package com.cinema_paradise.features.user;

import java.util.Scanner;

public class UserView {
	private final UserModel model;
	private Scanner sc = new Scanner(System.in);

    public UserView() {
        this.model = new UserModel(this);
    }

    public void init() {
        model.init();
        System.out.println("User view initiated with model: " + model);
    }

	public void showUserMenu() {
		while(true) {
			System.out.println("\n-------- User Menu --------");
            System.out.println("1. Browse Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Booking History");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                model.browseMovies();
                break;
            case 2:
                model.bookTicket();
                break;
            case 3:
                model.cancelTicket();
                break;
            case 4:
                model.viewBookingHistory();
                break;
            case 5:
                System.out.println("Logging out from user...");
                return;
            default:
                System.out.println("Invalid choice. Try again.");
            }
		}	
	}
}
