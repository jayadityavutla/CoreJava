package com.scaler.advancejava.designPatterns.strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String from, String to) {
        System.out.println("Bike Path calculator" + from + " to " + to );
    }
}
