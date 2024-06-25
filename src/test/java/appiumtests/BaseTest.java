package appiumtests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected Properties config;
    protected AppiumDriver driver;

    //Start appium driver
//    @BeforeSuite(alwaysRun = true,description = "Starting appium server")
//    private void startAppiumServer() {
//        AppiumServiceBuilder builder = new AppiumServiceBuilder()
//                .withIPAddress("127.0.0.1")
////                .usingAnyFreePort()
//                .usingPort(Integer.parseInt("4723"))
//                .withAppiumJS(new File("C:\\Users\\sangh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
//                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//                .withArgument(GeneralServerFlag.LOG_LEVEL,"debug");
//        try (AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder)) {
//            service.start();
//        }
//    }

    @BeforeClass(description = "Loading Confi and Driver")
    //Load config
    public void configSetup() throws MalformedURLException {
        InputStream inputConfig = getClass().getClassLoader().getResourceAsStream("config.properties");
        config = new Properties();
        try {
            config.load(inputConfig);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //initialize driver
        initializeDriver();
    }
    private void initializeDriver() throws MalformedURLException {
        try {
            // driver initialization
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", config.getProperty("TEST_PLATFORM_NAME"));
            caps.setCapability("appium:app", config.getProperty("APP_LOCATION"));
            caps.setCapability("udid", config.getProperty("DEVICE_UID"));
            caps.setCapability("platformVersion", config.getProperty("PLATFORM_VERSION"));
            caps.setCapability("automationName", config.getProperty("APP_AUTOMATION_NAME"));
            caps.setCapability("appActivity", config.getProperty("APP_ACTIVITY"));
            caps.setCapability("appPackage", config.getProperty("APP_PACKAGE"));
            caps.setCapability("deviceName", config.getProperty("DEVICE_NAME"));
            URI uri = new URI("http://127.0.0.1:4723/");
            driver = new AndroidDriver(uri.toURL(), caps);
            System.out.println("Driver Initialized");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException");
            throw e;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass(description = "Quiting Driver")
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit");

        }
    }

}
