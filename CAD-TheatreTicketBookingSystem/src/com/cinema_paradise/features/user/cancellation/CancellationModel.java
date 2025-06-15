package com.cinema_paradise.features.user.cancellation;

public class CancellationModel {
	private final CancellationView view;

    public CancellationModel(CancellationView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Cancellation model initiated with view: " + view);
    }
}
