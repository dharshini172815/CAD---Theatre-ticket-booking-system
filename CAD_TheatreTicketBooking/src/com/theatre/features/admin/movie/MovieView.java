package com.theatre.features.admin.movie;

public class MovieView {

	private final MovieModel model;
	
	public MovieView() {
		model = new MovieModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Movie view - " +model);
	}
}
