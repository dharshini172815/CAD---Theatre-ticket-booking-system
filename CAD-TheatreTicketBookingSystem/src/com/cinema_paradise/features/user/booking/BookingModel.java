package com.cinema_paradise.features.user.booking;

public class BookingModel {
	private final BookingView view;

    public BookingModel(BookingView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Booking model initiated with view: " + view);
    }
}
