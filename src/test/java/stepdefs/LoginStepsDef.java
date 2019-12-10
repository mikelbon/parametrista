package stepdefs;

import base.SetUp;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;
import pages.PiscinaPage;
import pages.ScreenShots;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

public class LoginStepsDef {

    SetUp objSetup = new SetUp();
    Scenario scenario;
    String parametro = "";

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^Parametrista ingresa a formulario Login y selecciona campo Usuario$")
    public void parametrista_ingresa_a_formulario_Login_y_selecciona_campo_Usuario() throws Throwable {
        LoginPage objLoginPage = new LoginPage(SetUp.getDriver());
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objLoginPage.esperarTxtUsuario();
            //objLoginPage.tapUsuario();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Falló ");
            Assert.fail();
        }
        objScreenShots.capturar_pantalla();
    }

    @Then("^Parametrista ingresa su correo \"([^\"]*)\"$")
    public void parametrista_ingresa_su_correo(String arg1) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        LoginPage objLoginPage = new LoginPage(SetUp.getDriver());
        objLoginPage.sendUsuario(arg1);
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona campo Contraseña$")
    public void parametrista_selecciona_campo_Contraseña() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        LoginPage objLoginPage = new LoginPage(SetUp.getDriver());
        objLoginPage.tapPassword();
        objScreenShots.capturar_pantalla();
    }

    @Then("^Parametrista ingresa su clave \"([^\"]*)\"$")
    public void parametrista_ingresa_su_clave(String arg1) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        LoginPage objLoginPage = new LoginPage(SetUp.getDriver());
        objLoginPage.sendPassword(arg1);
        objScreenShots.capturar_pantalla();
    }

    @Then("^Parametrista selecciona botón Ingresar$")
    public void parametrista_selecciona_botón_Ingresar() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        LoginPage objLoginPage = new LoginPage(SetUp.getDriver());
        objLoginPage.tapBtnIngresar();

        Thread.sleep(5000);
        objScreenShots.capturar_pantalla();
    }

    @Then("^Parametrista visualiza la lista de piscinas$")
    public void parametrista_visualiza_la_lista_de_piscinas() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona la piscina \"([^\"]*)\"$")
    public void parametrista_selecciona_la_piscina(String arg1) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        objPiscina.clickPiscina(arg1);
        Thread.sleep(5000);
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona parametro \"([^\"]*)\" y valor (\\d+)$")
    public void parametrista_selecciona_parametro_y_valor(String parametro, int arg2) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        objPiscina.clickParametro(parametro);
        Thread.sleep(1000);

        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona parametro \"([^\"]*)\"$")
    public void parametrista_selecciona_parametro(String parametro) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        objPiscina.clickParametro(parametro);
        Thread.sleep(1000);

        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista ingresa el valor (\\d+)$")
    public void parametrista_ingresa_el_valor(int arg1) throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        String valorParametro = "";
        switch (parametro) {
            case "Oxígeno Noche":
                valorParametro = "24";
                break;
            case "Temperatura Noche":
                valorParametro = "24";
                break;
            case "Oxígeno Tarde":
                valorParametro = "24";
                break;
            case "Temperatura Tarde":
                valorParametro = "24";
                break;
            case "Oxígeno Mañana":
                valorParametro = "24";
                break;
            case "Temperatura Mañana":
                valorParametro = "24";
                break;
            case "Salinidad":
                valorParametro = "24";
                break;
            case "Transparencia":
                valorParametro = "24";
                break;
            case "PH":
                valorParametro = "24";
                break;
            case "Alcalinidad":
                valorParametro = "24";
                break;
        }
        objPiscina.clickDigito2();
        Thread.sleep(1000);
        objPiscina.clickDigito9();
        Thread.sleep(1000);
        objScreenShots.capturar_pantalla();
    }

    @When("^Paramaetrista presiona boton Ingresar$")
    public void paramaetrista_presiona_boton_Ingresar() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        objPiscina.clickBtnIngresar();
        Thread.sleep(1000);
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona boton volver a parametros$")
    public void parametrista_selecciona_boton_volver_a_parametros() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        //objPiscina.clickBtnVolverParametros();
        Thread.sleep(8000);
        objScreenShots.capturar_pantalla();
    }

}
