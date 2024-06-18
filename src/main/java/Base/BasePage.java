package Base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected final AppiumDriver driver;

    public BasePage(AppiumDriver driver) {

        this.driver = driver;

    }

    //Get text using locator
    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    //Click using locator
    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    //Send value using locator
    public void sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    //clear field text
    public void clearText(By locator) {
        driver.findElement(locator).clear();
    }


}
