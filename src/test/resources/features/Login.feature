#Author: davutseker29@gmail.com
@sprint5 @login
Feature: Login

  #enhancing test with Scenario Outline to login as admin and ess user
 
  Scenario Outline: valid admin and ess login
    When user enters valid "<Username>" and "<Password>"
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username | Password    | FirstName     |
      | Admin    | Hum@nhrm123 | Welcome Admin |
      | dseker   | Ankara06,,  | Welcome David |

  #enhancing test with Scenario Outline to login as admin and ess user
  
  Scenario Outline: Error message valiation while invalid login
    When user enters invalid "<Username>" or "<Password>"
    Then user sees "<Error message>"
      | UserName | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid Credentials      |
      | Hello    | Syntax123! | Invalid Credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax123! | Password cannot be empty |
