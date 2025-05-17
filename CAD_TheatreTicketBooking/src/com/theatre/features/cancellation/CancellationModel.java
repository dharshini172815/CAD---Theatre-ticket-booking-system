package com.theatre.features.cancellation;

public class CancellationModel {

	private final CancellationView view;
	
	public CancellationModel(CancellationView cancel_view) {
		view = cancel_view;
	}
	
	void init() {
		System.out.println("cancellation model - " +view);
	}
}
