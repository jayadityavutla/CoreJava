package com.scaler.advancejava.designPatterns.observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber{
    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Generate Invoice for Order Placed");
    }
}
