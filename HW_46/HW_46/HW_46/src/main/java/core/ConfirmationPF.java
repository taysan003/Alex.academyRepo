package core;

import org.openqa.selenium.WebDriver;

public class ConfirmationPF {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonPF.open(url);

		CommonPF.pageValidationPF("01. Element [Title]: ", 				CommonPF.pf_el_05);
		CommonPF.pageValidationPF("02. Element [First Name (label)]: ",	CommonPF.pf_el_06);
		CommonPF.pageValidationPF("03. Element [First Name (field)]: ", CommonPF.pf_el_07);
		CommonPF.pageValidationPF("04. Element [Last Name (label)]: ",	CommonPF.pf_el_08);
		CommonPF.pageValidationPF("05. Element [Last Name (field)]: ",	CommonPF.pf_el_09);

		CommonPF.pageValidationPF("06. Element [Email (label)]: ", 		CommonPF.pf_el_10);
		CommonPF.pageValidationPF("07. Element [Email (filed)]: ", 		CommonPF.pf_el_11);
		CommonPF.pageValidationPF("08. Element [Phone (label)]: ", 		CommonPF.pf_el_12);
		CommonPF.pageValidationPF("09. Element [Phone (field)]: ", 		CommonPF.pf_el_13);
		CommonPF.pageValidationPF("10. Element [Genre (label)]: ", 		CommonPF.pf_el_14);

		CommonPF.pageValidationPF("11. Element [Genre (field)): ", 		CommonPF.pf_el_42);
		CommonPF.pageValidationPF("12. Element [Back (button)]: ", 		CommonPF.pf_el_43);

	}
}
