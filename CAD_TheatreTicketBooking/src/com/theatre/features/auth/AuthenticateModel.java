package com.theatre.features.auth;

public class AuthenticateModel {

	private final AuthenticateView view;
	
	public AuthenticateModel(AuthenticateView auth_view) {
		view = auth_view;
	}
	
	void init() {
		System.out.println("Authenticate model - " +view);
	}
}
