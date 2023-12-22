
Feature: customer profile

  Scenario: customer choose profile page
    Given user is log in as customer
    When user in customer page
    And choose profile option
    Then view profile for customer
    
    Scenario: customer edit user name 
    Given customer in profile page
    When customer choose to edit name
    And customer enter the new name
    Then change the user name
    
     Scenario: customer edit user passward
    Given customer in profile pagee
    When customer choose to edit passward
    And enter the current passward correctly
    And customer enter the new passward
    Then change the user passward
    
     Scenario: customer edit user address
    Given customer in profile pagee
    When customer choose to edit address
    And customer enter the new addresss
    Then change the user address
   
     Scenario: customer edit user email
    Given customer in profile pagee
    When customer choose to edit email
    Then display the message cant edit the email 
    
    Scenario: customer want view history
    Given user is log in as customer
     When user in customer page
    And choose History option
    Then view history for customer
    

