package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver = null;

    public void setDriver(){
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public void login(){
        //Wait until page is shown
        //Click on Username input
        //Send Username
        //Click on Password
        //Send Password
        //Click on Login
    }

    @BeforeMethod
    public void prerequisites(){
        setDriver();
        login();
    }

}
