package com.theatre.features.browse.filter;

public class FilterModel {

	private final FilterView view;
	
	public FilterModel(FilterView filterview) {
		view = filterview;
	}
	
	void init() {
		System.out.println("filter model - " +view);
	}
}
