package com.theatre.features.admin.seat;

public class SeatView {

	private final SeatModel model;
	
	public SeatView() {
		model = new SeatModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Seat view - " +model);
	}
}
