package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Firefox extends TestBase{

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        String url = "http://facebook.com/";
        String email_address = "taysan003+1@gmail.com";
        String password ="Ivanov01";

        FirefoxProfile testprofile = new FirefoxProfile();
        testprofile.setPreference("dom.webnotifications.enabled", false);
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability(FirefoxDriver.PROFILE, testprofile);
        FirefoxOptions opt = new FirefoxOptions();
        opt.merge(dc);

        driver =  new FirefoxDriver(opt);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get(url);


        wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        String copyright = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'pageFooter\']/div[3]/div/span"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(email_address);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(password);


        if(isElementPresent(driver, By.id("u_0_2"))){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_2"))).click();
        } else if (isElementPresent(driver, By.id("u_0_3"))){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_3"))).click();
        } else if (isElementPresent(driver, By.id("u_0_w"))) {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_w"))).click();
        }
        driver.navigate().refresh();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span"))).click();
        String friends = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='_gs6']"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userNavigationLabel"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']" +
                "//a[@class='_54nc']//span//span[@class='_54nh']"))).click();
        driver.close();
        System.out.println("Browser is: Firefox");
        System.out.println("Title of the page: " + title);
        System.out.println("Copyright: " + copyright);
        System.out.println("You have " + friends + " friends");

    }
}
