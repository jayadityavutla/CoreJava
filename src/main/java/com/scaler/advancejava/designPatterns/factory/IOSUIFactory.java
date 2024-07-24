package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.button.Button;
import com.scaler.advancejava.designPatterns.dropdown.DropDown;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
