package com.cinema_paradise.features.admin.seat;

public class SeatView {
	  private final SeatModel model;

	    public SeatView() {
	        this.model = new SeatModel(this);
	    }

	    public void init() {
	        model.init();
	        System.out.println("Seat view initiated with model: " + model);
	    }
}
