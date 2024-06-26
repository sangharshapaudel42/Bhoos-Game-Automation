package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class KittiSinglePlayerGamePage extends BasePage {
    private static final By kittiIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-kitti-test-id\"]/android.widget.ImageView");
    private static final By kittiSinglePlayerIcon = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Single Player, Level up your skills\"]/android.view.ViewGroup[2]");
    private static final By showIcon = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[61]/android.view.ViewGroup/android.widget.ImageView");
    private static final By kittiSHamBurgerIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]/android.widget.ImageView");
    private static final By saveAndQuit = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"save-and-quit-test-id\"]");

    public KittiSinglePlayerGamePage(AppiumDriver driver) {
        super(driver);
    }

    public void clickKittiIcon() throws InterruptedException {
        click(kittiIcon);
    }

    public void clickKittiSinglePlayerIcon() throws InterruptedException {
        click(kittiSinglePlayerIcon);
    }

    public void clickShowIcon() throws InterruptedException {
        click(showIcon);
    }

    public void clickKittiHamBurgerIcon() throws InterruptedException {
        click(kittiSHamBurgerIcon);
    }

    public void clickSaveAndQuitIcon() throws InterruptedException {
        click(saveAndQuit);
    }


}
