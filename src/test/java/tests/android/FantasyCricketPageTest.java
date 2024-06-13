package tests.android;

import appiumtests.BaseTest;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.android.FantasyPage;
import pages.android.WelcomePage;
import utils.Util;

import java.util.concurrent.TimeUnit;

public class FantasyPageTest extends BaseTest {
    WelcomePage welcome;
    FantasyPage fantasy;
    Util util;

    @BeforeClass
    public void setUpJutPattiSinglePlayer() {
        welcome = new WelcomePage(driver);
        fantasy = new FantasyPage(driver);
        util= new Util(driver);
    }

    @Test
    public void setWelcomeScreen() throws InterruptedException {
        Thread.sleep(1000);
        welcome.clickSkipButton();
        Thread.sleep(1000);
        welcome.clickPlayAsGuest();
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
    }

    @Test
    public void ActionForCricketFantasyPage() throws InterruptedException {

        Thread.sleep(3000);
        fantasy.clickFantasyPageIcon();
        Thread.sleep(1000);
        fantasy.clickSignInWithGoogle();
        Thread.sleep(1000);
        fantasy.clickChooseAnAccount();
        Thread.sleep(1000);
        fantasy.clickStartPlayingBtn();
        Thread.sleep(1000);
        fantasy.clickAllowBtn();
        Thread.sleep(6000);
        try {
            fantasy.clickMyMatches();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        fantasy.clickMyMatches();

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


