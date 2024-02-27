package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class InventoryPage extends BasePage {
    @FindBy(css = "span.title")
    private WebElement productsTitle;

    @FindBy(id = "item_5_title_link")
    private WebElement itemLink;

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
}
