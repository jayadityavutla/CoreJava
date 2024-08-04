package com.scaler.advancejava.designPatterns.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, Modes mode) {
        PathCalculatorStrategy pc;

        pc = PathCalculatorFactory.getPathCalculatorForMode(mode);
        pc.pathCalculator(source, destination);
    }
}
