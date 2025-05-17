package com.theatre.features.booking.selection;

public class SelectionView {

	private final SelectionModel model;
	
	public SelectionView() {
		model = new SelectionModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("selection view - " +model);
	}
}
