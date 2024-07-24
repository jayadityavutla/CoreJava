package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.button.AndroidButton;
import com.scaler.advancejava.designPatterns.button.Button;
import com.scaler.advancejava.designPatterns.dropdown.AndroidDropDown;
import com.scaler.advancejava.designPatterns.dropdown.DropDown;

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
