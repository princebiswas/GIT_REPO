package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver,"homepage_locator.json");
		
	}
	
	public void ShopByCategory()
	{
		getElement("ShopByCategory").click();
	}
	
	public void SelectProduct(String Product1)
	{
		getElement("Motorcycle").click();
	}
	
	
 
}
