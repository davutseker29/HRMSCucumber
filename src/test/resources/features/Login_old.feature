@login
Feature: Login

  @smoke
  Scenario: valid admin login
    When user enter valid admin username and password
    Then admin user is successfully logged in

  @smoke
  Scenario: valid ess login
    When user enter valid ess username and password
    Then ess user is successfully logged in

  #enhancing test with Scenario Outline to login as admin and ess user
  @smoke
  Scenario Outline: 
    When user enters valid "<Username>" and "<Password>"
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username | Password    | FirstName     |
      | Admin    | Hum@nhrm123 | Welcome Admin |
      | dseker   | Ankara06,,  | Welcome David |

  @smoke
  Scenario: Login with valid username and invalid password
    When User enter valid username and invalid password
    Then User see Invalid Credentials text on login page

  #enhancing test with Scenario Outline to login as admin and ess user
  @temp
  Scenario: Login with invalid credentials
    When user enters invalid username and password and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |
