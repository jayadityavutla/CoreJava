package com.scaler.advancejava.designPatterns.button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing AndroidButton");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking AndroidButton");
    }
}
