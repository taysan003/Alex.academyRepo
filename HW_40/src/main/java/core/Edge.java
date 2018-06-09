package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edge {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);


        /*String driverPath = "";*/
        String url = "http://alex.academy/ua";

        if (!System.getProperty("os.name").contains("Windows"))
            throw new IllegalArgumentException("MS Edge is avalible only on Windows");

        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
        String ua = driver.findElement(By.id("id_ua")).getText();
        System.out.println(ua);
        Thread.sleep(1000);

        driver.quit();
    }
}
