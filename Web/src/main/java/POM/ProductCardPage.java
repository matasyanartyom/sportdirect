package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCardPage {


    // elements

    public static WebElement addToBag (WebDriver driver) {
        return driver.findElement(By.id("ProductStandardAddToBag"));
    }

    public static WebElement bagIcon (WebDriver driver) {
        return driver.findElement(By.id("bagQuantityContainer"));
    }

    // actions

    public static void clickAddToBag (WebDriver driver) {
        addToBag(driver).click();
    }

    public static void clickOnBagIcon (WebDriver driver) {
        bagIcon(driver).click();
    }

}
