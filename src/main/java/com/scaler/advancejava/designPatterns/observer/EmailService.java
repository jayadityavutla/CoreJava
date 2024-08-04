package com.scaler.advancejava.designPatterns.observer;

public class EmailService implements OnOrderPlacedSubscriber{
    public EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending order email");
    }
}
