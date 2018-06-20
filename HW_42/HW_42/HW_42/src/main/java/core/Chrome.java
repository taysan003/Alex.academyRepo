package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
   /* By by;*/

    public static boolean isPresent(final By by) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        if (!driver.findElements(by).isEmpty()) return true;
        else return false;
    }


    public static void main(String[] args) throws InterruptedException {
        By email = By.id("email");
        By passwordField = By.id("pass");
        By login = By.id("loginbutton");
        By copyrightSign = By.xpath("//*[@id=\'pageFooter\']/div[3]/div/span");
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


        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        String copyright = fluentWait.until(ExpectedConditions.presenceOfElementLocated(copyrightSign)).getText();
        Dimension copyRightSize = driver.findElement(copyrightSign).getSize();
        Point copyRightLocation = driver.findElement(copyrightSign).getLocation();

        wait.until(ExpectedConditions.presenceOfElementLocated(email)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(email_address);
        Dimension emailSize = driver.findElement(email).getSize();
        Point emailLocation = driver.findElement(email).getLocation();

        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField)).sendKeys(password);
        Dimension passwordSize = driver.findElement(passwordField).getSize();
        Point passwordLocation = driver.findElement(passwordField).getLocation();

        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
       /* Dimension loginSize = driver.findElement(login).getSize();
        Point loginLocation = driver.findElement(login).getLocation();*/


        wait.until(ExpectedConditions.elementToBeClickable(profileButton)).click();

        Dimension timeLineSize = null;
        Point timeLineLocation = null;
        By timeLineButton = null;
        if (isElementPresent(driver, By.id("u_fetchstream_5_9"))) {
            timeLineButton = By.id("u_fetchstream_5_9");
            wait.until(ExpectedConditions.elementToBeClickable(timeLineButton)).click();
            timeLineSize = driver.findElement(timeLineButton).getSize();
            timeLineLocation = driver.findElement(timeLineButton).getLocation();

        } else if (isElementPresent(driver, By.id("u_0_19"))) {
            timeLineButton = By.id("u_0_19");
            wait.until(ExpectedConditions.elementToBeClickable(timeLineButton)).click();
            timeLineSize = driver.findElement(timeLineButton).getSize();
            timeLineLocation = driver.findElement(timeLineButton).getLocation();
        } else if (isElementPresent(driver, By.id("u_fetchstream_4_a"))) {
            timeLineButton = By.id("u_fetchstream_4_a");
            wait.until(ExpectedConditions.elementToBeClickable(timeLineButton)).click();
            timeLineSize = driver.findElement(timeLineButton).getSize();
            timeLineLocation = driver.findElement(timeLineButton).getLocation();
        }

        driver.navigate().refresh();

        String friends = wait.until(ExpectedConditions.presenceOfElementLocated(friendsButton)).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(friendsButton)).getText();
        Dimension friendsButtonSize = driver.findElement(friendsButton).getSize();
        Point friendsButtonLocation = driver.findElement(friendsButton).getLocation();

        wait.until(ExpectedConditions.presenceOfElementLocated(userNavigationButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(accountSettingsButton)).click();
        Dimension accountSettingsButtonSize = driver.findElement(accountSettingsButton).getSize();
        Point accountSettingsButtonLocation = driver.findElement(accountSettingsButton).getLocation();

        wait.until(ExpectedConditions.presenceOfElementLocated(userNavigationButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(logOutButton)).click();
       /* Dimension logOutButtonSize = driver.findElement(logOutButton).getSize();
        Point logOutButtonLocation = driver.findElement(logOutButton).getLocation();*/


        System.out.println("01. Browser is: Firefox");
        System.out.println("02. Title of the page: " + driver.getTitle());
        System.out.println("03. Element [Copyright Text]: " +
                (isPresent(copyrightSign) ? "Exists" : " Not exist "));
        System.out.println("04. Size of [Copyright Text]: " + copyRightSize);
        System.out.println("05. Location of [Copyright Text]: " + copyRightLocation);
        System.out.println("06. Element [Email Field]: " +
                (isPresent(email) ? "Exists" : " Not exist "));
        System.out.println("07. Size of Email Field: " + emailSize);
        System.out.println("08. Location of Email Field: " + emailLocation);
        System.out.println("09. Element [Password Field]: " +
                (isPresent(passwordField) ? "Exists" : " Not exist "));
        System.out.println("10. Size of Password Field: " + passwordSize);
        System.out.println("11. Location of Password Field: " + passwordLocation);
        System.out.println("12. Element [Login Button]: " +
                (isPresent(login) ? "Exists" : " Not exist "));
        /*System.out.println("13. Size of Login Button:  " + loginSize);
        System.out.println("14. Location of Login Button:  " + loginLocation);
*/

            System.out.println("15. Element [Timeline Button]:  " +
                    (isPresent(timeLineButton) ? "Exists" : " Not exist "));
            System.out.println("16. Size of Timeline Button:  " + timeLineSize);
            System.out.println("17. Location of Timeline Button:   " + timeLineLocation);
//        } else if (isElementPresent(driver, By.id("u_0_19"))) {
//            System.out.println("15. Element [Timeline Button]:  " +
//                    (isPresent(By.xpath("u_0_19")) ? "Exists" : " Not exist "));
//            System.out.println("16. Size of Timeline Button:  " + timeLineSize);
//            System.out.println("17. Location of Timeline Button:   " + timeLineLocation);
//        } else if (isElementPresent(driver, By.id("u_fetchstream_4_a"))) {
//            System.out.println("15. Element [Timeline Button]:  " +
//                    (isPresent(By.xpath("u_fetchstream_4_a")) ? "Exists" : " Not exist "));
//            System.out.println("16. Size of Timeline Button:  " + timeLineSize);
//            System.out.println("17. Location of Timeline Button:   " + timeLineLocation);
//        }
        System.out.println("18. Element [Friends Button]: " +
                (isPresent(By.xpath("u_fetchstream_4_a")) ? "Exists" : " Not exist "));
        System.out.println("19. Size of Friends Button:   " + friendsButtonSize);
        System.out.println("20. Location of Friends Button:   " + friendsButtonLocation);
        System.out.println("21. Element [Account Settings]: " +
                (isPresent(accountSettingsButton) ? "Exists" : " Not exist "));
        System.out.println("22. Size of Account Settings:   " + accountSettingsButtonSize);
        System.out.println("23. Location of Account Settings:   " + accountSettingsButtonLocation);
        System.out.println("24. Element [Log Out Button]:   " +
                (isPresent(logOutButton) ? "Exists" : " Not exist "));
      /*  System.out.println("25. Size of Log Out Button:   " + logOutButtonSize);
        System.out.println("26. Location of Log Out Button:   " + logOutButtonLocation);*/
        System.out.println("27. Copyright: " + copyright);
        System.out.println("28. You have "+ friends + " friends");
        driver.quit();

    }

}
