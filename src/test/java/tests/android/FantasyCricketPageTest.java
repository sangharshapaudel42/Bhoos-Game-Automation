package tests.android;

import appiumtests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.android.FantasyCricketPage;
import pages.android.WelcomePage;
import utils.Util;

public class FantasyCricketPageTest extends BaseTest {
    WelcomePage welcome;
    FantasyCricketPage fantasy;
    Util util;

    @BeforeClass
    public void setUpCricketFantasyPage() {
        welcome = new WelcomePage(driver);
        fantasy = new FantasyCricketPage(driver);
        util= new Util(driver);
    }

    @Test(description = "Verify onboarding process")

    public void setWelcomeScreen() throws InterruptedException {

        welcome.clickSkipButton();
        Thread.sleep(1000);
        welcome.clickPlayAsGuest();
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
        Thread.sleep(1000);
    }

    @Test(description = "Click fantasy icon and link account")

    public void fantasyIconAndSignInWithGoogle() throws InterruptedException {

        fantasy.clickFantasyPageIcon();
        fantasy.clickSignInWithGoogle();
        fantasy.clickChooseAnAccount();
        fantasy.clickStartPlayingBtn();
        fantasy.clickAllowBtn();
    }

    @Test(description = "click my matches and join a match button")

    public void myMatchesAction() throws InterruptedException {
        Thread.sleep(5000);
        fantasy.clickMyMatches();
        Thread.sleep(1000);
        fantasy.clickJoinAMatchBtn();
        Thread.sleep(1000);
    }



    @Test(description = "Verify flow for leaderboard action")

    public void leaderboardAction() throws InterruptedException {
        Thread.sleep(3000);
        fantasy.clickLeaderBoard();
        Thread.sleep(1000);
        fantasy.clickPastWeekLeftArrow();
        Thread.sleep(1000);
        fantasy.clickCurrentWeekRightArrow();
        Thread.sleep(1000);
        fantasy.clickNextWeekRightArrow();
        Thread.sleep(2000);

    }

    @Test(description = "Action for exit app")

    public void exitAppAction() throws InterruptedException {
        fantasy.clickCrossSymbol();
        Thread.sleep(1000);
        try {
            Assert.assertEquals(fantasy.verifyExitAppTest(),"Are you sure you want to exit?Exiting will take you back to Bhoos Games app.");
        }
        catch (AssertionError e){
            throw e;
        }
        finally {
            Thread.sleep(1000);
            fantasy.clickYesExitBtn();
            Thread.sleep(3000);
        }
    }
}


