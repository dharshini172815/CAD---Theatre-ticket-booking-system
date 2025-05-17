package com.theatre.features.admin.showtime;

public class ShowtimeModel {

	private final ShowtimeView view;
	
	public ShowtimeModel(ShowtimeView showtimeview) {
		view = showtimeview;
	}
	void init() {
		System.out.println("show time model - " +view);
	}
}
