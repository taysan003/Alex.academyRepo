package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
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
        wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
        String title = driver.getTitle();

        String copyright = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'pageFooter\']/" +
                "div[3]/div/span"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(email_address);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span"))).click();
        String friends = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html//div[@id='content']//li[3]" +
                "/a[1]"))).getText();
        /*Thread.sleep(2000);

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler).close(); // switch to popup window

// Now you are in the popup window, perform necessary actions here

        driver.switchTo().window(parentWindowHandler);  // switch back to parent window
        Thread.sleep(2000);*/
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
