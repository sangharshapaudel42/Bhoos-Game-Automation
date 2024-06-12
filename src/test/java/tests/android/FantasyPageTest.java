package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.FantasyPage;
import pages.android.WelcomePage;

public class FantasyPageTest extends BaseTest {
    WelcomePage welcome;
    FantasyPage fantasy;

    @BeforeClass
    public void setUpJutPattiSinglePlayer() {
        welcome = new WelcomePage(driver);
        fantasy = new FantasyPage(driver);
    }

    @Test
    public void setWelcomeScreen() throws InterruptedException {

        welcome.clickSkipButton();
        Thread.sleep(1000);
        welcome.clickPlayAsGuest();
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
        Thread.sleep(1000);
    }

    @Test
    public void verifyActionForFantasyPage() throws InterruptedException {
        Thread.sleep(1000);
//
        fantasy.clickFantasyPageIcon();
        Thread.sleep(1000);
        fantasy.clickSignInWithGoogle();
        Thread.sleep(1000);
        fantasy.clickChooseAnAccount();
        Thread.sleep(1000);
        fantasy.clickStartPlayingBtn();
        Thread.sleep(1000);
        fantasy.clickAllowBtn();
        Thread.sleep(3000);
        fantasy.clickMyMatches();
        Thread.sleep(1000);
        fantasy.clickJoinAMatchBtn();
        Thread.sleep(1000);
        fantasy.clickLeaderBoard();
        Thread.sleep(1000);
        fantasy.clickPastWeekLeftArrow();
        Thread.sleep(1000);
        fantasy.clickCurrentWeekRightArrow();
        Thread.sleep(1000);
        fantasy.clickNextWeekRightArrow();
        Thread.sleep(2000);
        fantasy.clickCrossSymbol();
        fantasy.clickYesExitBtn();
        Thread.sleep(3000);
    }
}


