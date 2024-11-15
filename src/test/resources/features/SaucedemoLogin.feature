Feature: Saucedemo login functionality
  In order to use Cucumber in my project, I want to check how to test Saucedemo website

  @login
  Scenario Outline: Login with valid credentials and purchase - passing
    Given I am on login page of Saucedemo website
    When I enter valid <username> and <password> and click on Login button
    Then page 'Catalog' should be open

    When I click the add to cart button
    And click on the Cart
    Then the product should be added

    When I click the checkout button
    And fill with my <name>, <lastname> and <zip>
    And I click the Continue button
    Then page 'Finish' should be open

    When I click the Finish Button
    Then Success mesagge should be displayed

    Examples:
      | username      | password     | name   | lastname | zip |
      | standard_user | secret_sauce |standard| user     |1099 |
      |locked_out_user| secret_sauce |locked  | user     |2000 |
