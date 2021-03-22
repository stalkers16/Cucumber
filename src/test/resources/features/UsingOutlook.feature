Feature: Cucumber outline scenario
  As a test engineer
  I want to be able to write and execute a scenario outline

  @debugs
  Scenario Outline: a new scenario outline
    Given I am on shop page using po
    And I click sign in button
    When I enter email: <email> using PO
    And I enter password: <password> using PO
    And I click sign in using PO
    Then I see following message: "<message>" using PO

    Examples:
      | email           | password      | message                     |
      | ""              | ""            | An email address required.  |
      | gatis           | ""            | Invalid email address.      |
      | gatis@email.com | ""            | Password is required.       |
      | gatis@email.com | 12345         | Authentication failed.      |
