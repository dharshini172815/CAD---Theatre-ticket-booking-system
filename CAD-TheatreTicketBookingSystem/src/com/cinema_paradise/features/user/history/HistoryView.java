package com.cinema_paradise.features.user.history;

public class HistoryView {
	private final HistoryModel model;

    public HistoryView() {
        this.model = new HistoryModel(this);
    }

    public void init() {
        model.init();
        System.out.println("History view initiated with model: " + model);
    }
}
