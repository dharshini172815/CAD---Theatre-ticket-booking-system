package com.theatre.features.auth.register;

public class RegisterModel {

	private final RegisterView view;
	
	public RegisterModel(RegisterView registerview) {
		view = registerview;
	}
	
	void init() {
		System.out.println("Register model - " +view);
	}
}
