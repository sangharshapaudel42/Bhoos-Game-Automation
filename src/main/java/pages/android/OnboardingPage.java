package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Util;

public class OnboardingPage extends BasePage {
    private static final By skipButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]");
    private static final By playAsGuestButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Play as Guest\"]");
    private static final By tapHereToSkipButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Tap here to skip\"]");
    Util util;


    public OnboardingPage(AppiumDriver driver) {
        super(driver);
    }


    public void clickSkipButton() {

        util.fluentWait(OnboardingPage.skipButton, 100000, 1);

        click(skipButton);
    }

    public void clickPlayAsGuestButton() {

        click(playAsGuestButton);
    }

    public void clickTapHereToSkipButton() {

        click(tapHereToSkipButton);
    }
}
