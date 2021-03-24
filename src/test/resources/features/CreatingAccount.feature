Feature: Register to site scenario
  As a test engineer
  I want to be able to create an account in test site

  Scenario: Create an account
    Given I am on shop page
    And I click sign in button
    When I enter email: gatis@email.com for registration
    And I click Create account button
    Then I should see registration page heading AUTHENTICATION
    When I fill field First Name with value Gatis
