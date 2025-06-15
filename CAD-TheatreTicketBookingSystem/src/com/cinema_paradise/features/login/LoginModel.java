package com.cinema_paradise.features.login;

import com.cinema_paradise.repository.db.CinemaParadiseDb;
import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.User;

public class LoginModel {
	 private final LoginView view;
	 private final CinemaParadiseDb db = CinemaParadiseDb.getInstance();

	 public LoginModel(LoginView view) {
	     this.view = view;
	 }

	 public void init() {}

	 public Admin validateAdminLogin(String email, String password) {
		return db.getAdmins().stream()
				.filter(admin -> admin.getEmail().equalsIgnoreCase(email) && admin.getPassword().equals(password))
				.findFirst()
				.orElse(null);
	 }

	 public User validateUserLogin(String email, String password) {
		return db.getUsers().stream()
				.filter(user -> user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password))
				.findFirst()
				.orElse(null);
	 }
}
