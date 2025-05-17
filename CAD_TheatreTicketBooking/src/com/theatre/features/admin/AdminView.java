package com.theatre.features.admin;

public class AdminView {

	private final AdminModel model;
	
	public AdminView() {
		model = new AdminModel(this) ;
	}
	
	public void init() {
		model.init();
		System.out.println("Admin view - " +model);
	}
}
