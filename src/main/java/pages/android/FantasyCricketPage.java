package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FantasyCricketPage extends BasePage {

    private static final By fantasyIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-fantasy-test-id\"]/android.widget.ImageView");
    private static final By signInWithGoogle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Sign in with Google\"]/android.view.ViewGroup[2]/android.view.ViewGroup");
    private static final By chooseAnAccount = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[4]");
    private static final By startPlayingBtn = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start Playing!\"]/android.view.ViewGroup/android.view.View");
    private static final By allowBtn = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    private static final By myMatches = AppiumBy.xpath("//android.view.View[@content-desc=\"My Matches\"]");
    //Assertion for My matches page text
    private static final By myMatchesText1 = AppiumBy.xpath("//android.widget.TextView[@text=\"Whoops! You haven't joined any cricket matches\"]");
    private static final By myMatchesText2 = AppiumBy.xpath("////android.widget.TextView[@text=\"Try joining a new match in the explore page.\"]");
    private static final By joinAMatchBtn = AppiumBy.xpath("//android.widget.Button[@text=\"JOIN A MATCH\"]");
    private static final By leaderBoard = AppiumBy.xpath("//android.view.View[@content-desc=\"Leaderboard\"]/android.view.View");
    private static final By pastWeekLeftArrow = AppiumBy.xpath("//android.view.View[@content-desc=\"pastweek\"]/android.widget.Image");
    private static final By currentWeekRightArrow = AppiumBy.xpath("//android.view.View[@content-desc=\"nextweek\"]/android.widget.Image");
    private static final By nextWeekRightArrow = AppiumBy.xpath("//android.view.View[@content-desc=\"nextweek\"]/android.widget.Image");
    //Assertion for leaderboard page text
    private static final By leaderBoardText1 = AppiumBy.xpath("//android.widget.TextView[@text=\"Stay tuned for the next week's leaderboards.\"]");
    private static final By leaderBoardText2 = AppiumBy.xpath("//android.widget.TextView[@text=\"Get ready to compete in our next week's weekly leaderboard.\"]");
    private static final By crossSymbol = AppiumBy.xpath("//android.widget.Button[@text=\"svg%3e\"]");
    //Assertion for exit app page text
    private static final By exitAppText= AppiumBy.xpath("//android.widget.TextView[@text=\"Are you sure you want to exit? Exiting will take you back to Bhoos Games app.\"]");
    private static final By yesExitBtn = AppiumBy.xpath("//android.widget.Button[@text=\'YES, EXIT\']");



    public FantasyCricketPage(AppiumDriver driver){
        super(driver);
    }

    public void clickFantasyPageIcon() throws InterruptedException{
        Thread.sleep(6000);
        click(fantasyIcon);
    }

    public void clickSignInWithGoogle() {
        click(signInWithGoogle);
    }

    public void clickChooseAnAccount() {
        click(chooseAnAccount);
    }

    public void clickStartPlayingBtn() {
        click(startPlayingBtn);
    }

    public void clickAllowBtn() {
        click(allowBtn);
    }

    public void clickMyMatches() throws InterruptedException{
        Thread.sleep(1000);
        click(myMatches);
    }
    public String getMyMatchesText1(){
        return getText(myMatchesText1);
    }

    public String getMyMatchesText2(){
        return getText(myMatchesText2);
    }

    public void clickJoinAMatchBtn(){
        click(joinAMatchBtn);
    }

    public void clickLeaderBoard() {
        click(leaderBoard);
    }

    public void clickPastWeekLeftArrow() {
        click(pastWeekLeftArrow);
    }

    public void clickCurrentWeekRightArrow() {
        click(currentWeekRightArrow);
    }

    public void clickNextWeekRightArrow() {
        click(nextWeekRightArrow);
    }
    public String getLeaderboardText1(){
        return getText(leaderBoardText1);
    }

    public String getLeaderboardText2(){
        return getText(leaderBoardText2);
    }

    public void clickCrossSymbol(){
        click(crossSymbol);
    }
    public String getExitAppText(){
        return getText(exitAppText);
    }

    public void clickYesExitBtn(){
        click(yesExitBtn);
    }
}
