package com.cinema_paradise.features.user.booking.availability;

public class AvailabilityModel {
	 private final AvailabilityView view;

	    public AvailabilityModel(AvailabilityView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Availability model initiated with view: " + view);
	    }
}
