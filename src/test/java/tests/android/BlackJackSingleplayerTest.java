package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.BlackJackSingleplayerPage;
import pages.android.OnboardingPage;
import utils.Util;

public class BlackJackSingleplayerTest extends BaseTest {
    BlackJackSingleplayerPage blackJack;
    Util util;
    OnboardingPage onboarding;

    @BeforeClass
    public void setUp() {
        onboarding = new OnboardingPage(driver);
        blackJack = new BlackJackSingleplayerPage(driver);
        util = new Util(driver);

    }

    @Test(description = "onboarding")
    public void onboarding() {
        util.fluentWait(OnboardingPage.skipButton,10,1);
        onboarding.clickSkipButton();
        onboarding.clickPlayAsGuestButton();
        onboarding.clickTapHereToSkipButton();
    }

    @Test(description = "Start playing and complete playing")
    public void startPlayingAndCompletePlaying() {
        blackJack.clickBlackjackButton();
        blackJack.clickSingleplayerButton();
        blackJack.clickMaxButton();
        blackJack.clickBetButton();
    }


}
