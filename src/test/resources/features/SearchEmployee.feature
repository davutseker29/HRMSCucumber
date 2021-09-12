#Author: syntaxteam
@sprint6 @employeeSearch
Feature: Employee Search

  Background: 
    Given user is logged in with valid admin credentials
    And user is navigated to employee list page

  @smoke
  Scenario: Search employee by ID
    When user enters valid employee id "17708"
    And click on search button
    Then user see employee information is displayed

  @smoke
  Scenario: Search employee by name
    When user enters valid employee "rumon hu" and "Afzal"
    And click on search button
    Then user see employee information is displayed
