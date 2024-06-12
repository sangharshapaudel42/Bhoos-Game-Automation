package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.KittiSinglePlayerGamePage;
import pages.android.WelcomePage;

public class KittiSinglePlayerGamePageTest extends BaseTest {
    WelcomePage welcome;
    KittiSinglePlayerGamePage kitti;

    @BeforeClass
    public void setUpKittiSinglePlayer(){
        welcome = new WelcomePage(driver);
        kitti = new KittiSinglePlayerGamePage(driver);
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
    public void verifyActionForKittiSinglePlayerGame() throws InterruptedException {
        Thread.sleep(2000);
        kitti.clickKittiIcon();
        Thread.sleep(1000);
        kitti.clickKittiSinglePlayerIcon();
        Thread.sleep(1000);
        kitti.clickShowIcon();
        Thread.sleep(500);
        kitti.clickKittiHamBurgerIcon();
        kitti.clickSaveAndQuitIcon();
        Thread.sleep(1000);

    }
}

