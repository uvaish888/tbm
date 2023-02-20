Feature: To verify the functionality of the flipkart application

  Scenario: To verify the end to end functionality of the flipkart application
    Given User should hit the url of the flipkart application in google chrome browser
    When User should search the product
      | product | ipad |
    And User should apply filters and select the product
    And User should check out the product
    Then User should enter contact number
      | contact | 12345678 |
