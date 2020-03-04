package util;

public class Properties {
    // Global Controls

    public static final String AMBIENTE_OBJETO="qa";  // dev
    //Config Web
    public static final String URL_BODEGUERO_QA = "http://frontend.qa.nicosoft.belatrix.online/login";
    public static final String TIPO_DRIVER = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_PATH = "src/test/chromedriver";
    // Web Login
    public static final String LOG_TXT_USUARIO_XPATH = "//input[@name='user']";
    public static final String LOG_TXT_PASSWORD_XPATH = "//input[@name='password']";
    public static final String LOG_RECAPTCHA_XPATH = "//*[@id=\"recaptcha-anchor\"]/div[1]";
    public static final String LOG_BTN_INGRESAR_XPATH = "//button[@class='form-login-content__btn form-login-content__btn--enabled']";

    // propiedades para mobile parametrista
    public static final double OXIGENO_MANANA_MIN = 0.0;
    public static final double OXIGENO_MANANA_MAX = 10.0;

    public static final double OXIGENO_TARDE_MIN = 0.0;
    public static final double OXIGENO_TARDE_MAX = 16.0;

    public static final double OXIGENO_NOCHE_MIN = 0.0;
    public static final double OXIGENO_NOCHE_MAX = 10.0;

    public static final double TEMPERATURA_MANANA_MIN = 18.0;
    public static final double TEMPERATURA_MANANA_MAX = 32.0;

    public static final double TEMPERATURA_TARDE_MIN = 20.0;
    public static final double TEMPERATURA_TARDE_MAX = 36.0;

    public static final double TEMPERATURA_NOCHE_MIN = 18.0;
    public static final double TEMPERATURA_NOCHE_MAX = 32.0;

    public static final int NIVEL_AGUA_MIN = 0;
    public static final int NIVEL_AGUA_MAX = 60;


    public static final double SALINIDAD_MIN = 0.0;
    public static final double SALINIDAD_MAX = 40.0;

    public static final int TRANSPARENCIA_MIN = 5;
    public static final int TRANSPARENCIA_MAX = 100;

    public static final double PH_MIN = 3.0;
    public static final double PH_MAX = 12.0;

    public static final int ALCALINIDAD_MIN = 60;
    public static final int ALCALINIDAD_MAX = 300;

    // Parametros para Configuracion por Tiempo

    // propiedades para mobile parametrista
    public static final double OXIGENO_TIEMPO_MIN = 0.0;
    public static final double OXIGENO_TIEMPO_MAX = 16.0;

    public static final double TEMPERATURA_TIEMPO_MIN = 18.0;
    public static final double TEMPERATURA_TIEMPO_MAX = 36.0;

}
