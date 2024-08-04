package com.scaler.advancejava.designPatterns.observer;

public class InventoryService implements OnOrderPlacedSubscriber {
    public InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory on order Placed");
    }
}
