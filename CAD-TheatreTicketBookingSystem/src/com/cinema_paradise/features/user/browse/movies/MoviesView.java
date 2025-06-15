package com.cinema_paradise.features.user.browse.movies;

public class MoviesView {
	private final MoviesModel model;

    public MoviesView() {
        this.model = new MoviesModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Movies view initiated with model: " + model);
    }
}
