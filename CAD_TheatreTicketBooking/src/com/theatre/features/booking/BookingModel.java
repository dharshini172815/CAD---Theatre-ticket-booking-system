package com.theatre.features.booking;

public class BookingModel {

	private final BookingView view;
	
	public BookingModel(BookingView bookingview) {
		view = bookingview;
	}
	
	void init() {
		System.out.println("booking model - " +view);
	}
}
