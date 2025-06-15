package com.cinema_paradise.features.user.browse;

public class BrowseModel {
	private final BrowseView view;

    public BrowseModel(BrowseView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Browse model initiated with view: " + view);
    }
}
