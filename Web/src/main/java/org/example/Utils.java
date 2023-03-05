package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Utils {
    public  WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public void navigateToUrl(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void waitForElementInvisibility (WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForElementVisibility (WebDriver driver,WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void staticWait () {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean assertText (String actual, String expected) {
        try {
            Assert.assertEquals(actual, expected);
            return true; // The assertion succeeded, so return true
        } catch (AssertionError e) {
            return false; // The assertion failed, so return false
        }
    }



    public void closeBrowser (WebDriver driver) {
        driver.quit();
    }


}
