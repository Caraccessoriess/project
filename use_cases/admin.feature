Feature: Admin dashboard
 
  Scenario: choose product option
    Given log in as admin
    When choose product option
    Then display catagorys
    
    Scenario: add product catagory
    Given admin in product catagory page
    When choose add option
    And write safety tools
    Then add safety tools to catagory
    
    Scenario: edit product catagory
    Given admin in product catagory page
    When choose edit option
    And choose safety tools
    And write safety
    Then edit safety tools to safety
    
     Scenario: delete product catagory
    Given admin in product catagory page
    When choose delete option
    And choose safety tools
    Then delete safety tools
    
     Scenario: add interior product 
    Given admin in product catagory page
    When choose interior product
    And choose add interior option
    And add Steering Wheel Cover
    Then add Steering Wheel Cover to interior product
    
    Scenario: edit interior product 
    Given admin in product catagory page
    When choose interior product
    And choose edit interior option
    And choose product to edit
    And Select one of the information to edit 
    Then edit the information of this product
    
        Scenario: add exterior product 
    Given admin in product catagory page
    When choose exterior product
    And choose add exterior option
    And add cover
    Then add cover to exterior product
    
    Scenario: edit exterior product 
    Given admin in product catagory page
    When choose exterior product
    And choose edit exterior option
    And choose product to edit
    And Select one of the information to edit exterior product
    Then edit the information of this exterior product
    
        Scenario: add electronic product 
    Given admin in product catagory page
    When choose electronic product
    And choose add electronic option
    And add camera
    Then add camera to electronic product
    
    Scenario: edit electronic product 
    Given admin in product catagory page
    When choose electronic product
    And choose edit electronic option
    And choose product to edit
    And Select one of the information to edit electronic product 
    Then edit the information of this electronic product
    
    Scenario: view customer account
    Given log in as admin
    When choose user account option
    Then view customers account
    
    Scenario: view inastallation appointment
    Given log in as admin
    When choose inastallation appointment option
    Then view inastallation appointment
    
    
    
    
    
    



