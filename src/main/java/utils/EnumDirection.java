package utils;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;

public class EnumDirection extends BasePage {

    public EnumDirection(AppiumDriver driver) {
        super(driver);
    }

    public enum direction {
        UP,
        DOWN,
        LEFT,
        RIGHT


    }


}
