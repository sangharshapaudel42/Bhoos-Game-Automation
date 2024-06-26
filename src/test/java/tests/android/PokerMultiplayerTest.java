package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.BlackJackSingleplayerPage;
import pages.android.OnboardingPage;
import pages.android.PokerMultiplayerPage;

public class PokerMultiplayerTest extends BaseTest {
    PokerMultiplayerPage pokerMultiplayer;
    OnboardingPage onboarding;

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
        pokerMultiplayer.clickHamburgerButton();
        pokerMultiplayer.clickSettingButton();
        pokerMultiplayer.clickSoundButton();
        pokerMultiplayer.clickVibrationButton();



    }




}
