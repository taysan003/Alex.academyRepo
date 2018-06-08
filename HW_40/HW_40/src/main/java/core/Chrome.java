package core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Chrome {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);

		String driverPath = "";
		String url = "http://alex.academy/ua";

		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			driverPath = "./resources/webdrivers/mac/chromedriver";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			driverPath = "./resources/webdrivers/pc/chromedriver.exe";
		else
			throw new IllegalArgumentException("Unknown OS");

		System.setProperty("webdriver.chrome.driver", driverPath);
//		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("disable-infobars");
//		option.addArguments("--disable-notifications");

		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			option.addArguments("--start-maximized");
		else
			throw new IllegalArgumentException("Unknown OS");

		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url);
		String ua = driver.findElement(By.id("id_ua")).getText();
		System.out.println("User Agent: " + ua);
		Thread.sleep(1000); // Pause in milleseconds (1000 – 1 sec)
		driver.quit();
	}
}
