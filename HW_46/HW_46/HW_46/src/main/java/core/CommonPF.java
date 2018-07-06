package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPF {

	static WebDriver driver;

	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		PageFactory.initElements(driver, CommonPF.class);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	
	public static void quite() {
		driver.quit();
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false;
	}
	
    public static boolean isPresentPF(WebElement element) {
//    	if (element.getTagName() != null) return true; else return false;
        try {element.getTagName();
			return true;}
        		catch (NoSuchElementException e) {
        	return false;}
    }

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed())
			return true;
		else return false;
	}
	
public static void pageValidation(String test_case, By el) {
		System.out.println(test_case +	(Common.isPresent(el) ? "Exists" : "Not exist")); 
}

public static void pageValidationPF(String test_case, WebElement element) {
	System.out.println(test_case +	(isPresentPF(element) ? "Exists" : "Not exist")); 
}

	//static By el_01 = By.id("id_quotes");						// signup
	@FindBy(id="id_quotes") @CacheLookup static WebElement pf_el_01;

	@FindBy(id="id_current_location") static WebElement pf_el_02;				// signup
	@FindBy(id="id_weather_icon") static WebElement pf_el_03;					// signup
	@FindBy(id="id_temperature") static WebElement pf_el_04;					// signup
	@FindBy(id="id_f_title") static WebElement pf_el_05;						// signup & confirmation

	@FindBy(id="id_f_label_fn") static WebElement pf_el_06;					// signup & confirmation
	
	//static By el_07 = By.id("id_fname");							// signup & confirmation
	@FindBy(id="id_fname") @CacheLookup static WebElement pf_el_07;
	@FindBy(id="id_f_label_ln") static WebElement pf_el_08;					// signup & confirmation
	@FindBy(id="id_lname") static WebElement pf_el_09;							// signup & confirmation

	@FindBy(id="id_f_label_ea") static WebElement pf_el_10;					// signup & confirmation
	@FindBy(id="id_email") static WebElement pf_el_11;							// signup & confirmation

	@FindBy(id="id_f_label_pn") static WebElement pf_el_12;					// signup & confirmation
	@FindBy(id="id_phone") static WebElement pf_el_13;							// signup & confirmation

	@FindBy(id="id_rb_label_g") static WebElement pf_el_14;					// signup & confirmation

	@FindBy(id="id_rb_label_m") static WebElement pf_el_15;					// signup
	@FindBy(id="id_gender_male") static WebElement pf_el_16;					// signup

	@FindBy(id="id_rb_label_f") static WebElement pf_el_17;					// signup
	@FindBy(id="id_gender_female") static WebElement pf_el_18;					// signup

	@FindBy(id="id_f_label_s") static WebElement pf_el_19;						// signup & confirmation
	@FindBy(id="id_state") static WebElement pf_el_20;							// signup & confirmation
	@FindBy(xpath ="//*[@id='id_state']/option[6]") static WebElement pf_el_21; 	// signup

	@FindBy(id="id_cb_label_t") static WebElement pf_el_22;					// signup & confirmation
	@FindBy(id="id_terms") static WebElement pf_el_23;							// signup & confirmation

	@FindBy(id="id_img_facebook") static WebElement pf_el_24;					// signup
	@FindBy(id="id_img_twitter") static WebElement pf_el_25;					// signup
	@FindBy(id="id_img_flickr") static WebElement pf_el_26;					// signup
	@FindBy(id="id_img_youtube") static WebElement pf_el_27;					// signup

	@FindBy(id="id_reset_button") static WebElement pf_el_28;					// signup
	@FindBy(id="id_submit_button") static WebElement pf_el_29;					// signup

	@FindBy(id="timestamp")static WebElement pf_el_30;						// signup
	@FindBy(id="copyright") static WebElement pf_el_31;						// signup & confirmation
	@FindBy(id="os_browser") static WebElement pf_el_32;						// signup

	@FindBy(id="ErrorLine") static WebElement pf_el_33;						// signup
	@FindBy(id="fname_error") static WebElement pf_el_34;						// signup
	@FindBy(id="lname_error") static WebElement pf_el_35;						// signup
	@FindBy(id="email_error") static WebElement pf_el_36;						// signup
	@FindBy(id="phone_error") static WebElement pf_el_37;						// signup

	@FindBy(xpath="//*[@id='fname_error']/img") static WebElement pf_el_38;		// signup
	@FindBy(xpath="//*[@id='lname_error']/img") static WebElement pf_el_39;		// signup
	@FindBy(xpath="//*[@id='email_error']/img") static WebElement pf_el_40;		// signup
	@FindBy(xpath="//*[@id='phone_error']/img") static WebElement pf_el_41;		// signup

	@FindBy(xpath="id_gender") static WebElement pf_el_42;						//confirmation
	@FindBy(xpath="id_back_button") static WebElement pf_el_43;					//confirmation
	
}
