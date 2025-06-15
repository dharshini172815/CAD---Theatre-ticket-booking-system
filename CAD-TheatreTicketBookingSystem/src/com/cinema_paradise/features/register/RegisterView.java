package com.cinema_paradise.features.register;

import java.util.Scanner;

import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.User;

public class RegisterView {
	private final RegisterModel model;
	private static final Scanner sc = new Scanner(System.in);

    public RegisterView() {
        model = new RegisterModel(this);
    }

	public Object showRegistration() {
		System.out.println("Register as (1. Admin / 2. User) : ");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1) {
			if(model.isAdminAlreadyRegistered()) {
				System.out.println("Admin already registered. Please login");
				return null;
			}
			Admin admin = getAdminDetails();
			model.registerAdmin(admin);
			System.out.println("Admin registered successfully!!");
		}
		else if(choice == 2) {
			User user = getUserDetails();
			if(model.isUserAlreadyRegistered(user.getEmail())) {
				System.out.println("User with this email already exists!!");
				return null;
			}
			else {
				model.registerUser(user);
				System.out.println("User registered succesfully!!");
				return user;
			}
		}
		return null;
	}

	private User getUserDetails() {
		System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        return new User(name, email, password);
	}

	private Admin getAdminDetails() {
		System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        return new Admin(name, email, password);
	}
}
