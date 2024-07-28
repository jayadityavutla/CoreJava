package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.factory.button.Button;
import com.scaler.advancejava.designPatterns.factory.dropdown.DropDown;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
}
