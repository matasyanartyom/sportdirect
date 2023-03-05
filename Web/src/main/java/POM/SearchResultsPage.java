package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {

    // elements

    public static List<WebElement> searchResultContainer (WebDriver driver) {
        WebElement searchResultContainer = driver.findElement(By.id("navlist"));
        return driver.findElements(By.tagName("li"));
    }

    // actions
    public static void clickOnSearchResultItemByIndex (List<WebElement> searchResults, WebDriver driver, int index) {
        searchResults.get(index).click();

    }
}
