package core;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Firefox {

	public static String myMacAddress() throws IOException {
		String mac_address;
		String cmd_mac = "ifconfig en0";
		String cmd_win = "cmd /C for /f \"usebackq tokens=1\" %a in (`getmac ^| findstr Device`) do echo %a";

		if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) {
			mac_address = new Scanner(Runtime.getRuntime().exec(cmd_win).getInputStream()).useDelimiter("\\A").next().split(" ")[1];}
		else {mac_address = new Scanner(Runtime.getRuntime().exec(cmd_mac).getInputStream()).useDelimiter("\\A").next().split(" ")[4];}
		mac_address = mac_address.toLowerCase().replaceAll("-", ":");
		return mac_address;
	}
	static boolean isElementPresent(WebDriver driver, By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (InvalidSelectorException ex){
			throw ex;
		}
		catch (NoSuchElementException ex) {
			return false;
		}
	}


	public static String decrypt(String encryptedText, SecretKey secretKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher;
		cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		String decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)));
		return decryptedText;
	}

	public static void main(String[] args) throws InterruptedException, IOException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {


		String email_address = "taysan003+1@gmail.com";
		String password = decrypt("0JZtiiiw7l7whwrhCCUIPA==", new SecretKeySpec(Arrays.copyOf(myMacAddress().getBytes("UTF-8"), 16), "AES"));


		Logger.getLogger("").setLevel(Level.OFF);
		String url = "https://www.facebook.com/";

		String driverPath = "";
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			driverPath = "./resources/webdrivers/mac/geckodriver.sh";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			driverPath = "./resources/webdrivers/pc/geckodriver.exe";
		else
			throw new IllegalArgumentException("Unknown OS");
		System.setProperty("webdriver.gecko.driver", driverPath);
		FirefoxProfile testprofile = new FirefoxProfile();
		testprofile.setPreference("dom.webnotifications.enabled", false);
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, testprofile);
		FirefoxOptions opt = new FirefoxOptions();
		opt.merge(dc);

		WebDriver driver =  new FirefoxDriver(opt);
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

		String copyright = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'pageFooter\']" +
				"/div[3]/div/span"))).getText();
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
