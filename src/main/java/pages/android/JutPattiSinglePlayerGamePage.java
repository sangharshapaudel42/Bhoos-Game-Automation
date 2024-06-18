package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class JutPattiSinglePlayerGamePage extends BasePage {
    private static final By jutPattiIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-jutpatti-test-id\"]/android.widget.ImageView");
    private static final By singlePlayerIcon = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Single Player, Level up your skills\"]/android.view.ViewGroup[2]");
    private static final By arrangeIcon = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[55]/android.view.ViewGroup/android.widget.ImageView");
    private static final By hamBurgerIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]/android.widget.ImageView");
    private static final By settingsIcon = AppiumBy.xpath("//*[contains(@content-desc, 'Settings')]");

    public JutPattiSinglePlayerGamePage(AppiumDriver driver) {
        super(driver);
    }

    public void clickJutPattiIcon() throws InterruptedException {
        click(jutPattiIcon);
    }

    public void clickSinglePlayerIcon() throws InterruptedException {
        click(singlePlayerIcon);
    }

    public void clickArrangeIcon() throws InterruptedException {
//        waitForElementToBeClickable(arrangeIcon, Duration.ofSeconds(10));
        click(arrangeIcon);
    }

    public void clickHamBurgerIcon() throws InterruptedException {
//        waitForElementToBeClickable(hamBurgerIcon, Duration.ofSeconds(10));
        click(hamBurgerIcon);
    }

}
