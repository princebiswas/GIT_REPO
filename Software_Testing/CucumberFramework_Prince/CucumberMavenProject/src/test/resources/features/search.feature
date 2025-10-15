Feature: Test all scenario for Home Page
	Given I navigate to the Ebay UI
	And I click on Shop by catagory 
	And I select a product from Motors <Product1>
	And I validate the product from page
	And I select a product from Clothing and accessories <Product2>
	And I validate the product from page
	Examples:
	|Product1|Product2| 
	|Motorcycle| Men| 


Feature: Test all scenario for Search Page
	Scenario Outline: Verify the user can search for Products
	Given I navigate to the UI
	And I search for a product <Product1>
	And I click on Search 
	And I validate the Search Item on the page
	And I search for a product <Product2>
	And I click on Search
	And I validate the Search Item on the page
	And I search for a product <Product3>
	And I click on Search
	And I validate the Search Item on the page
	Then I close the browser
	
	
	Examples:
	|Product1|Product2| Product2|
	|Laptop| Cell Phones| Camera|

 
 
 