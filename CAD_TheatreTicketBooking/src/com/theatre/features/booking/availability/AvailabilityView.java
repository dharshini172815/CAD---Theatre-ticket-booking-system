package com.theatre.features.booking.availability;

public class AvailabilityView {

	private final AvailabilityModel model;
	
	public AvailabilityView() {
		model = new AvailabilityModel(this);
	}
	public void init() {
		model.init();
		System.out.println("availability view - " +model);
	}
}
