package com.scaler.advancejava.designPatterns.button;

public class IOSButton implements Button {
    @Override
    public void showButton() {
        System.out.println("showing IOSButton");
    }

    @Override
    public void clickButton() {
        System.out.println("click IOSButton");
    }
}
