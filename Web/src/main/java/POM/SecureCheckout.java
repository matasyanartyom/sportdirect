package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureCheckout {

    // elements

    public WebElement emailForm (WebDriver driver) {
        return driver.findElement(By.id("email"));
    }

    // actions

    public void fillEmailForm (WebDriver driver, String email) {
        emailForm(driver).sendKeys(email);
    }
}
