package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CheckoutStepOnePage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public CheckoutStepOnePage(WebDriver driver){
        super(driver);
    }

    public void setFirstName(String firstName){
        waitUntilVisibleElement(this.firstNameInput);
        this.firstNameInput.click();
        this.firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        waitUntilVisibleElement(this.lastNameInput);
        this.lastNameInput.click();
        this.lastNameInput.sendKeys(lastName);
    }

    public void setPostalCode(int postalCode){
        waitUntilVisibleElement(this.postalCodeInput);
        this.postalCodeInput.click();
        this.postalCodeInput.sendKeys(String.valueOf(postalCode));
    }

    public CheckoutStepTwoPage clickContinueButton(){
        waitUntilVisibleElement(this.continueButton);
        this.continueButton.click();
        return new CheckoutStepTwoPage(getDriver());
    }
}
