package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    // elements
    public static WebElement searchBox (WebDriver driver) {
        return driver.findElement(By.id("txtSearch"));
    }

    public static WebElement cookiesAcceptBtn (WebDriver driver) {
        return driver.findElement(By.id("onetrust-accept-btn-handler"));
    }

    public static WebElement searchButton (WebDriver driver) {
        return driver.findElement(By.id("cmdSearch"));
    }

    // actions

    public static void acceptCookiesPopup (WebDriver driver) {
        WebElement cookiesAllowButton = cookiesAcceptBtn(driver);
        cookiesAllowButton.click();
    }

    public static void fillSearchBox(WebDriver driver, String text) {
        WebElement searchBox = searchBox(driver);
        searchBox.sendKeys(text);
    }

    public static void clickSearchButton(WebDriver driver) {
        WebElement searchButton = searchButton(driver);
        searchButton.click();

    }


}
