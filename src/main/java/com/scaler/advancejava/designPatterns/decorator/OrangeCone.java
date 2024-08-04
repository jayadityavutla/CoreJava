package com.scaler.advancejava.designPatterns.decorator;

public class OrangeCone implements IceCream{
    IceCream iceCream;

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Orange Cone";
        }
        return iceCream.getDescription() + " + Orange Cone";
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 10;
        }
        return iceCream.getCost() + 10;
    }
}
