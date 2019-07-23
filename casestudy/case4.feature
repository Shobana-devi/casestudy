
Feature: payment functionality
Scenario: the one where the user moves to cart without adding any item 
Given user has registered in to TestMeApp
When User search a particular product like headphones
And try to proceed to payment without adding any item in the cart
Then TestMeApp doesn't display the cart icon



 