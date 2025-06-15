package com.cinema_paradise.features.user.booking;

public class BookingView {
	private final BookingModel model;

    public BookingView() {
        this.model = new BookingModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Booking view initiated with model: " + model);
    }
}
