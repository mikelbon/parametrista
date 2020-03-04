package pages;

import base.BasePage;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.Properties;

public class FincaPage extends BasePage {
    public FincaPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Mis Fincas')]")
    public AndroidElement xpathMisfincas;

    public FincaPage waitMisFincas() {
        wait_element(xpathMisfincas);
        return this;
    }
    public FincaPage clickFinca(String finca) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + finca + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvFarmName")
    public AndroidElement idNombreFinca;

    public FincaPage waitFinca() {
        wait_element(idNombreFinca);
        return this;
    }

    public String getNombreFinca() {
       return  getText(idNombreFinca);
    }
}
