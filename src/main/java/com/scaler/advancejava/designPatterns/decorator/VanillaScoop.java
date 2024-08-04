package com.scaler.advancejava.designPatterns.decorator;

public class VanillaScoop implements IceCream{
    IceCream iceCream;
    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Vanilla Scoop";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }
}
