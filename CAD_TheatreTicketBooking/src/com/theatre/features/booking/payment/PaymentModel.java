package com.theatre.features.booking.payment;

public class PaymentModel {

	private final PaymentView view;
	
	public PaymentModel(PaymentView paymentview) {
		view = paymentview;
	}
	
	void init() {
		System.out.println("payment model - " +view);
	}
}
