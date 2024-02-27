package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CheckoutStepOnePage;
import pages.ItemDetailsPage;
import pages.ShoppingCartPage;
import utils.BaseTest;

public class PurchaseProductTest extends BaseTest {
    private final String FIRST_NAME = "Juan";
    private final String LAST_NAME = "Potes";
    private final int POSTAL_CODE = 12345;
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
        CheckoutStepOnePage checkoutStepOnePage = shoppingCartPage.clickCheckoutButton();

        // Fill personal information
        checkoutStepOnePage.setFirstName(FIRST_NAME);
        checkoutStepOnePage.setLastName(LAST_NAME);
        checkoutStepOnePage.setPostalCode(POSTAL_CODE);

        // Click continue
        checkoutStepOnePage.clickContinueButton();

        // Confirm purchase


        // Check the thank you screen


        softAssert.assertAll();
    }
}
