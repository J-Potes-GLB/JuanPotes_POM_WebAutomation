package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CheckoutCompletePage extends BasePage {
    @FindBy(className = "complete-header")
    private WebElement thankyouMessage;

    public CheckoutCompletePage(WebDriver driver){
        super(driver);
    }

    public String getThankyouMessageText(){
        waitUntilVisibleElement(this.thankyouMessage);
        return this.thankyouMessage.getText();
    }
}
