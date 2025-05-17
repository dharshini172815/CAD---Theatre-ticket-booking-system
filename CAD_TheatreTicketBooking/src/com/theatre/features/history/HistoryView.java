package com.theatre.features.history;

public class HistoryView {

	private final HistoryModel model;
	
	public HistoryView() {
		model = new HistoryModel(this) ;
	}
	
	public void init() {
		model.init();
		System.out.println("history view - " +model);
	}
}
