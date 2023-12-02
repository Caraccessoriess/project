
Feature: Users Roles 
 
  Scenario: Admin Role
    Given admin write valid user name and password
    When succesfully log in as admin 
    Then open admin page
    
      Scenario: Customer Role
    Given Customer write valid user name and password
    When succesfully log in as Customer 
    Then open Customer page
    
      Scenario: Installer Role
    Given Installer write valid user name and password
    When succesfully log in as Installer 
    Then open Installer page
   

