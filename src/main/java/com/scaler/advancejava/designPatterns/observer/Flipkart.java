package com.scaler.advancejava.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    public static Flipkart instance = null;
    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    private Flipkart() {

    }

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    public void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    public void unregisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced() {
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber : onOrderPlacedSubscribers){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
