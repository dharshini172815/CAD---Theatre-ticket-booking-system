package com.cinema_paradise.features.user.browse.filter;

public class FilterModel {
	private final FilterView view;

    public FilterModel(FilterView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Filter model initiated with view: " + view);
    }
}
