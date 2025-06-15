package com.cinema_paradise.features.admin.showtime;

public class ShowtimeView {
	 private final ShowtimeModel model;

	    public ShowtimeView() {
	        this.model = new ShowtimeModel(this);
	    }

	    public void init() {
	        model.init();
	        System.out.println("Showtime view initiated with model: " + model);
	    }
}
