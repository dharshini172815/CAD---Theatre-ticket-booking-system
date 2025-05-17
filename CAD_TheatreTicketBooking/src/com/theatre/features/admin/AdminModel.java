package com.theatre.features.admin;

public class AdminModel {

	private final AdminView view;
	
	public AdminModel(AdminView adminview) {
		view = adminview;
	}
	
	void init() {
		System.out.println("Admin model - " +view);
	}
}
