Feature: Check Shop Online;

Background:
Given browser details of CVC
When browser trigerred to CVC website
Then check whether CVC browser is opened.

Scenario: Shop childrens vitamin
Given The user clicks on Shop Online and selects the category Vitamins
When the user selects Children's Vitamins and selects Enfamil Polyvisol and add to basket
Then Enfamil Polyvisol should be added to cart


Scenario: Search for Tynelol in Home Page
Given the user is in Home Page 
When the user types "Tylenol" in Search Button
Then the tynelol search result should display 


Scenario: Create An Account
Given the user is in homepage and click on Create an Account
When the user sends the Form Information
|John|Smith|john@testing.com|mypass123|mypass123|Chennai|1900 harrison Lane|APT# 123|Eden Prairie|55317|1234566789|10|12|1989|
Then the information is filled in and control ends in Create Account

@test
Scenario Outline: Sign In Functionality <!-- -->
Given the user is in homepage and clicks on Sign in 
When the user provides <email> and <password>
Then validate the user and password
Examples:
|email|password|
|vineya@gmail.com|Reheboth2019!|









