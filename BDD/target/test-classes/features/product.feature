Feature: Search and place order for a mobile

  @SeleniumTest
  Scenario: Search for a mobile and then move to checkout page
    Given User have lauched on ebay website
    When User search for "One plus 6" mobile
    And User Clicked on the first mobile "One Plus 6"
    And Added mobile  to cart
   #Then Verify "One Plus 6" is selected
    
    Examples:
    |name|
    |Oneplus 6|
    