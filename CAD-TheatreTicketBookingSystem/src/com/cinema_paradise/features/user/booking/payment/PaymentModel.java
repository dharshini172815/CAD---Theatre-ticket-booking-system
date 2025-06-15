package com.cinema_paradise.features.user.booking.payment;

public class PaymentModel {
	private final PaymentView view;

    public PaymentModel(PaymentView view) {
        this.view = view;
    }

    public void init() {
        System.out.println("Payment model initiated with view: " + view);
    }
}
