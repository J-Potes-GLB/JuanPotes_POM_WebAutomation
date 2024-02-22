package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PurchaseProductTest {
    @Test
    public void purchaseProduct(){
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);
    }
}
