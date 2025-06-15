package com.cinema_paradise.features.user.history;

public class HistoryModel {
	private final HistoryView view;

    public HistoryModel(HistoryView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("History model initiated with view: " + view);
    }
}
