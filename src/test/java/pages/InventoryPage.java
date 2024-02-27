package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class InventoryPage extends BasePage {
    @FindBy(id = "item_5_title_link")
    private WebElement itemLink;

    public InventoryPage(WebDriver driver){
        super(driver);
    }
}
