package com.cinema_paradise.features.login;

import java.util.Scanner;

import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.User;

public class LoginView {
	 private final LoginModel model;
	 private static final Scanner sc = new Scanner(System.in);

	 public LoginView() {
	    model = new LoginModel(this);
	 }

	public Object showLogin() {
		System.out.println("Login as (1. Admin / 2. User) : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter email : ");
		String email = sc.nextLine();
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		if(choice == 1) {
			Admin admin = model.validateAdminLogin(email, password);
			if(admin!=null) {
				System.out.println("Admin login successful.");
				return admin;
			}
			else {
				System.out.println("Invalid admin credentials.");
			}
		}
		else if(choice == 2) {
			User user = model.validateUserLogin(email, password);
			if(user!=null) {
				System.out.println("User login successful.");
				return user;
			}
			else {
				System.out.println("Invalid user credentials.");
			}
		}
		return null;
	}
}
