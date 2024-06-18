package tests.android;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.WelcomePage;

public class WelcomePageTest extends BasePage {
    WelcomePage welcome;

    public WelcomePageTest(AppiumDriver driver) {
        super(driver);
    }

    @BeforeClass
    public void setWelcomePage() {
        welcome = new WelcomePage(driver);
    }

    @Test
    public void verifyActionForWelcomePage() throws InterruptedException {
        Thread.sleep(1000);
        welcome.clickSkipButton();
        Thread.sleep(2000);
        welcome.clickPlayAsGuest();
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
    }
}
