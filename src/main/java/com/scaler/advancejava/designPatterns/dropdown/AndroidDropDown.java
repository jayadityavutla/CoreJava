package com.scaler.advancejava.designPatterns.dropdown;

public class AndroidDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("AndroidDropDown showDropDown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("AndroidDropDown clickDropDown");
    }
}
