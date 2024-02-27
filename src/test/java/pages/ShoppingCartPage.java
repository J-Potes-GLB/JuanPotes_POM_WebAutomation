package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class ShoppingCartPage extends BasePage {
    // id = "checkout"
    @FindBy(name = "checkout")
    private WebElement checkoutButton;

    @FindBy(className = "cart_button")
    private List<WebElement> removeButtons;

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartItemsNumber;

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    public CheckoutStepOnePage clickCheckoutButton(){
        waitUntilVisibleElement(this.checkoutButton);
        this.checkoutButton.click();
        return new CheckoutStepOnePage(getDriver());
    }

    private void clickRemoveButton(int index){
        waitUntilVisibleElement(this.removeButtons.get(index));
        this.removeButtons.get(index).click();
    }

    public void removeItemsFromCart(int quantity){
        System.out.println("Remove Buttons: " + this.removeButtons.size());
        if(quantity > this.removeButtons.size()){
            quantity = this.removeButtons.size();
        }
        if(quantity > 0){
            for(int i = 0; i < quantity; i++){
                clickRemoveButton(0);
            }
        }
    }

    public boolean cartHasItems(){
        if(this.removeButtons.size() > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
