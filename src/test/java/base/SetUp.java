package base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SetUp {
    Scenario scenario;

    @Before
    public void beforeScenario() {
        try {
            System.out.println("BEFORE MOBILE");
            deviceCapabilities();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @After
    public void afterScenario() {
        try {
            System.out.println("AFTER MOBILE");
            detenerDriver();
            stopAppium();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getProperty(String parameter) {
        return Resources.getProperty("android", parameter);
    }

    AppiumDriverLocalService service;
    private static AndroidDriver<MobileElement> mdriver;
    DesiredCapabilities capabilities;

    public void deviceCapabilities() throws Exception {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", getProperty("PLATFORM_NAME"));
        capabilities.setCapability("version", getProperty("VERSION"));
        capabilities.setCapability("deviceName", getProperty("DEVICE_NAME"));
        capabilities.setCapability("app", getProperty("PATH_APK_PARAMETRISTA"));
        capabilities.setCapability("avd", getProperty("AVD"));
        capabilities.setCapability("fullReset", getProperty("FULLRESET"));

        try {
            setupAppiumService();
            startAppium();
            mdriver = new AndroidDriver<MobileElement>(service.getUrl(), capabilities);
            mdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new Exception("Error connecting to Appium service : " + e.getMessage());
        }
    }

    public void setupAppiumService() {
        try {
            AppiumServiceBuilder builder = new AppiumServiceBuilder()
                    .withCapabilities(capabilities)
                    .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                    .withIPAddress(getProperty("IPADDRESS"))
                    .usingAnyFreePort();
            service = builder.build();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void startAppium() {
        service.start();
    }

    public void stopAppium() {
        service.stop();
    }

    public void detenerDriver() {
        mdriver.quit();
    }

    public static AndroidDriver<MobileElement> getDriver() {
     return mdriver;
    }

    public void setDriver(AndroidDriver<MobileElement> driver) {
        this.mdriver = driver;
    }

    public void startActivity() {
        mdriver = new AndroidDriver<MobileElement>(service.getUrl(), capabilities);
        mdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
