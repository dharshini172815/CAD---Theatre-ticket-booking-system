package com.cinema_paradise.features.user.booking.availability;

public class AvailabilityView {
	 private final AvailabilityModel model;

	    public AvailabilityView() {
	        this.model = new AvailabilityModel(this);
	    }

	    public void init() {
	        model.init();
	        System.out.println("Availability view initiated with model: " + model);
	    }
}
