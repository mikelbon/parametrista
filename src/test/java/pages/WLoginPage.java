package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Properties;

public class WLoginPage {
    WebDriver driver;

    public WLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Txt Usuario
    @FindBy(xpath = Properties.LOG_TXT_USUARIO_XPATH)
    public WebElement xpathTxtUsuario;

    public WLoginPage setUsuario(String usuario) {
        xpathTxtUsuario.sendKeys(usuario);
        return this;
    }

    // Txt Password
    @FindBy(xpath = Properties.LOG_TXT_PASSWORD_XPATH)
    public WebElement xpathTxtPassword;

    public WLoginPage setPassword(String password) {
        xpathTxtPassword.sendKeys(password);
        xpathTxtPassword.sendKeys(Keys.TAB);
        return this;
    }
    // Chk Captcha
    @FindBy(xpath = Properties.LOG_RECAPTCHA_XPATH)
    public WebElement xpathChkRecaptcha;

    public WLoginPage clickChkRecaptcha() {
        xpathChkRecaptcha.click();
        return this;
    }
    // Btn Ingresar
    @FindBy(xpath = Properties.LOG_BTN_INGRESAR_XPATH)
    public WebElement xpathBtningresar;

    public WLoginPage clickBtnIngresar() {
        xpathBtningresar.click();
        return this;
    }




}
