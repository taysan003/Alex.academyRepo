package core;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class TestBase {


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
        boolean areElementsPresent(WebDriver driver, String locator) {
            return driver.findElements(By.id(locator)).size() > 0;
        }


}
