Examples:

|firstName| lastName | 			email			 		 	 | password   | birthDate | birthYear | gender |
|Raman		| Paul		 | Ramanpaul87@gmail.com | TheOne123@ |6		 		  | 1987		  |  male  |
|Mehar		| Paul		 | MeahrPaul@gmail.com   |Mehar222&   |1					| 1990      | femail |

   Scenario: How to Sign up for Yahoo account
  
    When user can enter the firstName "Raman"
    And user can enter the lastName "Paul"
    And user can enter the email "RamanPaul87@gmail.com"
    And user can enter the password "TheOne@1"
    And user can enter the phoneNumber "5713839976"
    And user can enter the birthMonth "July"
    And user can emter the birthDate "6"
    And user can emter the birthYear "1987"
    And user can emter the gender "male"
		Then user can close browser 
		
		
		And user can enter the email "RamanPaul87@gmail.com"
    And user can enter the password "TheOne@1"
    And user can enter the phoneNumber "5713839976"
    And user can emter the birthDate "6"
    And user can emter the birthYear "1987"
    And user can emter the gender "male"