package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class InventoryPage extends BasePage {
    @FindBy(css = "span.title")
    private WebElement productsTitle;

    // id = "item_5_title_link"
    @FindBy(xpath = "//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]/ancestor::a")
    private WebElement itemLink;

    @FindBy(className = "btn_primary")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "shopping_cart_link")
    private WebElement goToCartButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burguerMenu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public InventoryPage(WebDriver driver){
        super(driver);
    }

    public ItemDetailsPage clickItemLink(){
        waitUntilVisibleElement(this.itemLink);
        this.itemLink.click();
        return new ItemDetailsPage(super.getDriver());
    }

    public String getProductsTitleText(){
        waitUntilVisibleElement(this.productsTitle);
        return this.productsTitle.getText();
    }

    private void clickAddToCartButton(int index){
        waitUntilVisibleElement(this.addToCartButtons.get(index));
        this.addToCartButtons.get(index).click();
    }

    public void addItemsToCart(int quantity){
        if(quantity > this.addToCartButtons.size()){
            quantity = this.addToCartButtons.size();
        }
        if(quantity > 0){
            for(int i = 0; i < quantity; i++){
                clickAddToCartButton(i);
            }
        }
    }

    public ShoppingCartPage clickGoToCartButton(){
        waitUntilVisibleElement(this.goToCartButton);
        this.goToCartButton.click();
        return new ShoppingCartPage(getDriver());
    }

    public void clickBurguerMenu(){
        waitUntilVisibleElement(this.burguerMenu);
        this.burguerMenu.click();
    }

    public LoginPage clickLogOutButton(){
        waitUntilVisibleElement(this.logoutButton);
        this.logoutButton.click();
        return new LoginPage(getDriver());
    }
}
