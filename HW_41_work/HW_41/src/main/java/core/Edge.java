package core;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edge {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        String url ="http://facebook.com/";
        String email_address ="taysan003+1@gmail.com";
        String password ="Ivanov01";

        driver = new EdgeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        String copyright = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'pageFooter\']/" +
                "div[3]/div/span"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(email_address);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span"))).click();
        String friends = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='_gs6']"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userNavigationLabel"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']//span//span[@class='_54nh']"))).click();

        
        driver.close();
        System.out.println("Browser is: Firefox");
        System.out.println("Title of the page: " + title);
        System.out.println("Copyright: " + copyright);
        System.out.println("You have " + friends + " friends");
    }
}
