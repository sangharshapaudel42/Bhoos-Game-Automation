package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.BlackJackSingleplayerPage;
import pages.android.OnboardingPage;

public class BlackJackSingleplayerTest extends BaseTest {
    BlackJackSingleplayerPage blackJackSingleplayer;
    OnboardingPage onboarding;

    @BeforeClass
    public void setUp() {
        onboarding = new OnboardingPage(driver);
        blackJackSingleplayer = new BlackJackSingleplayerPage(driver);


    }


    @Test(description = "Start playing and complete playing")
    public void startPlayingAndCompletePlaying() {
        onboarding.clickTapHereToSkipButton();
        blackJackSingleplayer.clickBlackjackButton();
        blackJackSingleplayer.clickSingleplayerButton();
        blackJackSingleplayer.clickMaxButton();
        blackJackSingleplayer.clickBetButton();
    }


}
