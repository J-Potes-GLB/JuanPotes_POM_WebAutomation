package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    // Constructor of the LoginPage to set the driver
    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    public void setUserName(String userName){
        waitUntilVisibleElement(this.userNameInput);
        this.userNameInput.click();
        this.userNameInput.sendKeys(userName);
    }

    public void setPassword(String password){
        waitUntilVisibleElement(this.passwordInput);
        this.passwordInput.click();
        this.passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton(){
        waitUntilVisibleElement(this.loginButton);
        this.loginButton.click();
    }
}
