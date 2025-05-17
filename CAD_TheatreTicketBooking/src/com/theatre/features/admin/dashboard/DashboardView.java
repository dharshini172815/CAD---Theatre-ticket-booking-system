package com.theatre.features.admin.dashboard;

public class DashboardView {

	private final DashboardModel model;
	
	public DashboardView() {
		model = new DashboardModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Dashboard view - " +model);
	}
}
