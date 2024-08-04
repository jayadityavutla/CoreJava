package com.scaler.advancejava.designPatterns.decorator;

public class ChocoChips implements IceCream{
    IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 15;
    }
}
