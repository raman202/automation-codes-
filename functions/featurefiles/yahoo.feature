#Author: rkpaul87@gmail.com
Feature: Yahoo Sign Up

 Background: 
  Given that the user is on the Yahoo sign up page
   
 Scenario: How to Sign up for Yahoo account
  
    When user can enter the firstName "Raman"
    And user can enter the lastName "Paul"
    
		Then user can close browser 
      
      
      
      
       Scenario Outline: Title of your scenario outline
    When user can enter email "<email>"
    And user can enter password "<password>"
    And user can enter birthyear "<birthyear>"
    And user can enter zipcode "<zipcode>"
    Then user can exit browser

    Examples: 
      | email                   | password | birthyear | zipcode |
      | Ramanpaul1987@gmail.com | TheOne@$ |      1987 |   20109 |
      | JOhnSmith@gmail.com     | MRsmith@ |      1955 |   20111 |
      
      
      
      