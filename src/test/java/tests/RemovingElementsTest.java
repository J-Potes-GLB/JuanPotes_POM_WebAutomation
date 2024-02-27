package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

public class RemovingElementsTest extends BaseTest {
    @Test
    public void removeElements(){
        // Check we are in the InventoryPage
        softAssert.assertEquals(inventoryPage.getProductsTitleText(), PRODUCTS_TITLE);

        // Add 3 items to the cart
        inventoryPage.addItemsToCart(3);
    }
}
