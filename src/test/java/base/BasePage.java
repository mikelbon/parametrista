package base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected AndroidDriver driver;
    protected WebDriverWait wait;
    private int seconds = 15;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, seconds);
    }

    public void wait(AndroidElement elementLocation) {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(elementLocation));

    }

    public void wait_element(AndroidElement elementLocation) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.visibilityOf(elementLocation));

    }

    public void click(AndroidElement elementLocation) {
        elementLocation.click();
    }

    public void sendKeys(AndroidElement elementLocation, String text) {
            elementLocation.sendKeys(text);
            driver.hideKeyboard();
    }

    public String getText(AndroidElement elementLocation) {
        return elementLocation.getText().trim();
    }

    public boolean isDisplayed(AndroidElement elementLocation) {
        return elementLocation.isDisplayed();
    }

    public void clear(AndroidElement elementLocation) {
        wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
        elementLocation.clear();
    }

    public void modificar_red() {
        //turn red
        driver.toggleWifi();
        driver.toggleData();
        System.out.println("turn red");

    }


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void swipeToScreen() {
        //TouchAction ts = new TouchAction(driver);
        //ts.press(new PointOption().withCoordinates(720,1300)).moveTo(new PointOption().withCoordinates(720, 1100)).release().perform();
        swipeScreen(720,1300,720, 1100);
    }
    public void swipeScreen(int x1,int y1, int x2,int y2) {
        TouchAction ts = new TouchAction(driver);
        ts.press(new PointOption().withCoordinates(x1,y1)).moveTo(new PointOption().withCoordinates(x2, y2)).release().perform();


        System.out.println("Swiping");
    }

}


