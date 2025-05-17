package com.theatre.features.admin.showtime;

public class ShowtimeView {

	private final ShowtimeModel model;
	
	public ShowtimeView() {
		model = new ShowtimeModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("show time view - " +model);
	}
}
