Feature: Sign Up and Log in

Scenario: Verification of successful registration when the inputs are correct.
Given name,passward,email and address
When the customer give name,passward,email and address
Then the user registration should be successful

Scenario: Verification of successful registration when the inputs are incorrect.
Given name,incorrect passward,email and address
When the customer give name,incorrect passward,email and address
Then the user registration should be not successful


Scenario: Successfully login as Admin
Given valid admin user name and password
When admin write username and password correct 
Then enter as admin


Scenario: Successfully login as Customer
Given valid Customer user name and password
When Customer write username and password correct
Then enter as customer


Scenario: Successfully login as Installer
Given valid Installer user name and password
When Installer write username and password correct
Then enter as installrer

Scenario: incorrect username or password
Given incorrect  user name or password
When  user write username and password incorrect 
Then  display incorrect username or password. Please try again or Sign up with new account





