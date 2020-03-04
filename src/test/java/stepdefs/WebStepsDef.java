package stepdefs;

import base.WSetUp;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.LoginPage;
import pages.ScreenShots;
import pages.WLoginPage;
import util.Properties;
import util.ScreenShotsWeb;

import java.util.Collections;

public class WebStepsDef {
    WebDriver driver;
    Scenario scenario;

    @When("^Bodeguero ingresa a la web con correo \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void bodeguero_ingresa_a_la_web_con_correo_y_clave(String email, String clave) throws Throwable {
       /* driver=WSetUp.getDriver();
        WLoginPage loginPage=new WLoginPage(driver);
        ScreenShots objScreenShots = new ScreenShots();
        try {
            loginPage.setUsuario(email);
            loginPage.setPassword(clave);
            loginPage.clickBtnIngresar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Falló ");
            Assert.fail();
        }*/
        ScreenShotsWeb objScreenShots = new ScreenShotsWeb();
        System.setProperty(Properties.TIPO_DRIVER, Properties.CHROME_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        driver.navigate().to("http://frontend.qa.nicovitadigital.com");
        objScreenShots.capturar_pantalla(driver);

        WLoginPage login = new WLoginPage(driver);
        System.out.println("STEP Bodeguero ingresa su correo");
        login.setUsuario(email);
        login.setPassword(clave);
        //login.clickChkRecaptcha();
        objScreenShots.capturar_pantalla(driver);
        login.clickBtnIngresar();
        Thread.sleep(8000);
        objScreenShots.capturar_pantalla(driver);
    }

    @Then("^Bodeguero visualiza la vista por Fecha$")
    public void bodeguero_visualiza_la_vista_por_Fecha() throws Throwable {

    }

    @When("^Bodeguero selecciona la piscina \"([^\"]*)\"$")
    public void bodeguero_selecciona_la_piscina(String arg1) throws Throwable {

    }

    @Then("^Bodeguero deberia visualizar los mismos datos ingresados desde el App en la tabla de Parametros para el dia de hoy$")
    public void bodeguero_deberia_visualizar_los_mismos_datos_ingresados_desde_el_App_en_la_tabla_de_Parametros_para_el_dia_de_hoy() throws Throwable {

    }
}
