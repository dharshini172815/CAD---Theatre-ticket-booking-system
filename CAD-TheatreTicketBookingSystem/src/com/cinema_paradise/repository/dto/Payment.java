package com.cinema_paradise.repository.dto;

public class Payment {
	private String bookingId;
    private double amount;
    private String status;

    public Payment(String bookingId, double amount, String status) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.status = status;
    }

    public String getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}
