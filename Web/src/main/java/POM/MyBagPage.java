package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBagPage {

    // elements

    public static WebElement subTitleLabel (WebDriver driver) {
       return driver.findElement(By.id("SubtotalLabel"));

    }

    public static WebElement continueSecurlyButton (WebDriver driver) {
        return driver.findElement(By.id("divContinueSecurely"));
    }


    // actions

    public static String getSubtitleLabelText (WebDriver driver) {
        return subTitleLabel(driver).getText();
    }

    public static void clickContinueSecurelyButton (WebDriver driver) {
        continueSecurlyButton(driver).click();
    }
}


