package com.scaler.advancejava.designPatterns.decorator;

public class ButterScotchScoop implements IceCream{
    IceCream iceCream;
    public ButterScotchScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + ButterScotch scoop";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }
}
