package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.button.Button;
import com.scaler.advancejava.designPatterns.dropdown.DropDown;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
}
