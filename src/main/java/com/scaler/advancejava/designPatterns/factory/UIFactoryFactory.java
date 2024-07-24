package com.scaler.advancejava.designPatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryUsingPlatformName(SupportedPlatforms platformName) {
        if(platformName == SupportedPlatforms.ANDROID) {
            return new AndroidUIFactory();
        }
        else if(platformName == SupportedPlatforms.IOS) {
            return new IOSUIFactory();
        }
        else {
            return new WindowsUIFactory();
        }
    }
}
