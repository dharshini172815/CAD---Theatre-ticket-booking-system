package com.cinema_paradise.features.user.browse.filter;

public class FilterView {
	private final FilterModel model;

    public FilterView() {
        this.model = new FilterModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Filter view initiated with model: " + model);
    }
}
