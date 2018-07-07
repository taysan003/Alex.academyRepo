package core;

import org.openqa.selenium.WebDriver;

public class SignUpPF {

    public static void validate(WebDriver driver, String url) {

        CommonPF.open(url);
        CommonPF.pageValidationPF("01. Element [Quotes (dynamic)]: ", CommonPF.pf_el_01);
        CommonPF.pageValidationPF("02. Element [Current Location]: ", CommonPF.pf_el_02);
        CommonPF.pageValidationPF("03. Element [Weather Icon]: ", CommonPF.pf_el_03);
        CommonPF.pageValidationPF("04. Element [Quotes (dynamic)]: ", CommonPF.pf_el_04);
        CommonPF.pageValidationPF("05. Element [Title]: ", CommonPF.pf_el_05);

        CommonPF.pageValidationPF("06. Element [First Name (label)]: ", CommonPF.pf_el_06);
        CommonPF.pageValidationPF("07. Element [First Name (field)]: ", CommonPF.pf_el_07);
        CommonPF.pageValidationPF("08. Element [Last Name (label)]: ", CommonPF.pf_el_08);
        CommonPF.pageValidationPF("09. Element [Last Name (field)]: ", CommonPF.pf_el_09);
        CommonPF.pageValidationPF("10. Element [Email (label)]: ", CommonPF.pf_el_10);

        CommonPF.pageValidationPF("11. Element [Email (filed)]: ", CommonPF.pf_el_11);
        CommonPF.pageValidationPF("12. Element [Phone (label)]: ", CommonPF.pf_el_12);
        CommonPF.pageValidationPF("13. Element [Phone (field)]: ", CommonPF.pf_el_13);
        CommonPF.pageValidationPF("14. Element [Genre (label)]: ", CommonPF.pf_el_14);
        CommonPF.pageValidationPF("15. Element [Male (label)]: ", CommonPF.pf_el_15);

        CommonPF.pageValidationPF("16. Element [Male (radio button)]: ", CommonPF.pf_el_16);
        CommonPF.pageValidationPF("17. Element [Female (label)]: ", CommonPF.pf_el_17);
        CommonPF.pageValidationPF("18. Element [Female (radio button)]: ", CommonPF.pf_el_18);
        CommonPF.pageValidationPF("19. Element [State (label)]: ", CommonPF.pf_el_19);
        CommonPF.pageValidationPF("20. Element [State (drop-down)]: ", CommonPF.pf_el_20);

        CommonPF.pageValidationPF("21. Element [State California (item)]: ", CommonPF.pf_el_21);
        CommonPF.pageValidationPF("22. Element [Terms (label)]: ", CommonPF.pf_el_22);
        CommonPF.pageValidationPF("23. Element [Terms (checkbox)]: ", CommonPF.pf_el_23);
        CommonPF.pageValidationPF("24. Element [Image (facebook)]: ", CommonPF.pf_el_24);
        CommonPF.pageValidationPF("25. Element [Image (twitter)]: ", CommonPF.pf_el_25);

        CommonPF.pageValidationPF("26. Element [Image (flickr)]: ", CommonPF.pf_el_26);
        CommonPF.pageValidationPF("27. Element [Image (youtube)]: ", CommonPF.pf_el_27);
        CommonPF.pageValidationPF("28. Element [Reset (button)]:  ", CommonPF.pf_el_28);
        CommonPF.pageValidationPF("29. Element [Submit (button)]: ", CommonPF.pf_el_29);
        CommonPF.pageValidationPF("30. Element [Timestamp (dynamic)]: ", CommonPF.pf_el_30);

        CommonPF.pageValidationPF("31. Element [Copyright (dynamic)]: ", CommonPF.pf_el_31);
        CommonPF.pageValidationPF("32. Element [OS & Browser (dynamic)]: ", CommonPF.pf_el_32);
        CommonPF.pageValidationPF("33. Element [Error Line]: ", CommonPF.pf_el_33);
        CommonPF.pageValidationPF("34. Element [First Name Error]: ", CommonPF.pf_el_34);
        CommonPF.pageValidationPF("35. Element [Last Name Error]: ", CommonPF.pf_el_35);

        CommonPF.pageValidationPF("36. Element [Email Error]: ", CommonPF.pf_el_36);
        CommonPF.pageValidationPF("37. Element [Phone Error]: ", CommonPF.pf_el_37);
        CommonPF.pageValidationPF("38. Element [First Name Error (img)]: ", CommonPF.pf_el_38);
        CommonPF.pageValidationPF("39. Element [Last Name Error (img)]: ", CommonPF.pf_el_39);
        CommonPF.pageValidationPF("40. Element [Email Error (img)]: ", CommonPF.pf_el_40);
        CommonPF.pageValidationPF("41. Element [Phone Error (img)]: ", CommonPF.pf_el_41);
    }
}
