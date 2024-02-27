package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import utils.BaseTest;

import java.util.List;

public class RemovingElementsTest extends BaseTest {
    @Test
    public void removeElements(){
        // Check we are in the InventoryPage
        softAssert.assertEquals(inventoryPage.getProductsTitleText(), PRODUCTS_TITLE);

        // Add 3 items to the cart
        inventoryPage.addItemsToCart(3);

        // Go to the shopping cart
        ShoppingCartPage shoppingCartPage = inventoryPage.clickGoToCartButton();

        // Remove elements from the cart


        // Verify the cart is empty
        softAssert.assertFalse(shoppingCartPage.cartHasItems(),"The cart is not empty");

        softAssert.assertAll();
    }
}
