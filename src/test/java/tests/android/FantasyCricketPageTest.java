package tests.android;

import appiumtests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.android.FantasyCricketPage;
import pages.android.WelcomePage;


public class FantasyCricketPageTest extends BaseTest {
    WelcomePage welcome;
    FantasyCricketPage fantasy;


    @BeforeClass
    public void setUpCricketFantasyPage() {
        welcome = new WelcomePage(driver);
        fantasy = new FantasyCricketPage(driver);

    }

    @Test(description = "Verify onboarding process")

    public void setWelcomeScreen() throws InterruptedException {


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
        Thread.sleep(1000);
        fantasy.clickMyMatches();
    }

    @Test(description = "Checking text for the my matches page")

    public void myMatchesText1() throws InterruptedException {
        Thread.sleep(2000);
        try {
            Assert.assertEquals(fantasy.getMyMatchesText1(), "Whoops! You haven't joined any cricket matches");
        }
        catch (AssertionError e){
            throw e;
        }
    }



    @Test(description ="Checking text for my matches page")

    public void myMatchesText2() throws InterruptedException {
        Thread.sleep(1000);
        try {
            Assert.assertEquals(fantasy.getMyMatchesText2(), "Try joining a new match in the explore page.");
        }
        catch (AssertionError e){
            throw e;
        }
        finally {
            fantasy.clickJoinAMatchBtn();
            Thread.sleep(1000);
        }
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

    @Test(description = "Verify text for leaderboard page")
    public void leaderboardText1() throws InterruptedException{
        Thread.sleep(1000);
        try {
            Assert.assertEquals(fantasy.getLeaderboardText1(),"Stay tuned for the next week's leaderboards.");
        }
        catch (AssertionError e){
            throw e;
        }

    }

    @Test(description = "Verify text for leaderboard page")
    public void leaderboardText2() throws InterruptedException{
        Thread.sleep(1000);
        try {
            Assert.assertEquals(fantasy.getLeaderboardText2(),"Get ready to compete in our next week's weekly leaderboard");
        }
        catch (AssertionError e){
            throw e;
        }

    }

    @Test(description = "Action for exit app")
    public void exitAppAction() throws InterruptedException {
        Thread.sleep(1000);
        fantasy.clickCrossSymbol();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(fantasy.getExitAppText(),"Are you sure you want to exit?Exiting will take you back to Bhoos Games app.");
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


