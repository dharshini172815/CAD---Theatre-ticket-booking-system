package com.cinema_paradise.features.admin.showtime;

public class ShowtimeModel {
	 private final ShowtimeView view;

	    public ShowtimeModel(ShowtimeView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Showtime model initiated with view: " + view);
	    }
}
