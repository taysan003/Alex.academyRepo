package core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Firefox {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        String driverPath = "";
        String url = "http://alex.academy/ua";

        if (System.getProperty("os.name").contains("Mac")){
            driverPath = "./resources/webdrivers/mac/geckodriver.sh";
        } else if (System.getProperty("os.name").contains("Windows")){
            driverPath = "./resources/webdrivers/pc/geckodriver.exe";
        } else {
            throw new  IllegalArgumentException("Unknown OS");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
        String ua = driver.findElement(By.id("id_ua")).getText();
        System.out.println(ua);
        Thread.sleep(1000);

        driver.quit();
    }
}
