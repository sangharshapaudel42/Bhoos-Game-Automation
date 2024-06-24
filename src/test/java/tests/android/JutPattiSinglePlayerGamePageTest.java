package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.JutPattiSinglePlayerGamePage;
import pages.android.WelcomePage;

public class JutPattiSinglePlayerGamePageTest extends BaseTest {
    WelcomePage welcome;
    JutPattiSinglePlayerGamePage jutpatti;

    @BeforeClass
    public void setUpJutPattiSinglePlayer() {
        welcome = new WelcomePage(driver);
        jutpatti = new JutPattiSinglePlayerGamePage(driver);
    }

    @Test
    public void setWelcomeScreen() throws InterruptedException {


        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
        Thread.sleep(1000);
    }

    @Test
    public void verifyActionForJutPattiSinglePlayerGame() throws InterruptedException {
        Thread.sleep(2000);
        jutpatti.clickJutPattiIcon();
        Thread.sleep(1000);
        jutpatti.clickSinglePlayerIcon();
//        Thread.sleep(1000);
        jutpatti.clickArrangeIcon();
//        Thread.sleep(1000);
        jutpatti.clickHamBurgerIcon();

    }
}
