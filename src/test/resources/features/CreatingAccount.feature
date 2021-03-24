Feature: Register to site scenario
  As a test engineer
  I want to be able to create an account in test site

  Scenario: Create an account
    Given I am on shop page
    And I click sign in button
    When I enter email: gatis@email.com for registration
    And I click Create account button
    Then I should see registration page heading CREATE AN ACCOUNT
    When I fill field First Name with value Gatis
    And I fill field Last Name with value Zagars
    And I fill field Password with value 12345
    And I fill field Address with value Living str. 15
    And I fill field City with value TestCity
#    ToDo And I fill field State with value Florida
    And I fill field Zip with value 54321
#    ToDo And I fill field Country with value United States
    And I fill field MobilePhone with value 12345678
    And I click  on Register button
#   ToDo Then I should see MyAccount page heading My account
