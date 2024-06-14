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
        util.fluentWait(OnboardingPage.skipButton,100000,1);
        onboarding.clickSkipButton();
        onboarding.clickPlayAsGuestButton();
        onboarding.clickTapHereToSkipButton();
    }

    @Test(description = "Verify sign in with google")
    public void verifySignInWithGoogle() {
        fantasyFootball.clickFantasyIcon();
        fantasyFootball.clickSigninWithGoogle();
        util.fluentWait(FantasyFootballPage.chooseAccount,10,1);
        fantasyFootball.clickChooseAccount();
        util.fluentWait(FantasyFootballPage.startPlaying,10000,1);
        fantasyFootball.clickStartPlaying();
        util.fluentWait(FantasyFootballPage.allowNotificatonButton,1000,1);
        fantasyFootball.clickAllowNotificatonbutton();
    }

    @Test(description = "Click on football icon and perform ")
    public void clickOnFootball() {
        util.fluentWait(FantasyFootballPage.footballIcon,20000,1);
        fantasyFootball.clickFootballIcon();
        fantasyFootball.clickMyMachesIcon();
        fantasyFootball.clickLeaderBoardIcon();
    }

    @Test(description = "Leaderboard actions")
    public void leaderboardActions() {
        util.fluentWait(FantasyFootballPage.pastWeek,10000,1);
        fantasyFootball.clickPastWeek();
//        util.scroll("up", 5);
//        util.fluentWait(FantasyFootballPage.scrollToTop,10000,1);
//        fantasyFootball.clickScrollToTop();
        util.fluentWait(FantasyFootballPage.nextWeek,10,1);
        for (int i = 0; i < 2; i++) {
            fantasyFootball.clickNextWeek();
        }

    }


    @Test(description = "Assertion check of last page text")
    public void stayTuneText(){
        try {
            Assert.assertEquals(fantasyFootball.getStayTunedText(),"Stay tuned for the next week's leaderboards.");
        }
        catch (AssertionError e) {
            throw e;
        }

    }



    @Test(description = "Exit app")
    public void exitApp(){
        fantasyFootball.clickExitButton();
        fantasyFootball.clickYesExitButton();
    }



}
