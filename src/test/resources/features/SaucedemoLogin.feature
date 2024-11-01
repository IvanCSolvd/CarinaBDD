Feature: Saucedemo login functionality
  In order to use Cucumber in my project, I want to check how to test Saucedemo website

  @login
  Scenario: Login with valid credentials - passing
    Given I am on login page of Saucedemo website
    When I enter valid username and password and click on Login button
    Then page 'Catalog' should be open
