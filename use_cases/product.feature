
Feature: product

  Scenario: choosing rearview mirror from interior products
    Given user in product page
    When user choose interior product
    And user select rearview mirror
    Then go to rearview mirror page details
    
    Scenario: choosing led light strips from exterior products
    Given user in product page
    When user choose exterior product
    And user select led light strips
    Then go to led light strips page details
    
    Scenario: choosing phone holder from electronic products
    Given user in product page
    When user choose electronic product
    And user select phone holder
    Then go to phone holder page details
    
    Scenario: Search for products
    Given user in product page
    When user choose search option
    And write name product to search it
    Then View details of the product you have chosen to search for
    
    
    
    
