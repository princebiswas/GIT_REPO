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
