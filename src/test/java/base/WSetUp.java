package base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import util.Properties;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class WSetUp {
    /*static ChromeDriver driver;
    static ChromeOptions options;

    public static ChromeDriver getDriver() throws Exception {
        driver=deviceCapabilities();
        return driver;
    }
    public static ChromeDriver deviceCapabilities() throws Exception {
        System.setProperty(Properties.TIPO_DRIVER, Properties.CHROME_DRIVER_PATH);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        try {
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
            driver.navigate().to(Properties.URL_BODEGUERO_QA);
        } catch (Exception e) {
            throw new Exception("Error connecting to Selenium  : " + e.getMessage());
        }
        return driver;
    }*/
/*
    //@Before
    public void beforeScenario() {
        try {
            System.out.println("EN BEFORE WEB");
           deviceCapabilities();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    //@After
    public void afterScenario() {
        try {
            System.out.println("EN AFTER WEB");
            detenerDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    //public void detenerDriver() {
       // driver.quit();
    //}

}
