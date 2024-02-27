package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver = null;

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
        loginPage.clickOnLoginButton();
    }

    @BeforeMethod
    @Parameters({"userName", "password"})
    public void prerequisites(String userName, String password){
        setDriver();
        login(userName, password);
    }
}
