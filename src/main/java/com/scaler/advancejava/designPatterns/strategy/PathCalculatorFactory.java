package com.scaler.advancejava.designPatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorForMode(Modes mode) {
        if(mode.equals(Modes.BIKE)){
            return new BikePathCalculator();
        }
        else if(mode.equals(Modes.CAR)){
            return new CarPathCalculator();
        }
        else return new WalkPathCalculator();
    }
}
