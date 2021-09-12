Feature: Employee Search

  Background: 
    Given user is logged in with valid admin credentials
    And user is navigated to employee list page

  @smoke
  Scenario: Search employee by ID
    When user enters valid employee id
    And click on search button
    Then user see employee information is displayed

  @smoke
  Scenario: Search employee by name
    When user enters valid employee name and last name
    And click on search button
    Then user see employee information is displayed
