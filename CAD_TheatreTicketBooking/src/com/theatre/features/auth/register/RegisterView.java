package com.theatre.features.auth.register;

public class RegisterView {

	private final RegisterModel model;
	
	public RegisterView() {
		model = new RegisterModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Register view - " +model);
	}
}
