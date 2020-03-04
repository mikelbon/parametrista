package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.Properties;

public class ReservorioPage extends BasePage {

    public ReservorioPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Reservorios')]")
    public AndroidElement xpathTabReservorios;

    public ReservorioPage waitTabReservorios() {
        wait_element(xpathTabReservorios);
        return this;
    }

    public ReservorioPage clickTabReservorios() {
        click(xpathTabReservorios);
        return this;
    }

    public ReservorioPage clickReservorio(String reservorio) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + reservorio + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Selecciona un Reservorio')]")
    public AndroidElement xpathSeleccionaUnReservorio;

    public ReservorioPage waitSeleccionaUnReservorio() {
        wait_element(xpathSeleccionaUnReservorio);
        return this;
    }

    public ReservorioPage waitNombreReservorio(String reservorio) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + reservorio + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvPoolName")
    public AndroidElement idNombreReservorio;

    public ReservorioPage waitReservorio() {
        wait_element(idNombreReservorio);
        return this;
    }

    public String getNombreReservorio() {
        return getText(idNombreReservorio);
    }

}
