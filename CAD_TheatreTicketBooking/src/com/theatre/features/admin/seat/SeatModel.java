package com.theatre.features.admin.seat;

public class SeatModel {

	private final SeatView view;
	
	public SeatModel(SeatView seatview) {
		view = seatview;
	}
	
	void init() {
		System.out.println("Seat model - " +view);
	}
}
