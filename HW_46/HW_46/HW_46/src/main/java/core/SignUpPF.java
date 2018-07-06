package core;

import org.openqa.selenium.WebDriver;

public class SignUpPF {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonPF.open(url);
		CommonPF.pageValidationPF("01. Element [Quotes (dynamic)]: ", CommonPF.pf_el_01);
		CommonPF.pageValidationPF("07. Element [First Name (field)]: ", CommonPF.pf_el_07);
		}
}
