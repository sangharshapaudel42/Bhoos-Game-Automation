package utils;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;

public class TestEnum extends BasePage {


    public TestEnum(AppiumDriver driver) {
        super(driver);
    }

    public enum direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    //swipe method using above enum
    public void swipe(direction dir) {
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY, endY;
        switch (dir) {
            case UP:
                startY = (int) (dimension.height * 0.2);
                endY = (int) (dimension.height * 0.8);
                fingerAction(startX,endY,startY);
                break;
            case DOWN:
                startY = (int) (dimension.height * 0.8);
                endY = (int) (dimension.height * 0.2);
                fingerAction(startX,startY,endY);
                break;
            case LEFT:
                System.out.println("Swipe LEFT");
                break;
            case RIGHT:
                System.out.println("Swipe RIGHT");
                break;
        }
    }

    private void fingerAction(int startX, int startY, int endY) {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX,startY ))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(scroll));
    }
    
}






