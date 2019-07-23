

Feature: Login Functionality

  @tag1
Scenario Outline: Login Fuctionality

Given User must be registered and directed to login page
When login by entering <username> and <password>
Then user must be in the home page 

Examples:
|username||password|
|lalitha||password123|



