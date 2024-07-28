package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.factory.button.AndroidButton;
import com.scaler.advancejava.designPatterns.factory.button.Button;
import com.scaler.advancejava.designPatterns.factory.dropdown.AndroidDropDown;
import com.scaler.advancejava.designPatterns.factory.dropdown.DropDown;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
