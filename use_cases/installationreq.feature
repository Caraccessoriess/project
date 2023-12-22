
Feature: Installation Request

  Scenario: confirm order with installation
    Given customer in order page
    When choose to confirm order
    And needs the product installation
   Then show the confirm order form  
   And show the installation request form 
 

   Scenario: confirm order without installation
    Given customer in order page
    When choose to confirm order
    And no product needs installation
   Then show the confirm order form 
   
    
   Scenario: confirm the request form
    Given customer is fill the form
    When choose to done request
   Then confirm order
   
   
   




