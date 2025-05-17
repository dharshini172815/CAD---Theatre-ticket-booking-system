package com.theatre.features.cancellation;

public class CancellationView {

	private final CancellationModel model;
	
	public CancellationView() {
		model = new CancellationModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("cancellation view - " +model);
	}
}
