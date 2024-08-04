package com.scaler.advancejava.designPatterns.decorator;

public class ChocolateCone implements IceCream{
    IceCream iceCream;

    public ChocolateCone(IceCream ic) {
        this.iceCream = ic;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate Cone";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }
}
