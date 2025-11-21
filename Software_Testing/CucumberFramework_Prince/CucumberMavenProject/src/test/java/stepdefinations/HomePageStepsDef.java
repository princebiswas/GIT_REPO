package stepdefinations;

import Pages.HomePage;
import hooks.TestHooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageStepsDef {

    HomePage homepage;
    WebDriver driver = TestHooks.driver;

    @Given("I navigate to the Ebay UI")
    public void iNavigateToTheEbayUI() {
        driver.get("https://www.ebay.com/");
        homepage = new HomePage(driver);
    }

    @And("I click on Shop by category")
    public void iClickOnShopByCategory() throws InterruptedException {
        homepage.ShopByCategory();
        Thread.sleep(1000);
    }

    @And("I select a product from Motors(.*)$" )
    public void iSelectAProductFromMotorsProduct(String Product1) throws InterruptedException {
    	homepage.SelectProduct(Product1);
       Thread.sleep(1000);
    }

   
    
}
