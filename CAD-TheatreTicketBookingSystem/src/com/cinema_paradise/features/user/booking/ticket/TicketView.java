package com.cinema_paradise.features.user.booking.ticket;

public class TicketView {
	 private final TicketModel model;

	    public TicketView() {
	        this.model = new TicketModel(this);
	    }

	    public void init() {
	        model.init();
	        System.out.println("Ticket view initiated with model: " + model);
	    }
}
