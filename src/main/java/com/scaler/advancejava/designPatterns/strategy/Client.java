package com.scaler.advancejava.designPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("T-Nagar", "Central", Modes.CAR);
    }
}
