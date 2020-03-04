package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Properties;

import java.util.List;

public class PiscinaPage extends BasePage {

    public PiscinaPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Selecciona una Piscina')]")
    public AndroidElement xpathMisPiscinas;

    public PiscinaPage waitMisPiscinas() {
        wait_element(xpathMisPiscinas);
        return this;
    }

    public boolean validarRango(String nombreParametro, double valor) {
        boolean dentroDeRango = false;
        switch (nombreParametro) {
            case "Oxígeno Mañana":
                dentroDeRango = (valor >= Properties.OXIGENO_MANANA_MIN && valor <= Properties.OXIGENO_MANANA_MAX) ? true : false;
                break;
            case "Oxígeno Tarde":
                dentroDeRango = (valor >= Properties.OXIGENO_TARDE_MIN && valor <= Properties.OXIGENO_TARDE_MAX) ? true : false;
                break;
            case "Oxígeno Noche":
                dentroDeRango = (valor >= Properties.OXIGENO_NOCHE_MIN && valor <= Properties.OXIGENO_NOCHE_MAX) ? true : false;
                break;
            case "Temperatura Mañana":
                dentroDeRango = (valor >= Properties.TEMPERATURA_MANANA_MIN && valor <= Properties.TEMPERATURA_MANANA_MAX) ? true : false;
                break;
            case "Temperatura Tarde":
                dentroDeRango = (valor >= Properties.TEMPERATURA_TARDE_MIN && valor <= Properties.TEMPERATURA_TARDE_MAX) ? true : false;
                break;
            case "Temperatura Noche":
                dentroDeRango = (valor >= Properties.TEMPERATURA_NOCHE_MIN && valor <= Properties.TEMPERATURA_NOCHE_MAX) ? true : false;
                break;
            case "Nivel de agua":
                dentroDeRango = (valor >= Properties.NIVEL_AGUA_MIN && valor <= Properties.NIVEL_AGUA_MAX) ? true : false;
                break;
            case "Salinidad":
                dentroDeRango = (valor >= Properties.SALINIDAD_MIN && valor <= Properties.SALINIDAD_MAX) ? true : false;
                break;
            case "Transparencia":
                dentroDeRango = (valor >= Properties.TRANSPARENCIA_MIN && valor <= Properties.TRANSPARENCIA_MAX) ? true : false;
                break;
            case "PH":
                dentroDeRango = (valor >= Properties.PH_MIN && valor <= Properties.PH_MAX) ? true : false;
                break;
            case "Alcalinidad":
                dentroDeRango = (valor >= Properties.ALCALINIDAD_MIN && valor <= Properties.ALCALINIDAD_MAX) ? true : false;
                break;
        }
        return dentroDeRango;
    }



    public boolean validarRangoTiempo(String nombreParametro, double valor) {
        boolean dentroDeRango = false;
        switch (nombreParametro) {
            case "Oxígeno":
                dentroDeRango = (valor >= Properties.OXIGENO_TIEMPO_MIN && valor <= Properties.OXIGENO_TIEMPO_MAX) ? true : false;
                break;
            case "Temperatura":
                dentroDeRango = (valor >= Properties.TEMPERATURA_TIEMPO_MIN && valor <= Properties.TEMPERATURA_TIEMPO_MAX) ? true : false;
                break;
            case "Nivel de agua":
                dentroDeRango = (valor >= Properties.NIVEL_AGUA_MIN && valor <= Properties.NIVEL_AGUA_MAX) ? true : false;
                break;
            case "Salinidad":
                dentroDeRango = (valor >= Properties.SALINIDAD_MIN && valor <= Properties.SALINIDAD_MAX) ? true : false;
                break;
            case "Transparencia":
                dentroDeRango = (valor >= Properties.TRANSPARENCIA_MIN && valor <= Properties.TRANSPARENCIA_MAX) ? true : false;
                break;
            case "PH":
                dentroDeRango = (valor >= Properties.PH_MIN && valor <= Properties.PH_MAX) ? true : false;
                break;
            case "Alcalinidad":
                dentroDeRango = (valor >= Properties.ALCALINIDAD_MIN && valor <= Properties.ALCALINIDAD_MAX) ? true : false;
                break;
        }
        return dentroDeRango;
    }

