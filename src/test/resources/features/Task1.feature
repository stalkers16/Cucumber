Feature: Validating a title of E-shop page
  As a test engineer
  I want to be able to validate a title and phones on e-shop homepage

  Scenario: Verify both phone numbers on title page
    When I am on shop page using po
    Then I should see shop page title My Store

  Scenario: Verify both phone numbers on title page PO
    When I am on shop page using po
    Then I should see shop page phone top PO 0123-456-789
    Then I should see shop page phone bottom PO (347) 466-7432
