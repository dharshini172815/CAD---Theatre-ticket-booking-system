package com.theatre.features.booking.selection;

public class SelectionModel {

	private final SelectionView view;
	
	public SelectionModel(SelectionView selectionview) {
		view = selectionview;
	}
	
	void init() {
		System.out.println("selection model - " +view);
	}
}
