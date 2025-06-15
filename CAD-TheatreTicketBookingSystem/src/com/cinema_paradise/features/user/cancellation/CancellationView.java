package com.cinema_paradise.features.user.cancellation;

public class CancellationView {
	private final CancellationModel model;

    public CancellationView() {
        this.model = new CancellationModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Cancellation view initiated with model: " + model);
    }
}
