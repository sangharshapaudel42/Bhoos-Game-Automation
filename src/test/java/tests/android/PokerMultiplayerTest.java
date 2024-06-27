package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.OnboardingPage;
import pages.android.PokerMultiplayerPage;
import utils.Util;

public class PokerMultiplayerTest extends BaseTest {
    PokerMultiplayerPage pokerMultiplayer;
    OnboardingPage onboarding;
    Util util;
    @BeforeClass
    public void setUp() {
        onboarding = new OnboardingPage(driver);
        pokerMultiplayer = new PokerMultiplayerPage(driver);
    }
    @Test(description = "Perform click action in multiplayer")
    public void clickMultiplayerButton() {
        onboarding.clickTapHereToSkipButton();
        pokerMultiplayer.clickPokerIcon();
        pokerMultiplayer.clickMultiplayerButton();
        pokerMultiplayer.clickPokerTable();
    }
    @Test(description = "Hamburger Setting button actions")
    public void hamburgerSettingButtonActions() {
        pokerMultiplayer.clickHamburgerButton();
        pokerMultiplayer.clickSettingButton();
        pokerMultiplayer.clickSoundButton();
        pokerMultiplayer.clickVibrationButton();
        util.scroll("down", 1);
        pokerMultiplayer.clickCloseButton();
    }

    @Test(description = "Hamburger Report Problem button actions")
    public void hamburgerReportProblemButtonActions() {
        pokerMultiplayer.clickHamburgerButton();
        pokerMultiplayer.clickReportProblemButton();
        util.tapByCoordinates(100, 100);
        pokerMultiplayer.clickHamburgerButton();
        pokerMultiplayer.clickQuitGameButton();
    }
    @Test(description = "Back button actions before entering the game")
    public void backButtonActions() {
        pokerMultiplayer.clickBackButton();
        pokerMultiplayer.clickLeaveGameButton();
    }



}
