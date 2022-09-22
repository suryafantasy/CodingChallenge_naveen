@tags
Feature: Title of your feature
  I want to use this template for my feature file


 @MakeMyTrip
 Scenario: Validating home page
 When user launches url
 When user selects round trip radio button
 Then user selects from and to location from the drop down
 When user selects the departure and return date from calender
 #Then user clicks on search button
 
 Scenario Outline: Login Page
 When user launches url "https://www.makemytrip.com"
 Then enter the "<username>" and "<password>"
 Then user enter add person icon
 When user launches url "https://www.makemytrip.com"
 Examples:
|username|password|
|suryaautomation|Blueblack|

 
 