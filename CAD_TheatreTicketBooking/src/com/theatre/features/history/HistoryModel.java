package com.theatre.features.history;

public class HistoryModel {
	private final HistoryView view;
	
	public HistoryModel(HistoryView historyview) {
		view = historyview;
	}
	
	void init() {
		System.out.println("history model - " +view);
	}

}
