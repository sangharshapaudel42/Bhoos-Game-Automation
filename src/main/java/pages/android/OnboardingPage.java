package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class OnboardingPage extends BasePage {
    public static final By skipButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]");
    private static final By playAsGuestButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Play as Guest\"]");
    private static final By tapHereToSkipButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Tap here to skip\"]");


    public OnboardingPage(AppiumDriver driver) {
        super(driver);
    }


    public void clickSkipButton() {

        click(skipButton);
    }

    public void clickPlayAsGuestButton() {

        click(playAsGuestButton);
    }

    public void clickTapHereToSkipButton() {

        click(tapHereToSkipButton);
    }
}
