package tests.android;

import appiumtests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.android.BlackJackMultiplayerPage;

import pages.android.OnboardingPage;

public class BlackJackMultiplayerTest extends BaseTest {
    BlackJackMultiplayerPage blackJackMultiplayer;
    OnboardingPage onboarding;

    @BeforeClass
    public void setUp() {
        onboarding = new OnboardingPage(driver);
        blackJackMultiplayer = new BlackJackMultiplayerPage(driver);
    }

    @Test(description = "Perform click action in multiplayer")
     public void clickMultiplayerButton() {
        onboarding.clickTapHereToSkipButton();
        blackJackMultiplayer.clickBlackjackButton();
        blackJackMultiplayer.clickMultiplayerButton();
    }
    @Test(description = "Assert no room text")
    public void assertNoRoomText() {
        try {
            Assert.assertEquals(blackJackMultiplayer.getNoRoomText(), "No rooms available");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(description = "Assert multiplayer room text")
    public void assertMultiplayerRoomText() {
        try {
            Assert.assertEquals(blackJackMultiplayer.getMultiplayerRoomText(), "Multiplayer rooms aren't available at the moment");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}