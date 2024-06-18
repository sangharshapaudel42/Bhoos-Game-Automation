package tests.android;

import appiumtests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.FantasyFootballPage;
import pages.android.OnboardingPage;
import utils.Util;

public class FantasyFootballTest extends BaseTest {
    Util util;
    OnboardingPage onboarding;
    FantasyFootballPage fantasyFootball;

    @BeforeClass
    public void setUp() {
        util = new Util(driver);
        onboarding = new OnboardingPage(driver);
        fantasyFootball = new FantasyFootballPage(driver);
    }

    @Test(description = "onboarding")
    public void onboarding() {
        onboarding.clickSkipButton();
        onboarding.clickPlayAsGuestButton();
        onboarding.clickTapHereToSkipButton();

    }

    @Test(description = "Verify sign in with google")
    public void verifySignInWithGoogle() {
        fantasyFootball.clickFantasyIcon();
        fantasyFootball.clickSigninWithGoogle();
        fantasyFootball.clickChooseAccount();
        fantasyFootball.clickStartPlaying();
        fantasyFootball.clickAllowNotificatonbutton();
    }

    @Test(description = "Click on football icon and perform ")
    public void clickOnFootball() {
        fantasyFootball.clickFootballIcon();
        fantasyFootball.clickMyMachesIcon();
        fantasyFootball.clickLeaderBoardIcon();
    }

    @Test(description = "Leaderboard actions")
    public void leaderboardActions() {
        fantasyFootball.clickPastWeek();
        util.scroll("down", 5);
        fantasyFootball.clickScrollToTop();
        for (int i = 0; i < 2; i++) {
            fantasyFootball.clickNextWeek();
        }

    }


    @Test(description = "Assertion check of last page text")
    public void stayTuneText() {
        try {
            Assert.assertEquals(fantasyFootball.getStayTunedText(), "Stay tuned for the next week's leaderboards.");
        } catch (AssertionError e) {
            throw e;
        }

    }


    @Test(description = "Exit app")
    public void exitApp() {
        fantasyFootball.clickExitButton();
        fantasyFootball.clickYesExitButton();
    }


}
