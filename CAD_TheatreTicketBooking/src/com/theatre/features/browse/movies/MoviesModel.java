package com.theatre.features.browse.movies;

public class MoviesModel {

	private final MoviesView view;
	
	public MoviesModel(MoviesView moviesview) {
		view = moviesview;
	}
	
	void init() {
		System.out.println("movies model - " +view);
	}
}
