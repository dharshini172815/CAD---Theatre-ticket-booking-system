package com.cinema_paradise.features.admin.movie;

public class MovieView {
	 private final MovieModel model;

	    public MovieView() {
	        this.model = new MovieModel(this);
	    }

	    public void init() {
	        model.init();
	        System.out.println("Movie view initiated with model: " + model);
	    }
}
