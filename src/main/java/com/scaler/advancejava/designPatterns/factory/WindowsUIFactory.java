package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.button.Button;
import com.scaler.advancejava.designPatterns.button.WindowsButton;
import com.scaler.advancejava.designPatterns.dropdown.DropDown;
import com.scaler.advancejava.designPatterns.dropdown.WindowsDropDown;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