    public PiscinaPage clickPiscina(String nombrePiscina) throws InterruptedException {
        // altura de card Piscina 283
//        List<AndroidElement> profile=driver.findElementsByXPath("//android.widget.TextView");
//        System.out.println("***************");
//        System.out.println(profile.size());
//        for(int i=0;i<profile.size();i++){
//            System.out.println(profile.get(i).getText());
//        }
//        if (!profile.isEmpty()) {
//            System.out.println(profile.get(8).getText()); // print text in 9th element
//        }
       /* AndroidElement element;
        boolean isFoundTheElement = false;
        By location;
        try {
            location = By.xpath("//android.widget.TextView[(@text='" + nombrePiscina + "')]");
            //element = (AndroidElement) driver.findElement(location);
            isFoundTheElement = driver.findElements(location).size() > 0;
        } catch (NoSuchElementException ex) {
            System.out.println("NO SE ENCUENTRA EL ELEMENTO");
        }
        System.out.println("VALOR ISFOUND: " + isFoundTheElement);
        Thread.sleep(1000000);
        while (isFoundTheElement == false) {
            //swipeVertical((AppiumDriver) driver,0.9,0.1,0.5,2000);
            swipeScreenPiscina(1400, 2200, 1400, 1700);
            isFoundTheElement = driver.findElements(location).size() > 0;
        }*/
        //element.click();
        //Thread.sleep(1000000);
      /*  do{
            element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + nombrePiscina + "')]");
        }while(!element.isDisplayed());*/


     /*   if (element.isDisplayed()) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento no encontrado, se realizara scroll");
        }
        Thread.sleep(1000000);
        //element.click();*/
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + nombrePiscina + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Salinidad')]")
    public AndroidElement xpathSalinidad;

    public PiscinaPage clickSalinidad() {
        click(xpathSalinidad);
        return this;
    }

    public PiscinaPage clickParametro(String nombreParametro) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + nombreParametro + "')]");
        element.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.Button[(@text='2')]")
    public AndroidElement xpathDigito2;

    public PiscinaPage clickDigito2() {
        click(xpathDigito2);
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[(@text='9')]")
    public AndroidElement xpathDigito9;

    public PiscinaPage clickDigito9() {
        click(xpathDigito9);
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[(@text='Ingresar')]")
    public AndroidElement xpathIngresar;

    public PiscinaPage clickBtnIngresar() {
        click(xpathIngresar);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/ivCross")
    public AndroidElement xpathSalir;

    public PiscinaPage clickBtnSalir() {
        wait_element(xpathSalir);
        click(xpathSalir);
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[(@text='Volver a parámetros')]")
    public AndroidElement xpathVolverParametros;

    public PiscinaPage clickBtnVolverParametros() {
        wait_element(xpathVolverParametros);
        click(xpathVolverParametros);
        return this;
    }



    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvBack")
    public AndroidElement xpathVolverDesdePiscinas;

    public PiscinaPage clickBtnVolverDesdePiscinas() {
        wait_element(xpathVolverDesdePiscinas);
        click(xpathVolverDesdePiscinas);
        return this;
    }


    // Icono Wifi
    public void disableWifi() {
        driver.toggleWifi();
        driver.toggleData();
        System.out.println("turn off red");
    }

    public void enableWifi() {
        driver.toggleData();
        driver.toggleWifi();
        System.out.println("turn on red");
    }

    //parametros
    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Este dato ya fue ')]")
    public AndroidElement xpathEsteDatoYaFue;

    @AndroidFindBy(xpath = "//android.widget.Button[(@id='btnBackParameters')]")
    public AndroidElement xpathBtnVolverParametros;


    // Botones Numericos de Calculadora
    public PiscinaPage clickDigito(String digito) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.Button[(@text='" + digito + "')]");
        element.click();
        return this;
    }

    public PiscinaPage swipeScreen() {
        swipeToScreen();
        return this;
    }

    public PiscinaPage swipeScreenPiscina(int x1, int y1, int x2, int y2) {
        swipeScreen(x1, y1, x2, y2);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/action_exit")
    public AndroidElement xpathSalirApp;

    public PiscinaPage clickBtnExitApp() {
        click(xpathSalirApp);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/tvPoolName")
    public AndroidElement xpathNombrePiscina;

    public PiscinaPage clickNombrePiscina() {
        wait_element(xpathNombrePiscina);
        click(xpathNombrePiscina);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnCloseSession")
    public AndroidElement xpathCerrarSesion;

    public PiscinaPage clickBtnCerrarSesion() {
        click(xpathCerrarSesion);
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/etValue")
    public AndroidElement idValor;

    public String valorRealParametro() {
        String valorObtenido;
        wait_element(idValor);
        valorObtenido=getText(idValor).trim();
        System.out.println("Valor del campo: "+valorObtenido);
        return valorObtenido;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Selecciona una Piscina')]")
    public AndroidElement xpathSeleccionaUnaPiscina;

    public PiscinaPage waitSeleccionaUnaPiscina() {
        wait_element(xpathSeleccionaUnaPiscina);
        return this;
    }

    public PiscinaPage waitNombrePiscina(String piscina) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + piscina + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[(@text='Piscinas')]")
    public AndroidElement xpathTabPiscinas;

    public PiscinaPage waitTabPiscinas() {
        wait_element(xpathTabPiscinas);
        return this;
    }

    public PiscinaPage clickTabPiscinas() {
        click(xpathTabPiscinas);
        return this;
    }

    public PiscinaPage clickTabParametro(String parametro) {
        AndroidElement element = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[(@text='" + parametro + "')]");
        element.click();
        return this;
    }

    @AndroidFindBy(id = "com.alicorp.android.nicosoft."+ Properties.AMBIENTE_OBJETO +":id/btnAddParameter")
    public AndroidElement xpathAgregarValorParametro;

    public PiscinaPage clickBtnAgregarValorParametro() {
        wait_element(xpathAgregarValorParametro);
        click(xpathAgregarValorParametro);
        return this;
    }
}
