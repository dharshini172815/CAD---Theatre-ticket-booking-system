package com.cinema_paradise.features.admin.movie;

public class MovieModel {
	 private final MovieView view;

	    public MovieModel(MovieView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Movie model initiated with view: " + view);
	    }
}
