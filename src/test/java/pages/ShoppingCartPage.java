package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ShoppingCartPage extends BasePage {
    // id = "checkout"
    @FindBy(name = "checkout")
    private WebElement checkoutButton;

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    public CheckoutStepOnePage clickCheckoutButton(){
        waitUntilVisibleElement(this.checkoutButton);
        this.checkoutButton.click();
        return new CheckoutStepOnePage(getDriver());
    }
}
