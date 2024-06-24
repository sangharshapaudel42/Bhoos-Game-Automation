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

    @Test(description = "Verify sign in with google")
    public void verifySignInWithGoogle() {
        onboarding.clickTapHereToSkipButton();
        fantasyFootball.clickFantasyIcon();
        fantasyFootball.clickSigninWithGoogle();
        fantasyFootball.clickChooseAccount();
    }
    @Test(description = "Start playing")
    public void startPlaying() {
        fantasyFootball.clickStartPlaying();
        fantasyFootball.clickAllowNotificatonbutton();
    }

    @Test(description = "Click on football icon and click on different menu")
    public void clickOnFootball() {
        fantasyFootball.clickFootballIcon();
        fantasyFootball.clickMyMachesIcon();
        fantasyFootball.clickLeaderBoardIcon();
    }
@Test(description = "Click on leaderboard and assert current week ranking text")
    public void clickOnLeaderboard() {
        fantasyFootball.clickLeaderBoardIcon();
        try {
            Assert.assertEquals(fantasyFootball.getCurrentWeekRankingText(), "Weekly leaderboard ranking are not final yet.");
        } catch (AssertionError e) {
            throw e;
        }
    util.scroll("down", 5);
    fantasyFootball.clickScrollToTop();
    }

    @Test(description = "Click on past week and assert past week ranking text")
    public void clickOnPastWeek() {
        fantasyFootball.clickPastWeek();
        try {
            Assert.assertEquals(fantasyFootball.getPastWeekRankingText(), "Weekly leaderboard rankings are final.");
        } catch (AssertionError e) {
            throw e;
        }
        util.scroll("down", 5);
        fantasyFootball.clickScrollToTop();
    }

    @Test(description = "Click on next week")
    public void clickOnNextWeek() {
        fantasyFootball.clickNextWeek();
    }

    @Test(description = "Assertion check of last page text")
    public void stayTuneText() {
        try {
            System.out.println(fantasyFootball.getStayTunedText());
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
