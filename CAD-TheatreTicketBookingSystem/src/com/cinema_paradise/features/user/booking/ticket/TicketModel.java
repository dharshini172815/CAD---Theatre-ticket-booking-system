package com.cinema_paradise.features.user.booking.ticket;

public class TicketModel {
	 private final TicketView view;

	    public TicketModel(TicketView view) {
	        this.view = view;
	    }

	    public void init() {
	        System.out.println("Ticket model initiated with view: " + view);
	    }
}
