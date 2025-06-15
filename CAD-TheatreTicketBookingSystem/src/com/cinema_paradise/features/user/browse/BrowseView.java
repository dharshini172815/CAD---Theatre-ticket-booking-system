package com.cinema_paradise.features.user.browse;

public class BrowseView {
	private final BrowseModel model;

    public BrowseView() {
        this.model = new BrowseModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Browse view initiated with model: " + model);
    }
}
