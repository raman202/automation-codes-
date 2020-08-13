#Author: rkpaul87@gmail.com
Feature: Yahoo Sign Up

  Scenario: validate URL
    Given user is on the Yahoo sign page
    When user is able to see correct URl
    Then user can close browser

  Scenario: validate page title
    Given user is on the Yahoo sign page
    When user can see the correct page title
    Then user can close browser

  Scenario Outline: creat new Yahoo account
    Given user is on the Yahoo sign page
    And user can enter the firstname "<Firstname>"
    And user can enter the lastname "<Lastname>"
    And user can enter the password "<Password>"
    And user can enter the phone "<PhoneNumber>"
    When user can select the birth month "<Month>"
    When user can enter the birth date "<Date>"
    When user can enter the birth year "<Year>"
    When user can enter the gender "<Gender>"
    And user can enter the email "<Email>"
    Then user can close browser

    Examples: 
      | Firstname | Lastname | Password       | PhoneNumber | Month | Date | Year | Gender | Email          |
      | Raman     | Paul     | TheOne&Only    |  5713839976 | July  |    6 | 1987 | male   | meharpaul1987  |
      | Monika    | Banger   | MonikaPaul2013 |  5713835390 | May   |    2 | 1990 | female | monikabanger10 |
      | Mehar     | Paul     | MharPaul2019   |  5713835550 | March |    1 | 2019 | female | meharpaul2019  |
