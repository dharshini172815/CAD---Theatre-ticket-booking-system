package com.theatre.features.auth;

public class AuthenticateView {

	private final AuthenticateModel model;
	
	public AuthenticateView() {
		model = new AuthenticateModel(this);
	}
	
	public void init() {
		System.out.println("Authenticate view - " +model);
	}
}
