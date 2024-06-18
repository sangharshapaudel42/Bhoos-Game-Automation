package tests.android;

import appiumtests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.OnboardingPage;
import utils.Util;

public class OnboardingTest extends BaseTest {
    OnboardingPage onboarding;
    Util util;

    @BeforeClass
    public void setUp() {
        util = new Util(driver);
        onboarding = new OnboardingPage(driver);

    }

    @Test(description = "onboarding setup")
    public void onboardingSetup() throws InterruptedException {
        util.fluentWait(OnboardingPage.skipButton, 10, 1);
        onboarding.clickSkipButton();
        onboarding.clickPlayAsGuestButton();
        onboarding.clickTapHereToSkipButton();
    }
}
