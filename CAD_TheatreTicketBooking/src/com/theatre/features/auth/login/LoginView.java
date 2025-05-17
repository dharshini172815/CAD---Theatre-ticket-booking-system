package com.theatre.features.auth.login;

public class LoginView {

	private final LoginModel model;
	
	public LoginView() {
		model = new LoginModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Login view - " +model);
	}
}
