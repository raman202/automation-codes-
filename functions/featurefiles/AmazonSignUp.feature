#Author: your.email@your.domain.com
Feature: Amazon Sign Up

  Scenario: Validate URL test
    Given user is on the Amazon sign up page
    When user can validate the amazon sign up page URL
    Then user can close the browser

  Scenario: Validate page title test
    Given user is on the Amazon sign up page
    When user can see and validate the amazon sign up page title
    Then user can close the browser

  Scenario Outline: Amazon creat account data driven test
    Given user is on the Amazon sign up page
    When user can enter thier name "<Name>"
    When user can enter thier email "<Email>"
    When user can enter a password"<Password>"
    When user can confirm password "<Confirm password>"
    Then user can close the browser

    Examples: 
      | Name         | Email                  | Password     | Confirm password |
      | Raman Paul   | Rkpaul1987@gmail.com   | TheOne&Only  | TheOne&Only      |
      | Monika Mehar | Gurmehar2020@gmail.com | MharPaul2019 | MharPaul2019     |
