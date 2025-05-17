package com.theatre.features.browse;

public class BrowseView {

	private final BrowseModel model;
	
	public BrowseView() {
		model = new BrowseModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("browse view - " +model);
	}
}
