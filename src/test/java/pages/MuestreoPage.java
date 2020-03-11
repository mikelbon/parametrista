package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.Properties;

public class MuestreoPage extends BasePage {
    public MuestreoPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etUser")
    public AndroidElement xpathTextUsuario;

    public MuestreoPage esperarTxtUsuario() {
        wait_element(xpathTextUsuario);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etUser")
    public AndroidElement idUsuario;

    public MuestreoPage tapUsuario() {
        click(idUsuario);
        return this;
    }

    public MuestreoPage sendUsuario(String usuario) {
        sendKeys(idUsuario,usuario);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etPass")
    public AndroidElement idPassword;

    public MuestreoPage tapPassword() {
        click(idPassword);
        return this;
    }

    public MuestreoPage sendPassword(String password) {
        sendKeys(idPassword,password);
        return this;
    }



    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnLogin")
    public AndroidElement idBtnIngresar;

    public MuestreoPage tapBtnIngresar() {
        wait_element(idBtnIngresar);
        click(idBtnIngresar);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvMenuName")
    public AndroidElement idBtnMuestreo;

    public MuestreoPage BtnMuestreo() {
        wait_element(idBtnMuestreo);
        return this;
    }
    public MuestreoPage clickBtnMuestreo() {
        click(idBtnMuestreo);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvTitle")
    public AndroidElement idTitleMuestreoBiometrico;

    public MuestreoPage lblMuestreoBiometrico() {
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


    public MuestreoPage clickFinca(String finca) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + finca + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvBiometricsTitle")
    public AndroidElement idTitleMuestreoBiometricoFormPiscina;

    public MuestreoPage lblMuestreoBiometricoFormPiscina() {
        wait_element(idTitleMuestreoBiometricoFormPiscina);
        return this;
    }

    public MuestreoPage clickPool(String pool) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='Piscina " + pool + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvPoolName")
    public AndroidElement idNamePoolMuestreo;

    public MuestreoPage lblNamePoolMuestreo() {
        wait_element(idNamePoolMuestreo);
        return this;
    }

    // etiqueta No se ha realizado ningun muestreo
    // Botones Numericos de Calculadora
    public MuestreoPage clickPiscinaSinMuestreoprevio() {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='No se ha realizado ningún muestreo')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnAddNewSampling")
    public AndroidElement idBtnAddNewSampling;

    public MuestreoPage clickBtnAddNewSampling() {
        wait_element(idBtnAddNewSampling);
        click(idBtnAddNewSampling);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvTitle")
    public AndroidElement idNewBiometricSampler;

    public MuestreoPage lblNewBiometricSampler() {
        wait_element(idNewBiometricSampler);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnAddNewSample")
    public AndroidElement idBtnAddNewSample;

    public MuestreoPage clickBtnAddNewSample() {
        wait_element(idBtnAddNewSample);
        click(idBtnAddNewSample);
        return this;
    }

    public MuestreoPage clickAgregarMuestra() {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='Agregar Muestra')]");
        element.click();
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvParameterName")
    public AndroidElement idParameterName;

    public MuestreoPage lblParameterName() {
        wait_element(idParameterName);
        return this;
    }

    // Botones Numericos de Calculadora
    public MuestreoPage clickDigito(String digito) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.Button[(@text='" + digito + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[(@text='Ingresar')]")
    public AndroidElement xpathIngresar;

    public MuestreoPage clickBtnIngresar() {
        click(xpathIngresar);
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[(@text='Calcular')]")
    public AndroidElement xpathCalcular;

    public MuestreoPage clickBtnCalcular() {
        click(xpathCalcular);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvAverage")
    public AndroidElement idAverage;

    public MuestreoPage lblAverage() {
        wait_element(idAverage);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnAddPathologicalEvent")
    public AndroidElement idBtnAddPathologicalEvent;

    public MuestreoPage btnAddPathologicalEvent() {
        wait_element(idBtnAddPathologicalEvent);
        click(idBtnAddPathologicalEvent);
        return this;
    }
    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvPathological")
    public AndroidElement idTitlePathological;

    public MuestreoPage lblTitlePathologicalEvents() {
        wait_element(idTitlePathological);
        return this;
    }
    public MuestreoPage clickEventoPatologico(String evento) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + evento + "')]");
        element.click();
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnNext")
    public AndroidElement idBtnFinMuestreo;

    public MuestreoPage btnFinMuestreo() {
        wait_element(idBtnFinMuestreo);
        click(idBtnFinMuestreo);
        return this;
    }


    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvTitleSampling")
    public AndroidElement idLblUltimos4Muestreos;

    public MuestreoPage lblUltimos4Muestreos() {
        wait_element(idLblUltimos4Muestreos);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnPathologicalEvents")
    public AndroidElement idBtnVer;

    public MuestreoPage clickBtnVer() {
        wait_element(idBtnVer);
        click(idBtnVer);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvTitlePathologicalEvent")
    public AndroidElement idDialogPathologicalEvent;

    public MuestreoPage dialogEventos() {
        wait_element(idDialogPathologicalEvent);
        return this;
    }

    public MuestreoPage getEvento(String evento) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + evento + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/ivClose")
    public AndroidElement idClose;

    public MuestreoPage cerrarDialogo() throws InterruptedException {
        wait_element(idClose);
        click(idClose);
        Thread.sleep(20000);
        return this;
    }
}
