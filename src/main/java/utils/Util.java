package utils;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class Util extends BasePage {
    private static WebDriverWait wait;


    public Util(AppiumDriver driver) {

        super(driver);
    }

    //Tap by using coordinate
    public void tapByCoordinates(int x, int y) {
        Point centerOfElement = new Point(x, y);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tapSequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tapSequence));

    }

    //swipe gesture right to left
    public void swipe() {
        //Get the screen size
        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();

        //calculate start and end point as a percentage of the screen
        int startX = (int) (width * 0.2);
        int startY = (int) (height * 0.5);
        int endX = (int) (width * 0.7);
        int endY = startY; //y should be constant as to do horizontal swipe

        //swipe gesture
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipeSequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(150)))
                .addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        System.out.println("swipe sequence");
        //perform the swipe
        driver.perform(Collections.singletonList(swipeSequence));

    }

    //fluent wait
    public WebElement fluentWait(By locator, int timeout, int pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofMillis(timeout))
                .pollingEvery(Duration.ofMillis(pollingTime))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //Scroll to bottom or top and time of scroll
    public void scroll(String direction, int times) {
        if (times <= 0) {
            throw new IllegalArgumentException("The number of times to scroll must be greater than zero");
        }

        Dimension dimension = driver.manage().window().getSize();
        int startX = (int) (dimension.width * 0.5);
        int startY, endY;

        if ("down".equalsIgnoreCase(direction)) {
            startY = (int) (dimension.height * 0.8);
            endY = (int) (dimension.height * 0.2);
        } else if ("up".equalsIgnoreCase(direction)) {
            startY = (int) (dimension.height * 0.2);
            endY = (int) (dimension.height * 0.8);
        } else {
            throw new IllegalArgumentException("Invalid direction: " + direction + " Use 'up' or 'down'");
        }

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i < times; i++) {
            Sequence scroll = new Sequence(finger, 1)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        }
    }
}


