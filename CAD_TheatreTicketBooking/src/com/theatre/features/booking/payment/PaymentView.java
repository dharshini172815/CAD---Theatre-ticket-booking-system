package com.theatre.features.booking.payment;

public class PaymentView {

	private final PaymentModel model;
	
	public PaymentView() {
		model = new PaymentModel(this);
	}
	
	public void init() {
		model.init() ;
		System.out.println("payment view - " +model);
	}
}
