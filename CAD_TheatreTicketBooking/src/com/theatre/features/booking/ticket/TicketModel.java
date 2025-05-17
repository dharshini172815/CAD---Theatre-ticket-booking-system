package com.theatre.features.booking.ticket;

public class TicketModel {

	private final TicketView view;
	
	public TicketModel(TicketView ticketview) {
		view = ticketview;
	}
	void init() {
		System.out.println("ticket model - " +view);
	}
}
