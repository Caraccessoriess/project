
Feature: notification email for customer

  Scenario: send email confirm order
    Given customer in menu page
    When choose confirm order
    And fill the form of order
    Then send confirm email