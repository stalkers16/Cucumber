Feature: Validating a title of E-shop page
  As a test engineer
  I want to be able to validate a title and phones on e-shop homepage

  Scenario: Verify both phone numbers on title page
    When I am on shop page
    Then I should see shop page title My Store

  Scenario: Verify both phone numbers on title page PO
<<<<<<< HEAD
    When I am on shop page using po
    Then I should see shop page phone top PO 0123-456-789
    Then I should see shop page phone bottom PO (347) 466-7432
=======
    When I am on shop page
    Then I should see shop page phone top 0123-456-789
    Then I should see shop page phone bottom (347) 466-7432
>>>>>>> 59fcb985af6a20a28b9099dd5878e1466e0e6e1b
