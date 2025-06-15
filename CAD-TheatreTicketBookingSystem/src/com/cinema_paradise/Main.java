package com.cinema_paradise;

import java.util.Scanner;

import com.cinema_paradise.features.admin.AdminView;
import com.cinema_paradise.features.login.LoginView;
import com.cinema_paradise.features.register.RegisterView;
import com.cinema_paradise.features.user.UserView;
import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.User;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RegisterView registerView = new RegisterView();
		LoginView loginView = new LoginView();
		
		while(true) {
			System.out.println("\n* * * Welcome to Theatre ticket booking system * * *");
			System.out.println("------------------------------------------------------");
			System.out.println("\t  Cinema Paradise - version 0.0.1");
			System.out.println("------------------------------------------------------");
			System.out.println("1. Register \n2. Login \n3. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				Object registered = registerView.showRegistration();
				if(registered != null) {
					System.out.println("Do you want proceed to login? (yes/no) : ");
                    String response = sc.nextLine();
                    if (response.equalsIgnoreCase("yes")) {
                        Object login = loginView.showLogin();
                        if (login instanceof Admin) {
                        	new AdminView().showAdminMenu();
                        } else if (login instanceof User) {
                        	new UserView().showUserMenu();
                        }
                    }
				}
				break;
			case 2:
				Object login = loginView.showLogin();
                if (login instanceof Admin) {
                	new AdminView().showAdminMenu();
                } else if (login instanceof User) {
                	new UserView().showUserMenu();
                }
                break;
			case 3:
				System.out.println("Thank you for using this system....");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
		
	}
}

