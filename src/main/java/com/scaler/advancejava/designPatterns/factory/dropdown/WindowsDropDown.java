package com.scaler.advancejava.designPatterns.factory.dropdown;

public class WindowsDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Show Windows Drop Down");
    }

    @Override
    public void clickDropDown() {
        System.out.println("Click Windows Drop Down");
    }
}
