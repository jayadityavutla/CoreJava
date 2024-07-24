package com.scaler.advancejava.designPatterns.factory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refresh UI");
    }

    void setTheme(){
        System.out.println("Set Theme");
    }

    public UIFactory getUIFactory(SupportedPlatforms platformName){
        if(platformName.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platformName.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        else{
            return new WindowsUIFactory();
        }
    }
}
