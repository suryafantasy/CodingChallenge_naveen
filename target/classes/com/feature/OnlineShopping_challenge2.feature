@tag
Feature: Online shopping_coding challenge 2
  @onlineShopping
  Scenario: Get items from the sections and sort
    Given launch the url
    And chose section and display the items in sorted order
    @addToCart
 Scenario Outline: Add item to cart which has high pricing
 Given launch the url
 When login with "<username>" and "<password>"
 Then add item with high price to cart
  Examples:
|username|password|
|standard_user|secret_sauce|