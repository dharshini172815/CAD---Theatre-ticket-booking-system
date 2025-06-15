package com.cinema_paradise.features.admin.seat;

public class SeatModel {
	 private final SeatView view;

	    public SeatModel(SeatView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Seat model initiated with view: " + view);
	    }
}
