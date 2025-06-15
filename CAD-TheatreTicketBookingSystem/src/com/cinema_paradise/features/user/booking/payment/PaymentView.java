package com.cinema_paradise.features.user.booking.payment;

public class PaymentView {
	private final PaymentModel model;

    public PaymentView() {
        this.model = new PaymentModel(this);
    }

    public void init() {
        model.init();
        System.out.println("Payment view initiated with model: " + model);
    }
}
