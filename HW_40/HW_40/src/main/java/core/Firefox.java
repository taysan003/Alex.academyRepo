package core;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Firefox {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);

		String driverPath = "";
		String url = "http://alex.academy/ua";

		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			driverPath = "./resources/webdrivers/mac/geckodriver.sh";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			driverPath = "./resources/webdrivers/pc/geckodriver.exe";
		else
			throw new IllegalArgumentException("Unknown OS");

		System.setProperty("webdriver.gecko.driver", driverPath);

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(url);
		String ua = driver.findElement(By.id("id_ua")).getText();
		System.out.println("User Agent: " + ua);
		Thread.sleep(1000); // Pause in milleseconds (1000 – 1 sec)
		driver.quit();
	}
}