package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {
    private static final By skipButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]/android.view.ViewGroup/android.view.View");
    private static final By playAsGuest = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Play as Guest\"]");
    private static final By tapHereToSkip = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Tap here to skip\"]");

    public WelcomePage(AppiumDriver driver) {
        super(driver);
    }

    public void clickSkipButton() {
        click(skipButton);
    }

    public void clickPlayAsGuest() {
        click(playAsGuest);
    }

    public void clickTapHereToSkip() {
        click(tapHereToSkip);
    }
}
