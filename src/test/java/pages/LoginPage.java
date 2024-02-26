package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class LoginPage extends BasePage {
    private WebElement userNameInput;

    private WebElement passwordInput;

    private WebElement loginButton;

    // Constructor of the LoginPage to set the driver
    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    public void setUserName(String userName){

    }

    public void setPassword(String password){

    }

    public void clickOnLoginButton(){

    }
}
