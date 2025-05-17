package com.theatre.features.booking;

public class BookingView {

	private final BookingModel model;
	
	public BookingView() {
		model = new BookingModel(this);
	}
	
	public void init( ) {
		model.init();
		System.out.println("booking view - " +model);
	}
}
