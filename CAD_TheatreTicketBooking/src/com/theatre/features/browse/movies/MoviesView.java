package com.theatre.features.browse.movies;

public class MoviesView {
	private final MoviesModel model;
	
	public MoviesView() {
		model = new MoviesModel(this);
	}
	
	public void init() {
		model.init(); 
		System.out.println("movies view - " +model);
	}

}
