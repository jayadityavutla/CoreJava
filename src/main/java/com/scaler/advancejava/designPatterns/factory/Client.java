package com.scaler.advancejava.designPatterns.factory;

import com.scaler.advancejava.designPatterns.factory.button.Button;
import com.scaler.advancejava.designPatterns.factory.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.clickDropDown();

        System.out.println("Debug here");
    }


}
