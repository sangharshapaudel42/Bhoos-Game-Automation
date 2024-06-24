package tests.android;

import appiumtests.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.WelcomePage;

public class WelcomePageTest extends BaseTest {
    WelcomePage welcome;

    @BeforeClass
    public void setWelcomePage() {
        welcome = new WelcomePage(driver);
    }
    @Test(description = "Onboarding process and logging as guest")
    public void verifyActionForWelcomePage() throws InterruptedException{
        Thread.sleep(1000);
        welcome.clickTapHereToSkip();
    }
}
