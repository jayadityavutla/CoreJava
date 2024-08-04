package com.scaler.advancejava.designPatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String from, String to) {
        System.out.println("Car Path calculator " + from + " to " + to );
    }
}
