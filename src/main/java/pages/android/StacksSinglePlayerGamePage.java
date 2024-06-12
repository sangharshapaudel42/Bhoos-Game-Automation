package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class StacksSinglePlayerGamePage extends BasePage {
    private static final By stacksIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-stacks-test-id\"]/android.widget.ImageView");
    private static final By stacksSinglePlayerIcon = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Single Player, Level up your skills\"]/android.view.ViewGroup[2]");
    private static final By stacksHamBurgerIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]/android.widget.ImageView");
    private static final By saveAndQuit = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='save-and-quit-test-id']");

    public StacksSinglePlayerGamePage(AppiumDriver driver){
        super(driver);
    }

    public void clickStacksIcon() throws InterruptedException {
        click(stacksIcon);
    }

    public void clickStacksSinglePlayerIcon() throws InterruptedException {
        click(stacksSinglePlayerIcon);
    }

    public void clickStacksHamBurgerIcon() throws InterruptedException {
        click(stacksHamBurgerIcon);
    }
    public void clickSaveAndQuit() {
        click(saveAndQuit);
    }

}
