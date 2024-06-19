package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

//    private static final By selectGameText= AppiumBy.xpath("//android.widget.TextView[@text=\"Select any one game to start playing!\"]");
    private static final By tapHereToSkip= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Tap here to skip\"]");

    public WelcomePage(AppiumDriver driver) {
        super(driver);
    }



    public void clickTapHereToSkip() {
        click(tapHereToSkip);
    }
}
