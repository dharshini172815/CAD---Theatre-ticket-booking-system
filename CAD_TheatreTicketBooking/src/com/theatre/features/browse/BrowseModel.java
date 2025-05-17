package com.theatre.features.browse;

public class BrowseModel {

	private final BrowseView view;
	
	public BrowseModel(BrowseView browseview) {
		view = browseview;
	}
	void init() {
		System.out.println("browse model - " +view);
	}
}
