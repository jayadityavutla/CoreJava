package com.scaler.advancejava.designPatterns.button;

public class WindowsButton implements Button {
    @Override
    public void showButton() {
        System.out.println("showing WindowsButton");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking WindowsButton");
    }
}
