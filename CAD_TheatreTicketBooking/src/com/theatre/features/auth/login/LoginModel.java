package com.theatre.features.auth.login;

public class LoginModel {

	private final LoginView view;
	
	public LoginModel(LoginView loginview) {
		view = loginview;
	}
	
	void init() {
		System.out.println("Login model - " +view);
	}
}
