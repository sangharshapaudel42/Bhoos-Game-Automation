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
        onboarding.clickPlayasguestButton();
        onboarding.clickTapheretoskipButton();
    }

    @Test(description = "Verify sign in with google")
    public void verifySignInWithGoogle() {
        fantasyFootball.clickFantasyIcon();
        fantasyFootball.clickSigninWithGoogle();
        util.fluentWait(FantasyFootballPage.chooseAccount,10,1);
        fantasyFootball.clickChooseAccount();
        util.fluentWait(FantasyFootballPage.startPlaying,10000,1);
        fantasyFootball.clickStartPlaying();
    }

    @Test(description = "Click on football icon and perform ")
    public void clickOnFootball() {
        util.fluentWait(FantasyFootballPage.footballIcon,1500,1);
        fantasyFootball.clickFootballIcon();
        fantasyFootball.clickMyMachesIcon();
        fantasyFootball.clickLeaderBoardIcon();
    }

    @Test(description = "Leaderboard actions")
    public void leaderboardActions() {
        util.fluentWait(FantasyFootballPage.pastWeek,10000,1);
        fantasyFootball.clickPastWeek();
        util.scroll("up", 5);
        fantasyFootball.clickScrollToTop();
        util.fluentWait(FantasyFootballPage.nextWeek,10,1);
        for (int i = 0; i < 2; i++) {
            fantasyFootball.clickNextWeek();
        }
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
