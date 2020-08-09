Feature: Pendora Sign up

  Background: 
    Given the user is on the pendora sign up page

  Scenario: Sign up for Pendora URl and Title validation
    When user can validate the URL
    And user can validate the page title
    Then user can exit browser

 
