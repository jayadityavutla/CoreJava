package com.scaler.advancejava.designPatterns.dropdown;

public class IOSDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Show IOS Drop Down");
    }

    @Override
    public void clickDropDown() {
        System.out.println("Click IOS Drop Down");
    }
}
