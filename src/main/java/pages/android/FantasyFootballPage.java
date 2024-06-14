package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FantasyFootballPage extends BasePage {
    public static final By chooseAccount = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]");
    //explicit wait
    public static final By startPlaying = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start Playing!\"]");
    //explicit wait
    public static final By footballIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"Football\"]");
    private static final By fanasyIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-fantasy-test-id\"]");
    private static final By signinWithGoogle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Sign in with Google\"]");
    public static final By allowNotificatonButton = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    //fluent wait
    private static final By myMachesIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"My Matches\"]");
    private static final By leaderboardIcon = AppiumBy.xpath("//android.view.View[@content-desc=\"Leaderboard\"]");
    public static final By pastWeek = AppiumBy.xpath("//android.view.View[@content-desc=\"pastweek\"]");
    //scroll to bottom
    public static final By scrollToTop = AppiumBy.xpath("//android.webkit.WebView[@text=\"Bhoos Fantasy\"]/android.view.View/android.widget.Button");
    public static final By nextWeek = AppiumBy.xpath("//android.view.View[@content-desc=\"nextweek\"]");
    //scroll to bottom
    public static final By stayTunedText = AppiumBy.xpath("//android.widget.TextView[@text=\"Stay tuned for the next week's leaderboards.\"]");
    //assertion
    private static final By exitButton = AppiumBy.xpath("//android.widget.Button[@text=\"svg%3e\"]");
    private static final By yesExitButton = AppiumBy.xpath("//android.widget.Button[@text=\"YES, EXIT\"]");

    public FantasyFootballPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickFantasyIcon() {
        click(fanasyIcon);
    }

    public void clickSigninWithGoogle() {
        click(signinWithGoogle);
    }

    public void clickAllowNotificatonbutton(){
        click(allowNotificatonButton);
    }

    public void clickChooseAccount() {
        click(chooseAccount);
    }

    public void clickStartPlaying() {
        click(startPlaying);
    }

    public void clickFootballIcon() {
        click(footballIcon);
    }

    public void clickMyMachesIcon() {
        click(myMachesIcon);
    }

    public void clickLeaderBoardIcon() {
        click(leaderboardIcon);
    }

    public void clickPastWeek() {
        click(pastWeek);
    }

    public void clickScrollToTop() {
        click(scrollToTop);
    }

    public void clickNextWeek() {
        click(nextWeek);
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
