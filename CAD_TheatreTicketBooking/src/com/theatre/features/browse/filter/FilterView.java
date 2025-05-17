package com.theatre.features.browse.filter;

public class FilterView {

	private final FilterModel model;
	
	public FilterView() {
		model =  new FilterModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("filter view - " +model);
	}
}
