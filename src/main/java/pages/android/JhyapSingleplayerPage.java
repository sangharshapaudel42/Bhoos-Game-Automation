package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class JhyapSingleplayerPage extends BasePage {
    private static final By jhyapIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-jhyap-test-id\"]");
    private static final By singlePlayerButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Single Player, Level up your skills\"]");
    private static final By hamburgerIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]");
    private static final By changeBotButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"change-bots-test-id\"]");


    public JhyapSingleplayerPage(AppiumDriver driver) {
        super(driver);
    }







}
