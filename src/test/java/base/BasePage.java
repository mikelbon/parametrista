package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
        WebDriverWait wait = new WebDriverWait(driver, 15);
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
        return elementLocation.getText();
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



}


