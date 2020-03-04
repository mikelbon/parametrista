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
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Keys;
import pages.*;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import util.Properties;
import util.TimeParameterValues;

import java.util.NoSuchElementException;

public class AppStepsDef {

    Scenario scenario;
    String parametro = "";
    String Reservorio = "";
    String Piscina = "";
    String objetoASincronizar = "";
    String Finca = "";
    boolean ingresoCalculadora = false;
String evento="";
    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^Parametrista ingresa a formulario Login y selecciona campo Usuario$")
    public void parametrista_ingresa_a_formulario_Login_y_selecciona_campo_Usuario() throws Throwable {
        LoginPage login = new LoginPage(SetUp.getDriver());
        ScreenShots screen = new ScreenShots();
        try {
            login.esperarTxtUsuario();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se seleccionó el campo Usuario");
            Assert.fail();
        }
    }

    @Then("^Parametrista ingresa su correo \"([^\"]*)\"$")
    public void parametrista_ingresa_su_correo(String email) throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.sendUsuario(email);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se ingresó el email en el campo Usuario");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona campo Contraseña$")
    public void parametrista_selecciona_campo_Contraseña() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.tapPassword();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se seleccionó  el campo Contraseña");
            Assert.fail();
        }
    }

    @Then("^Parametrista ingresa su clave \"([^\"]*)\"$")
    public void parametrista_ingresa_su_clave(String password) throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            if (password.length() == 0) {
                login.sendUsuario("");
            } else {
                login.sendPassword(password);
            }
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se ingresó el password en  el campo Contraseña");
            Assert.fail();
        }
    }

    @Then("^Parametrista selecciona botón Ingresar$")
    public void parametrista_selecciona_botón_Ingresar() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.tapBtnIngresar();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el botón Ingresar");
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza el Home de bienvenida$")
    public void parametrista_visualiza_el_Home_de_bienvenida() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.BtnMuestreo();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico selecciona la opcion Muestreo$")
    public void jefetecnico_selecciona_la_opcion_Muestreo() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.clickBtnMuestreo();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza el listado de fincas$")
    public void jefetecnico_visualiza_el_listado_de_fincas() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        try {
            login.lblMuestreoBiometrico();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico selecciona la finca \"([^\"]*)\"$")
    public void jefetecnico_selecciona_la_finca(String finca) throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.clickFinca(finca);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza la lista de piscinas$")
    public void jefetecnico_visualiza_la_lista_de_piscinas() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblMuestreoBiometricoFormPiscina();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico selecciona la piscina \"([^\"]*)\"$")
    public void jefetecnico_selecciona_la_piscina(String pool) throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.clickPool(pool);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza la pantalla de muestreo biometrico$")
    public void jefetecnico_visualiza_la_pantalla_de_muestreo_biometrico() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblNamePoolMuestreo();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico presiona el boton Agregar Muestreo Biometrico$")
    public void jefetecnico_presiona_el_boton_Agregar_Muestreo_Biometrico() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.clickBtnAddNewSampling();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza el formulario de nuevo muestreo biometrico$")
    public void jefetecnico_visualiza_el_formulario_de_nuevo_muestreo_biometrico() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblNewBiometricSampler();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico presiona boton Agregar Muestra$")
    public void jefetecnico_presiona_boton_Agregar_Muestra() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.clickBtnAddNewSample();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza la calculadora$")
    public void jefetecnico_visualiza_la_calculadora() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblParameterName();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico ingresa el valor \"([^\"]*)\" para el \"([^\"]*)\"$")
    public void jefetecnico_ingresa_el_valor_para_el(String value, String parameterName) throws Throwable {

        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            // Calculadora
            String[] res = new String[value.length()];
            for (int i = 0; i < value.length(); i++) {
                screen.capturar_pantalla();
                res[i] = Character.toString(value.charAt(i));
                muestreo.clickDigito(res[i]);
            }
            muestreo.swipeScreen(1357, 1963, 1357, 2270);
            if (!ingresoCalculadora) {
                muestreo.clickBtnIngresar();
                ingresoCalculadora = true;
            }else{
                muestreo.clickBtnCalcular();
                ingresoCalculadora = false;
            }


        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza una tarjeta con los datos agregados$")
    public void jefetecnico_visualiza_una_tarjeta_con_los_datos_agregados() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblAverage();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico presiona el boton Ingresar Evento Patologico$")
    public void jefetecnico_presiona_el_boton_Ingresar_Evento_Patologico() throws Throwable {

        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.btnAddPathologicalEvent();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza el listado de Eventos Patologicos$")
    public void jefetecnico_visualiza_el_listado_de_Eventos_Patologicos() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblTitlePathologicalEvents();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico selecciona el evento \"([^\"]*)\"$")
    public void jefetecnico_selecciona_el_evento(String event) throws Throwable {

        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            evento=event;
            muestreo.clickEventoPatologico(event);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza el evento agregado \"([^\"]*)\"$")
    public void jefetecnico_visualiza_el_evento_agregado(String event) throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            //muestreo.clickEventoPatologico(event);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @When("^JefeTecnico presiona el boton Finalizar muestreo$")
    public void jefetecnico_presiona_el_boton_Finalizar_muestreo() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.btnFinMuestreo();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }

    @Then("^JefeTecnico visualiza la pantalla de muestreo biometrico con el ultimo muestreo agregado$")
    public void jefetecnico_visualiza_la_pantalla_de_muestreo_biometrico_con_el_ultimo_muestreo_agregado() throws Throwable {
        ScreenShots screen = new ScreenShots();
        MuestreoPage muestreo = new MuestreoPage(SetUp.getDriver());
        try {
            muestreo.lblUltimos4Muestreos();
            muestreo.clickBtnVer();
            muestreo.dialogEventos();
            muestreo.getEvento(evento);
            muestreo.cerrarDialogo();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el icono de Muestreo");
            Assert.fail();
        }
    }


    @Then("^Parametrista visualiza mensaje Por favor, ingrese un usuario$")
    public void parametrista_visualiza_mensaje_Por_favor_ingrese_un_usuario() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Por favor, ingrese un usuario";
        try {
            assertTrue(login.valorEmailMsg().equals(msgExpected), "No se muestra el mensaje de validación");
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("Falló al obtener mensaje de validación");
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza mensaje Los datos ingresados no son correctos$")
    public void parametrista_visualiza_mensaje_Los_datos_ingresados_no_son_correctos() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Los datos ingresados no son correctos";
        try {
            assertTrue(login.valorMsgSnackBar().equals(msgExpected), "No se muestra el mensaje de validación");
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("Falló al obtener mensaje de validación");
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza mensaje Escriba un correo válido$")
    public void parametrista_visualiza_mensaje_Escriba_un_correo_válido() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Escriba un correo válido";
        try {
            assertTrue(login.valorEmailMsg().equals(msgExpected), "No se muestra el mensaje de validación");
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("Falló al obtener mensaje de validación");
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza mensaje Por favor, ingrese su contraseña$")
    public void parametrista_visualiza_mensaje_Por_favor_ingrese_su_contraseña() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Por favor, ingrese su contraseña";
        try {
            assertTrue(login.valorPasswordMsg().equals(msgExpected), "No se muestra el mensaje de validación");
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("Falló al obtener mensaje de validación");
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza la lista de fincas$")
    public void parametrista_visualiza_la_lista_de_fincas() throws Throwable {
        ScreenShots screen = new ScreenShots();
        FincaPage finca = new FincaPage(SetUp.getDriver());
        try {
            finca.waitMisFincas();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se visualiza la lista de fincas");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona la finca \"([^\"]*)\"$")
    public void parametrista_selecciona_la_finca(String nombreFinca) throws Throwable {
        Finca = nombreFinca;
        ScreenShots screen = new ScreenShots();
        FincaPage finca = new FincaPage(SetUp.getDriver());
        try {
            finca.clickFinca(nombreFinca);
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la finca " + finca);
            Assert.fail();
        }
    }

    @Then("^Parametrista visualiza las listas de Piscinas y Reservorios$")
    public void parametrista_visualiza_las_listas_de_Piscinas_y_Reservorios() throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
        try {
            piscina.waitTabPiscinas();
            reservorio.waitTabReservorios();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la pestaña piscina y reservorios");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona la pestana de Reservorios$")
    public void parametrista_selecciona_la_pestana_de_Reservorios() throws Throwable {
        ScreenShots screen = new ScreenShots();
        ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
        try {
            reservorio.clickTabReservorios();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la pestaña piscina y reservorios");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona la pestana de Piscinas$")
    public void parametrista_selecciona_la_pestana_de_Piscinas() throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage reservorio = new PiscinaPage(SetUp.getDriver());
        try {
            reservorio.clickTabPiscinas();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la pestaña piscina y reservorios");
            Assert.fail();
        }
    }

    @When("^Parametrista visualiza la lista de valores ingresados para el parametro \"([^\"]*)\"$")
    public void parametrista_visualiza_la_lista_de_valores_ingresados_para_el_parametro(String parametro) throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        try {
            piscina.clickTabParametro(parametro);
            Thread.sleep(500);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la pestaña " + parametro);
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona boton Agregar \"([^\"]*)\"$")
    public void parametrista_selecciona_boton_Agregar_y_valor(String nombreParametro) throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Dato ingresado inválido, ingresa un número correcto";
        for (int x = 0; x < 30; x++) {
            try {
                piscina.clickBtnAgregarValorParametro();
                Thread.sleep(500);

                // Calculadora
                // Obtener valores aleatorios, El valor a ingresar debe ser aleatorio de acuerdo al rango permitido para cada Parametro
                String value = "";
                switch (nombreParametro) {
                    case "Oxígeno":
                        value = TimeParameterValues.getOxigenValueByTyme() + "";
                        break;
                    case "Temperatura":
                        value = TimeParameterValues.getTemperatureValueByTyme() + "";
                        break;
                    case "Nivel de agua":
                        value = TimeParameterValues.getWaterLevelValueByTyme() + "";
                        break;
                    case "Salinidad":
                        value = TimeParameterValues.getSalinityValueByTyme() + "";
                        break;
                    case "Transparencia":
                        value = TimeParameterValues.getClarityValueByTyme() + "";
                        break;
                    case "PH":
                        value = TimeParameterValues.getPHValueByTyme() + "";
                        break;
                    case "Alcalinidad":
                        value = TimeParameterValues.getAlcalinityValueByTyme() + "";
                        break;
                }


                String[] res = new String[value.length()];
                for (int i = 0; i < value.length(); i++) {
                    res[i] = Character.toString(value.charAt(i));
                    piscina.clickDigito(res[i]);
                }
                //capturar valor del display
                double valorReal = Double.parseDouble(piscina.valorRealParametro());

                // Llamar a procedimiento para validar rango
                boolean result = piscina.validarRangoTiempo(nombreParametro, valorReal);
                screen.capturar_pantalla();
                piscina.clickBtnIngresar();
                if (!result) {
                    // Si el valor está fuera del rango, se visualizara mensaje de validacion
                    assertTrue(login.valorMsgSnackBar().equals(msgExpected), "No se muestra el mensaje de validación");
                    screen.capturar_pantalla();
                    piscina.swipeScreen(1357, 1963, 1357, 2270);
                    piscina.clickBtnSalir();
                } else {
                    System.out.println("PARAMETRO: " + nombreParametro);
                    // Si es igual a Salinidad Transparencia PH Alcalinidad saldra un popup
                    if (nombreParametro.equalsIgnoreCase("Nivel de agua") || nombreParametro.equalsIgnoreCase("Salinidad") || nombreParametro.equalsIgnoreCase("Transparencia") || nombreParametro.equalsIgnoreCase("PH") || nombreParametro.equalsIgnoreCase("Alcalinidad")) {
                        piscina.clickBtnVolverParametros();
                        if (nombreParametro.equalsIgnoreCase("Alcalinidad")) {
                            piscina.swipeScreen(1357, 1963, 1357, 2270);
                        }
                    } else {
                        piscina.clickBtnSalir();
                    }
                }
            } catch (Exception e) {
                screen.capturar_pantalla();
                System.out.println(e.getMessage());
                System.out.println("No se encontró el boton Agregar " + nombreParametro);
                Assert.fail();
            }
        }
    }

    @Then("^Parametrista visualiza la lista de reservorios de la finca$")
    public void parametrista_visualiza_la_lista_de_reservorios_de_la_finca() throws Throwable {
        ScreenShots screen = new ScreenShots();
        ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
        try {
            reservorio.waitSeleccionaUnReservorio();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la Etiqueta Selecciona Reservorio");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona el reservorio \"([^\"]*)\"$")
    public void parametrista_selecciona_el_reservorio(String reservorius) throws Throwable {
        Reservorio = reservorius;
        ScreenShots screen = new ScreenShots();
        ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
        try {
            reservorio.clickReservorio(reservorius);
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la Etiqueta Selecciona Reservorio");
            Assert.fail();
        }
    }

    @When("^Parametrista visualiza los parametros a ingresar en el reservorio$")
    public void parametrista_visualiza_los_parametros_a_ingresar_en_el_reservorio() throws Throwable {
        ScreenShots screen = new ScreenShots();
        FincaPage finca = new FincaPage(SetUp.getDriver());
        ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
        try {

            finca.waitFinca();
            reservorio.waitReservorio();

            screen.capturar_pantalla();

            System.out.println("Finca expected: " + Finca);
            System.out.println("Reservorio expected: " + Reservorio);

            System.out.println("Finca obtenido: " + finca.getNombreFinca());
            System.out.println("Reservorio obtenido: " + reservorio.getNombreReservorio());

            assertTrue(finca.getNombreFinca().equals(Finca), "No se muestra el nombre de la Finca " + Finca);
            assertTrue(reservorio.getNombreReservorio().equals(Reservorio), "No se muestra el nombre del Reservorio " + Reservorio);
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se visualiza los parametros a ingresar en el reservorio");
            Assert.fail();
        }

    }

    @Then("^Parametrista visualiza la lista de piscinas$")
    public void parametrista_visualiza_la_lista_de_piscinas() throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        try {
            piscina.waitMisPiscinas();
            screen.capturar_pantalla();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se visualiza la lista de piscinas");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona la piscina \"([^\"]*)\"$")
    public void parametrista_selecciona_la_piscina(String nombrePiscina) throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        try {
            piscina.clickPiscina(nombrePiscina);
            Piscina = nombrePiscina;
            objetoASincronizar = "piscina";
            Thread.sleep(2000);
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró la piscina");
            Assert.fail();
        }
    }

    @When("^Parametrista selecciona parametro \"([^\"]*)\" y valor \"([^\"]*)\"$")
    public void parametrista_selecciona_parametro_y_valor(String parametro, String value) throws Throwable {
        ScreenShots screen = new ScreenShots();
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
        LoginPage login = new LoginPage(SetUp.getDriver());
        String msgExpected = "Dato ingresado inválido, ingresa un número correcto";
        //piscina.swipeScreen(720, 1300, 720, 800);
        try {
            Thread.sleep(1000);
            String nombreParametro = parametro.trim();
            if (nombreParametro.equalsIgnoreCase("Nivel de agua") || nombreParametro.equalsIgnoreCase("PH") || nombreParametro.equalsIgnoreCase("Alcalinidad") || nombreParametro.equalsIgnoreCase("Salinidad") || nombreParametro.equalsIgnoreCase("Transparencia")) {
                piscina.swipeScreen(720, 2200, 720, 1800);
                screen.capturar_pantalla();
            } else {
                //Otros parametros
                screen.capturar_pantalla();
            }

            piscina.clickParametro(parametro);

            // Calculadora
            String[] res = new String[value.length()];
            for (int i = 0; i < value.length(); i++) {
                screen.capturar_pantalla();
                res[i] = Character.toString(value.charAt(i));
                piscina.clickDigito(res[i]);
            }
            //capturar valor del display
            double valorReal = Double.parseDouble(piscina.valorRealParametro());

            // Llamar a procedimiento para validar rango
            boolean result = piscina.validarRango(parametro, valorReal);
            screen.capturar_pantalla();
            piscina.clickBtnIngresar();
            System.out.println("SE PRESIONO BOTON INGRESAR");
            if (!result) {
                // Si el valor está fuera del rango, se visualizara mensaje de validacion
                assertTrue(login.valorMsgSnackBar().equals(msgExpected), "No se muestra el mensaje de validación");
                screen.capturar_pantalla();
                piscina.swipeScreen(1357, 1963, 1357, 2270);
                piscina.clickBtnSalir();
                System.out.println("IF VOLVER A PARAMETROS");
            } else {
                System.out.println("PARAMETRO: " + nombreParametro);
                // Si es igual a Salinidad Transparencia PH Alcalinidad saldra un popup
                if (nombreParametro.equalsIgnoreCase("Nivel de agua") || nombreParametro.equalsIgnoreCase("Salinidad") || nombreParametro.equalsIgnoreCase("Transparencia") || nombreParametro.equalsIgnoreCase("PH") || nombreParametro.equalsIgnoreCase("Alcalinidad")) {
                    piscina.clickBtnVolverParametros();
                    if (nombreParametro.equalsIgnoreCase("Alcalinidad")) {
                        piscina.swipeScreen(1357, 1963, 1357, 2270);
                    }
                } else {
                    piscina.clickBtnSalir();
                }
            }


        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("No se encontró el parámetro " + parametro);
            Assert.fail();
        }
    }

    @When("^Parametrista visualiza mensaje Dato ingresado invalido$")
    public void parametrista_visualiza_mensaje_Dato_ingresado_invalido() throws Throwable {
        ScreenShots screen = new ScreenShots();
        LoginPage login = new LoginPage(SetUp.getDriver());
        PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());

        String msgExpected = "Dato ingresado inválido, ingresa un número correcto";
        try {
            assertTrue(login.valorMsgSnackBar().equals(msgExpected), "No se muestra el mensaje de validación");
            screen.capturar_pantalla();
            piscina.clickBtnSalir();
        } catch (Exception e) {
            screen.capturar_pantalla();
            System.out.println(e.getMessage());
            System.out.println("Falló al obtener mensaje de validación de parámetro");
            Assert.fail();
        }
    }

    @When("^Parametrista visualiza todos los parametros ingresados$")
    public void parametrista_visualiza_todos_los_parametros_ingresados() throws Throwable {
        Thread.sleep(1000);
        ScreenShots objScreenShots = new ScreenShots();
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista desactiva el wifi$")
    public void parametrista_desactiva_el_wifi() throws Throwable {
        //deslizar
        try {
            ScreenShots objScreenShots = new ScreenShots();
            PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
            objScreenShots.capturar_pantalla();
            objPiscina.disableWifi();
            Thread.sleep(2000);
            objPiscina.enableWifi();

        } catch (NoSuchElementException e) {

        }
    }

    @When("^Parametrista retrocede al formulario anterior para sincronizar$")
    public void parametrista_retrocede_al_formulario_anterior_para_sincronizar() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        PiscinaPage objPiscina = new PiscinaPage(SetUp.getDriver());
        objPiscina.clickBtnVolverDesdePiscinas();
        Thread.sleep(10000);
        objScreenShots.capturar_pantalla();
    }

    @Then("^Parametrista visualiza que los parametros ingresados anteriormente han sincronizado$")
    public void parametrista_visualiza_que_los_parametros_ingresados_anteriormente_han_sincronizado() throws Throwable {
        ScreenShots objScreenShots = new ScreenShots();
        if (objetoASincronizar.equals("piscina")) {
            PiscinaPage piscina = new PiscinaPage(SetUp.getDriver());
            piscina.waitNombrePiscina(Piscina);
        } else if (objetoASincronizar.equals("reservorio")) {
            ReservorioPage reservorio = new ReservorioPage(SetUp.getDriver());
            reservorio.waitNombreReservorio(Reservorio);
        }
        objScreenShots.capturar_pantalla();
    }

    @When("^Parametrista selecciona parametro \"([^\"]*)\" y valor (\\d+)$")
    public void parametrista_selecciona_parametro_y_valor(String parametro, int arg2) throws Throwable {

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
