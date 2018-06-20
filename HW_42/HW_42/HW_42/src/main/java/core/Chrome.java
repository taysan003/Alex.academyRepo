package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chrome extends TestBase {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        By email = By.id("email");
        By passwordField = By.id("pass");
        By login = By.id("loginbutton");
        By copyrightSign = By.xpath("//*[@id=\'pageFooter\']/div[3]/div/span");
       /* By timeLineButton = By.xpath("//a[@id='u_fetchstream_13_b']");*/
        By profileButton = By.xpath("//div[@class='_cy6']//div[@class='_4kny']");
        By friendsButton = By.xpath("//span[@class='_gs6']");
        By userNavigationButton = By.id("userNavigationLabel");
        By accountSettingsButton = By.xpath("//html//li[13]/a[1]");
        By logOutButton = By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']//span//span[@class='_54nh']");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        String url ="http://facebook.com/";
        String email_address ="taysan003+1@gmail.com";
        String password ="Ivanov01";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifications");

        driver =  new ChromeDriver(options);
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
        String copyright = fluentWait.until(ExpectedConditions.presenceOfElementLocated(copyrightSign)).getText();

        wait.until(ExpectedConditions.presenceOfElementLocated(email)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(email_address);
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField)).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileButton)).click();

        if(isElementPresent(driver, By.id("u_fetchstream_5_9"))){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_fetchstream_5_9"))).click();
        } else if (isElementPresent(driver, By.id("u_0_19"))){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_19"))).click();
        } else if (isElementPresent(driver, By.id("u_fetchstream_4_a"))) {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_fetchstream_4_a"))).click();
        }

        driver.navigate().refresh();

        String friends = wait.until(ExpectedConditions.presenceOfElementLocated(friendsButton)).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(friendsButton)).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(userNavigationButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(accountSettingsButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(userNavigationButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(logOutButton)).click();
        driver.close();

        System.out.println("Browser is: Firefox");
        System.out.println("Title of the page: " + title);
        System.out.println("Copyright: " + copyright);
        System.out.println("You have " + friends + " friends");
    }

}
