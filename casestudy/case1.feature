Feature: Register Functionality

  @tag1
Scenario: Registration of user

Given User must be in home page and clicks on SignUp link
When Register by entering the following data: give username as "HongKo" and firstname as "Hong" and lastname as "Kong" and password as "hong123" and confirm password as "hong123" and gender as "#gender" and email as "hong@gmail.com" and mobile number as "9876556789" and DOB as "12/12/2012" and address as "chennai 68" and select security question as "What is your Pet Name?" and give answer as "dolphin" 
Then User must be in login page

