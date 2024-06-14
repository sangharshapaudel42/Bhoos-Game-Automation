package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class BlackJackSingleplayerPage extends BasePage {
    private static final By blackjackIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-blackjack-test-id\"]/android.widget.ImageView");
    private static final By singleplayerButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Single Player, Level up your skills\"]/android.view.ViewGroup[2]");
    private static final By hamburgerButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"in-game-hamburger-id\"]/android.widget.ImageView");
    private static final By startNewGameButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[116]");
    private static final By maxButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"MAX\"]/android.view.ViewGroup");
    private static final By betbutton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[111]/android.view.ViewGroup/android.widget.ImageView");
    //implicitwait needed or explicit wait unitl play again button
    private static final By playAgainButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"PLAY AGAIN\"]");
    private static final By changeBotsButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Change Bots\"]");
    private static final By deleteBotButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.widget.ImageView");
    private static final By addBotButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup");
    private static final By chooseBotButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Gabbar\"]");
    private static final By startButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start\"]/android.view.ViewGroup");
    private static final By settingButton = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"settings-test-id\"]");

    public BlackJackSingleplayerPage(AppiumDriver driver) {

        super(driver);
    }


    public void clickBlackjackButton() {

        click(blackjackIcon);
    }

    public void clickSingleplayerButton() {

        click(singleplayerButton);
    }

    public void clickHamburgerButton() {

        click(hamburgerButton);
    }

    public void clickStartnewgameButton() {

        click(startNewGameButton);
    }

    public void clickMaxButton() {

        click(maxButton);
    }

    public void clickBetButton() {

        click(betbutton);
    }

    public void clickPlayAgainButton() {

        click(playAgainButton);
    }

    public void clickChangebotsButton() {
        clickHamburgerButton();

        click(changeBotsButton);
    }

    public void clickDeletebotButton() {

        click(deleteBotButton);
    }

    public void clickAddBotButton() {

        click(addBotButton);
    }

    public void clickChooseBot() {

        click(chooseBotButton);
    }

    public void clickStartButton() {

        click(startButton);
    }

    public void clickSettingBotton() {
        clickHamburgerButton();
        click(settingButton);
    }

}
