package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ItemDetailsPage;
import utils.BaseTest;

public class PurchaseProductTest extends BaseTest {
    @Test
    public void purchaseProduct(){
        // Check we are in the InventoryPage
        softAssert.assertEquals(inventoryPage.getProductsTitleText(), "Products");

        // Click on the item name and go to the ItemDetailsPage
        ItemDetailsPage itemDetailsPage = inventoryPage.clickItemLink();

        // Add the product to the cart
        itemDetailsPage.clickAddToCartButton();

        softAssert.assertAll();
    }
}
