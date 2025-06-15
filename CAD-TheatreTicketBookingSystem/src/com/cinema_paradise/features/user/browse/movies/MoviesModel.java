package com.cinema_paradise.features.user.browse.movies;

public class MoviesModel {
	private final MoviesView view;

    public MoviesModel(MoviesView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Movies model initiated with view: " + view);
    }
}
