package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.InventoryPage;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver driver = null;
    protected InventoryPage inventoryPage;
    protected SoftAssert softAssert = new SoftAssert();
    protected final String PRODUCTS_TITLE = "Products";

    public void setDriver(){
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public void login(String userName, String password){
        LoginPage loginPage = new LoginPage(driver, "https://www.saucedemo.com/");

        //Click on Username input and send Username
        loginPage.setUserName(userName);

        //Click on Password and send Password
        loginPage.setPassword(password);

        //Click on Login
        inventoryPage = loginPage.clickOnLoginButton();
    }

    @BeforeMethod
    @Parameters({"userName", "password"})
    public void prerequisites(String userName, String password){
        setDriver();
        login(userName, password);
    }

//    @AfterMethod
//    public void close(){
//        driver.close();
//    }
}
