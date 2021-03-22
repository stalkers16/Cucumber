Feature: Cucumber outline scenario
  As a test engineer
  I want to be able to write and execute a scenario outline

  Scenario Outline: a new scenario outline
    Given I am on shop page
    And I click sign in button
    When I enter email: <email> for authentification
    And I enter password: <password> for authentification
    And I click sign in using PO
    Then I see following message: "<message>" of authentification

    Examples:
      | email           | password      | message                     |
      | ""              | ""            | An email address required.  |
      | gatis           | ""            | Invalid email address.      |
      | gatis@email.com | ""            | Password is required.       |
      | gatis@email.com | 12345         | Authentication failed.      |
