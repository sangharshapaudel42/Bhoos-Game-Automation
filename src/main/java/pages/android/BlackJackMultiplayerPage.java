package pages.android;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BlackJackMultiplayerPage extends BasePage {
    private static final By blackjackIcon = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"game-tile-blackjack-test-id\"]");
    private static final By multiplayerButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Multiplayer, Face-off real players\"]");
    private static final By noRoomText = AppiumBy.xpath("//android.widget.TextView[@text=\"No rooms available\"]");
    private static final By multiplayeRoomText = AppiumBy.xpath("//android.widget.TextView[@text=\"Multiplayer rooms aren't available at the moment\"]");




    public BlackJackMultiplayerPage(AppiumDriver driver) {
        super(driver);
    }


    public void clickBlackjackButton() {
        click(blackjackIcon);
    }
    public void clickMultiplayerButton() {
        click(multiplayerButton);
    }
    public String getNoRoomText() {
        return getText(noRoomText);
    }
    public String getMultiplayerRoomText() {
        return getText(multiplayeRoomText);
    }
}
