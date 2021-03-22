Feature: Cucumber outline scenario
  As a test engineer
  I want to be able to write and execute a scenario outline

  @debugs
  Scenario Outline: a new scenario outline
<<<<<<< HEAD
    Given I am on shop page using po
    And I click sign in button
    When I enter email: <email> using PO
    And I enter password: <password> using PO
    And I click sign in using PO
    Then I see following message: "<message>" using PO
    @working
=======
    Given I am on shop page
    And I click sign in button
    When I enter email: <email> for authentification
    And I enter password: <password> for authentification
    And I click sign in using PO
    Then I see following message: "<message>" of authentification

>>>>>>> 59fcb985af6a20a28b9099dd5878e1466e0e6e1b
    Examples:
      | email           | password      | message                     |
      | ""              | ""            | An email address required.  |
      | gatis           | ""            | Invalid email address.      |
      | gatis@email.com | ""            | Password is required.       |
      | gatis@email.com | 12345         | Authentication failed.      |
