package core;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Safari {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);

		String url = "http://alex.academy/ua";

		if (!System.getProperty("os.name").contains("Mac")) {
			throw new IllegalArgumentException("Safari is available only on Mac");
		}

		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(url);
		String ua = driver.findElement(By.id("id_ua")).getText();
		System.out.println("User Agent: " + ua);

		Thread.sleep(2000); // Pause in milleseconds (1000 – 1 sec)

		driver.quit();

	}
}