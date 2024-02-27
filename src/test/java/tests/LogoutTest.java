package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

import static org.junit.Assert.assertTrue;

public class LogoutTest extends BaseTest {
    @Test
    public void logout(){
        // Click burguer menu
        inventoryPage.clickBurguerMenu();

        // Click on logout
        LoginPage loginPage = inventoryPage.clickLogOutButton();

        // Verify the login page
        softAssert.assertTrue(loginPage.isLoginButtonDisplayed());

        softAssert.assertAll();
    }
}
