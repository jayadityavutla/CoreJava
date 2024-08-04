package com.scaler.advancejava.designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator generator = new InvoiceGenerator();

        //It triggers announceOrderPlaced() for all the subscribers registered
        flipkart.onOrderPlaced();
    }
}
