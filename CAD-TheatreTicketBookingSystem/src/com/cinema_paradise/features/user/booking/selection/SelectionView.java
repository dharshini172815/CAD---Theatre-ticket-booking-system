package com.cinema_paradise.features.user.booking.selection;

public class SelectionView {
	private final SelectionModel model;

    public SelectionView() {
        this.model = new SelectionModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Selection view initiated with model: " + model);
    }
}
