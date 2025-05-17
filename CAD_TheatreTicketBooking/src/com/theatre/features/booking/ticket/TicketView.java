package com.theatre.features.booking.ticket;

public class TicketView {

	private final TicketModel model;
	
	public TicketView () {
		model = new TicketModel(this) ;
	}
	
	public void init() {
		model.init();
		System.out.println("ticket view - " +model);
	}
}
