Feature: Product Search functionality
Scenario: Product Search 
Given user logged in to TestMeApp
When User search a particular product by giving key words of <product>
|product|
|head|
|trav|
Then TestMeApp displays the product
