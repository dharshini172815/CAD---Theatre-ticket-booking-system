package com.theatre.features.admin.movie;

public class MovieModel {
	private final MovieView view;
	
	public MovieModel(MovieView movieview) {
		view = movieview;
	}
	
	void init() {
		System.out.println("Movie model - " +view);
	}
}
