package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import utils.Util;

public class FantasyFootballPage extends BasePage {
    //scroll to bottom
    public static final By stayTunedText = AppiumBy.xpath("//android.widget.TextView[@text=\"Stay tuned for the next week's leaderboards.\"]");
    private static final By chooseAccount = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]");
    //explicit wait
    private static final By startPlaying = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start Playing!\"]");
    //explicit wait
    private static final By footballIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"Football\"]");
    private static final By fanasyIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-fantasy-test-id\"]");
    private static final By signinWithGoogle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Sign in with Google\"]");
    private static final By allowNotificatonButton = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    //fluent wait
    private static final By myMachesIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"My Matches\"]");
    private static final By leaderboardIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"Leaderboard\"]");
    private static final By currentWeekRankingText = AppiumBy.xpath("//android.widget.TextView[@text=\"Weekly leaderboard rankings are not final yet.\"]");
    private static final By pastWeek = AppiumBy.xpath("//android.view.View[@content-desc=\"pastweek\"]");
   private static final By pastWeekRankingText = AppiumBy.xpath("//android.widget.TextView[@text=\"Weekly leaderboard rankings are final.\"]");
    //scroll to bottom
    private static final By scrollToTop = AppiumBy.xpath("//android.webkit.WebView[@text=\"Bhoos Fantasy\"]/android.view.View/android.widget.Button");
    private static final By nextWeek = AppiumBy.xpath("//android.view.View[@content-desc=\"nextweek\"]");
    //assertion
    private static final By exitButton = AppiumBy.xpath("//android.widget.Button[@text=\"svg%3e\"]");
    private static final By yesExitButton = AppiumBy.xpath("//android.widget.Button[@text=\"YES, EXIT\"]");

    private final Util util = new Util(driver);

    public FantasyFootballPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickFantasyIcon() {
        click(fanasyIcon);
    }

    public void clickSigninWithGoogle() {
        click(signinWithGoogle);
    }


    public void clickChooseAccount() {
        fluentWait(chooseAccount, 10, 1);
        click(chooseAccount);
    }

    public void clickStartPlaying() {
        fluentWait(startPlaying, 10000, 1);
        click(startPlaying);
    }

    public void clickAllowNotificatonbutton() {
        fluentWait(allowNotificatonButton, 1000, 1);

        click(allowNotificatonButton);
    }

    public void clickFootballIcon() {
        fluentWait(footballIcon, 2000000, 1);

        click(footballIcon);
    }

    public void clickMyMachesIcon() {
        click(myMachesIcon);
    }

    public void clickLeaderBoardIcon() {
        click(leaderboardIcon);
    }

    public String getCurrentWeekRankingText() {
        return getText(currentWeekRankingText);
    }

    public void clickPastWeek() {
        fluentWait(pastWeek, 10000, 1);
        click(pastWeek);
    }
    public String getPastWeekRankingText() {
        fluentWait(pastWeekRankingText, 10000, 1);
        return getText(pastWeekRankingText);
    }

    public void clickScrollToTop() {
        fluentWait(nextWeek, 10000, 1);
        click(scrollToTop);
    }

    public void clickNextWeek() {
       util.clickMultipleTimes(nextWeek, 2);
    }

    public String getStayTunedText() {
        return getText(stayTunedText);

    }

    public void clickExitButton() {
        click(exitButton);
    }

    public void clickYesExitButton() {
        click(yesExitButton);
    }
}
