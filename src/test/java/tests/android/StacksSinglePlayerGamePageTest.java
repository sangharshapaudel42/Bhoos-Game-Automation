package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.StacksSinglePlayerGamePage;
import pages.android.WelcomePage;

public class StacksSinglePlayerGamePageTest extends BaseTest {
    WelcomePage welcome;
    StacksSinglePlayerGamePage stacks;

    @BeforeClass
    public void setUpStacksSinglePlayer(){
        welcome = new WelcomePage(driver);
        stacks = new StacksSinglePlayerGamePage(driver);
    }

    @Test
    public void setWelcomeScreen() throws InterruptedException{

        welcome.clickSkipButton();
        Thread.sleep(1000);
        welcome.clickPlayAsGuest();
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
        Thread.sleep(1000);
    }
    @Test
    public void verifyActionForStacksSinglePlayerGame() throws InterruptedException {
        Thread.sleep(2000);
        stacks.clickStacksIcon();
        Thread.sleep(1000);
        stacks.clickStacksSinglePlayerIcon();
//        Thread.sleep(1000);
        stacks.clickStacksHamBurgerIcon();
        Thread.sleep(1000);
        stacks.clickSaveAndQuit();
        Thread.sleep(1000);
    }
}
