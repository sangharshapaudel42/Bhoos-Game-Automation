package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Util;

public class PokerMultiplayerPage extends BasePage {

    private static final By pokerIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-poker-test-id\"]");
    private static final By multiplayerButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Multiplayer, Face-off real players\"]");
    private static final By pokerTable = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Buy-in, 1000, Stakes, 0\"]");
    private static final By backButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
    private static final By leavegameButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Leave Game\"]");
    private static final By hamburgerButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]");
    private static final By settingButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"settings-test-id\"]");
    private static final By reportProblemButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"report-problem-test-id\"]");
    //random click on the screen
    private static final By quitGameButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"quit-game-test-id\"]");
    private static final By soundButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    //two time click
    private static final By vibrationButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
    //twotime click
    //scroll 1 time
    private static final By closeButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[62]");

    private final Util util = new Util(driver);
    public PokerMultiplayerPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickPokerIcon() {
        click(pokerIcon);
    }
    public void clickMultiplayerButton() {
        click(multiplayerButton);
    }
    public void clickPokerTable() {
        click(pokerTable);
    }
    public void clickBackButton() {
        click(backButton);
    }
    public void clickLeaveGameButton() {
        click(leavegameButton);
    }
    public void clickHamburgerButton() {
        fluentWait(hamburgerButton, 100000, 1);
        click(hamburgerButton);
    }
    public void clickSettingButton() {
        click(settingButton);
    }
    public void clickReportProblemButton() {
        click(reportProblemButton);
    }
    public void clickQuitGameButton() {
        click(quitGameButton);
    }
    public void clickSoundButton() {

        util.clickMultipleTimes(soundButton,2);
    }
    public void clickVibrationButton() {

        util.clickMultipleTimes(vibrationButton,2);
    }
    public void clickCloseButton() {
        click(closeButton);
    }

}

