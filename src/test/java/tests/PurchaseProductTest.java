package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ItemDetailsPage;
import pages.ShoppingCartPage;
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

        // Go to cart
        ShoppingCartPage shoppingCartPage = itemDetailsPage.clickGoToCartButton();

        // Go to checkout


        // Fill personal information


        // Confirm purchase


        // Check the thank you screen


        softAssert.assertAll();
    }
}
