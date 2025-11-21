Feature: Test all scenario for Home Page
    @Smoke
    Scenario Outline: Verify all functionality in home page
	Given I navigate to the Ebay UI
	And I click on Shop by category
	And I select a product from Motors <Product1>

	Examples:
	|Product1|Product2|
	|Motorcycle| Watch|


