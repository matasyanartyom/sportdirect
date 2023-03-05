
import POM.HomePage;
import POM.MyBagPage;
import POM.ProductCardPage;
import POM.SearchResultsPage;
import org.example.Connsts;
import org.example.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyTest {



    @org.testng.annotations.Test
    public void mytest () {
        Utils util = new Utils();
        WebDriver driver = util.createDriver();

        // Step 1 - navigate to the page
        try {
            util.navigateToUrl(driver, Connsts.url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Step 2 - accept the cookies popup
        try {
            HomePage.acceptCookiesPopup(driver);
            util.waitForElementInvisibility(driver,HomePage.cookiesAcceptBtn(driver));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Step 3 - fill the search box
        try {
            HomePage.fillSearchBox(driver, Connsts.productName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Step 4 - click on the search button
        try {
            HomePage.clickSearchButton(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Step 5 - click on the search result

        try {
            List<WebElement> itemsList = SearchResultsPage.searchResultContainer(driver);
            SearchResultsPage.clickOnSearchResultItemByIndex(itemsList, driver, 3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Step 6 - add a product to the bag

        try {
            util.waitForElementVisibility(driver, ProductCardPage.addToBag(driver));
            ProductCardPage.clickAddToBag(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Step 7 - click on the bag icon

        try {
            util.staticWait();
            ProductCardPage.clickOnBagIcon(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Step 8 - getting subtitle text and asserting with expected result

        String addedItemsCount = null;
        try {
            addedItemsCount = MyBagPage.getSubtitleLabelText(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        util.assertText(addedItemsCount, Connsts.expectedText);

        // Step 9 - click on continue securely button

        MyBagPage.clickContinueSecurelyButton(driver);

        //Closing the browser

        util.closeBrowser(driver);

    }

}
