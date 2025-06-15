package com.cinema_paradise.features.user.booking.selection;

public class SelectionModel {
	private final SelectionView view;

    public SelectionModel(SelectionView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Selection model initiated with view: " + view);
    }
}
