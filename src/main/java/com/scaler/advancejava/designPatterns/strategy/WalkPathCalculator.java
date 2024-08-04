package com.scaler.advancejava.designPatterns.strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String from, String to) {
        System.out.println("Walk Path calculator" + from + " to " + to );
    }
}
