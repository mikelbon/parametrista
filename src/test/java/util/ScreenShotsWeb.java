package util;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotsWeb {

        public void capturar_pantalla_json(Scenario scenario, WebDriver driver) {
            try {
                final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "image/png");
            } catch (Exception e) {
                System.out.println("Fallo al obtener la captura");
                e.printStackTrace();
                Assert.fail();
            }
        }

        public void capturar_pantalla(WebDriver driver) {
            try {
                String destDir = "screenshots";
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ssaa");
                new File(destDir).mkdirs();
                String destFile = dateFormat.format(new Date()) + ".png";
                FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("fallo al sacar screen");
                Assert.fail();
            }
        }
    }

