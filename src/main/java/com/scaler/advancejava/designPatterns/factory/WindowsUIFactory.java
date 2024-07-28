package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.factory.button.Button;
import com.scaler.advancejava.designPatterns.factory.button.WindowsButton;
import com.scaler.advancejava.designPatterns.factory.dropdown.DropDown;
import com.scaler.advancejava.designPatterns.factory.dropdown.WindowsDropDown;

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
