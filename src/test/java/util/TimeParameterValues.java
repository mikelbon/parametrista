package util;

import java.util.Random;
import java.math.BigDecimal;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.Precision;

public class TimeParameterValues {

    public static double getOxigenValueByTyme() {
        double random = new Random().nextDouble();
        double result = Properties.OXIGENO_TIEMPO_MIN + (random * (Properties.OXIGENO_TIEMPO_MAX - Properties.OXIGENO_TIEMPO_MIN));
        return Precision.round(result, 1);
    }

    public static double getTemperatureValueByTyme() {
        double random = new Random().nextDouble();
        double result = Properties.TEMPERATURA_TIEMPO_MIN + (random * (Properties.TEMPERATURA_TIEMPO_MAX - Properties.TEMPERATURA_TIEMPO_MIN));
        return Precision.round(result, 1);
    }

    public static int getWaterLevelValueByTyme() {
        Random random = new Random();
        return random.nextInt((Properties.NIVEL_AGUA_MAX - Properties.NIVEL_AGUA_MIN) + 1) + Properties.NIVEL_AGUA_MIN;
    }

    public static double getSalinityValueByTyme() {
        double random = new Random().nextDouble();
        double result = Properties.SALINIDAD_MIN + (random * (Properties.SALINIDAD_MAX - Properties.SALINIDAD_MIN));
        return Precision.round(result, 1);
    }

    public static int getClarityValueByTyme() {
        Random random = new Random();
        return random.nextInt((Properties.TRANSPARENCIA_MAX - Properties.TRANSPARENCIA_MIN) + 1) + Properties.TRANSPARENCIA_MIN;
    }

    public static double getPHValueByTyme() {
        double random = new Random().nextDouble();
        double result = Properties.PH_MIN + (random * (Properties.PH_MAX - Properties.PH_MIN));
        return Precision.round(result, 1);
    }

    public static int getAlcalinityValueByTyme() {
        Random random = new Random();
        return random.nextInt((Properties.ALCALINIDAD_MAX - Properties.ALCALINIDAD_MIN) + 1) + Properties.ALCALINIDAD_MIN;
    }
}
