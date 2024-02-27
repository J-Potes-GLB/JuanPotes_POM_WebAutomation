package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ItemDetailsPage extends BasePage {
    @FindBy(className = "btn_inventory")
    private WebElement addToCartButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement goToCartButton;

    public ItemDetailsPage(WebDriver driver){
        super(driver);
    }

    public void clickAddToCartButton(){
        waitUntilVisibleElement(this.addToCartButton);
        this.addToCartButton.click();
    }

    public ShoppingCartPage clickGoToCartButton(){
        waitUntilVisibleElement(this.goToCartButton);
        this.goToCartButton.click();
        return new ShoppingCartPage(getDriver());
    }
}
