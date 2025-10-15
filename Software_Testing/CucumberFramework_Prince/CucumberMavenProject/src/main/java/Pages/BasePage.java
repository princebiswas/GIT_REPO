package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorReader;

public class BasePage {
	public WebDriver driver;
	public LocatorReader loatorReader;
	
	public BasePage(WebDriver driver)
	{
	this.driver = driver;
	this.loatorReader=  new LocatorReader("Locators\\homepage_locator.json");
	}
	
	public WebElement getElement(String key)
	{
		String type = loatorReader.getLoctorType(key);
		String value = loatorReader.getLoctorValue(key);
		switch(type)
		{
		case "id" : return driver.findElement(By.id(value));
		case "name" : return driver.findElement(By.name(value));
		case "xpath" : return driver.findElement(By.xpath(value));
		case "css" : return driver.findElement(By.cssSelector(value));
		case "linktext" : return driver.findElement(By.linkText(value));
		default : throw new IllegalArgumentException("Unsupported Locator Type :"+type);
		}
	}

}
