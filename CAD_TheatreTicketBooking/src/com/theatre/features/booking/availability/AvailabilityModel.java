package com.theatre.features.booking.availability;

public class AvailabilityModel {

	private final AvailabilityView view;
	
	public AvailabilityModel(AvailabilityView avail_view) {
		view = avail_view;
	}
	
	void init( ) {
		System.out.println("Availbility model -  " +view);
	}
}
