package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

public class RemovingElementsTest extends BaseTest {
    @Test
    public void removeElements(){
        // Check we are in the InventoryPage
        softAssert.assertEquals(inventoryPage.getProductsTitleText(), PRODUCTS_TITLE);
    }
}
