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
        try {
            Assert.assertEquals(fantasyFootball.getCurrentWeekRankingText(), "Weekly leaderboard ranking are final.");
        } catch (AssertionError e) {
            throw e;
        }
        finally {
            util.scroll("down", 5);
        }
        util.scroll("down", 5);
        fantasyFootball.clickScrollToTop();
        fantasyFootball.clickPastWeek();
        try {
            Assert.assertEquals(fantasyFootball.getPastWeekRankingText(), "Weekly leaderboard ranking are final.");
        } catch (AssertionError e) {
            throw e;
        }
        finally {
            util.scroll("down", 5);
        }
        util.scroll("down", 5);
        fantasyFootball.clickScrollToTop();
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
        finally {
            exitApp();
        }

    }


    @Test(description = "Exit app")
    public void exitApp() {
        fantasyFootball.clickExitButton();
        fantasyFootball.clickYesExitButton();
    }


}
