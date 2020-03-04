package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.Properties;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etUser")
    public AndroidElement xpathTextUsuario;

    public LoginPage esperarTxtUsuario() {
        wait_element(xpathTextUsuario);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etUser")
    public AndroidElement idUsuario;

    public LoginPage tapUsuario() {
        click(idUsuario);
        return this;
    }

    public LoginPage sendUsuario(String usuario) {
        sendKeys(idUsuario,usuario);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etPass")
    public AndroidElement idPassword;

    public LoginPage tapPassword() {
        click(idPassword);
        return this;
    }

    public LoginPage sendPassword(String password) {
        sendKeys(idPassword,password);
        return this;
    }



    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnLogin")
    public AndroidElement idBtnIngresar;

    public LoginPage tapBtnIngresar() {
        wait_element(idBtnIngresar);
        click(idBtnIngresar);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvMenuName")
    public AndroidElement idBtnMuestreo;

    public LoginPage BtnMuestreo() {
        wait_element(idBtnMuestreo);
        return this;
    }
    public LoginPage clickBtnMuestreo() {
        click(idBtnMuestreo);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvTitle")
    public AndroidElement idTitleMuestreoBiometrico;

    public LoginPage lblMuestreoBiometrico() {
        wait_element(idTitleMuestreoBiometrico);
        return this;
    }



    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/textinput_error")
    public AndroidElement idEmailMsgError;

    public String valorEmailMsg() {
        String valorObtenido;
        valorObtenido=getText(idEmailMsgError).trim();
        System.out.println("Valor del campo: "+valorObtenido);
        return valorObtenido;
    }
    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/textinput_error")
    public AndroidElement idPasswordMsgError;

    public String valorPasswordMsg() {
        String valorObtenido;
        valorObtenido=getText(idPasswordMsgError).trim();
        System.out.println("Valor del campo: "+valorObtenido);
        return valorObtenido;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvMsgSnackBar")
    public AndroidElement idMsgSnackBar;

    public String valorMsgSnackBar() {
        String valorObtenido;
        wait_element(idMsgSnackBar);
        valorObtenido=getText(idMsgSnackBar).trim();
        System.out.println("Valor del campo: "+valorObtenido);
        return valorObtenido;
    }

}
