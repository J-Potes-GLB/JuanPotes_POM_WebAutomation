package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

public class PurchaseProductTest extends BaseTest {
    @Test
    public void purchaseProduct(){
        final String FIRST_NAME = "Juan";
        final String LAST_NAME = "Potes";
        final int POSTAL_CODE = 12345;
        final String FINAL_MESSAGE = "Thank you for your order!";

        // Check we are in the InventoryPage
        softAssert.assertEquals(inventoryPage.getProductsTitleText(), PRODUCTS_TITLE);

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
        CheckoutStepTwoPage checkoutStepTwoPage = checkoutStepOnePage.clickContinueButton();

        // Confirm purchase
        CheckoutCompletePage checkoutCompletePage = checkoutStepTwoPage.clickFinishButton();

        // Check the thank you screen
        softAssert.assertEquals(checkoutCompletePage.getThankyouMessageText(), FINAL_MESSAGE);

        softAssert.assertAll();
    }
}
