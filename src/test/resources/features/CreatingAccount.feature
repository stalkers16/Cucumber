Feature: Register to site scenario
  As a test engineer
  I want to be able to create an account in test site

  Scenario: Create an account
    Given I am on shop page
    And I click sign in button
    When I enter email: gatis@email.com for registration
    And I click Create account button
    Then I should see registration page heading CREATE AN ACCOUNT

    When I fill fields with values
   # | Field_ID            | value          |
    | customer_firstname  | Gatis          |
    | customer_lastname   | Zagars         |
    | passwd              | 12345          |
    | address1            | Living str. 15 |
    | city                | TestCity       |
    | postcode            | 54321          |
    | phone_mobile        | 12345678       |

    And I fill rest fields with corresponding values
    #| Field_ID            | Value          |
    | id_state            | Florida        |
    | id_country          | United States  |
    | months              | November       |
    | newsletter          | 1              |
    | id_gender2          | 2              |
    | years               | 1967           |
    | days                | 15             |

    And I click  on Register button
#   ToDo Then I should see MyAccount page heading My account
#   ToDo Implement headers.