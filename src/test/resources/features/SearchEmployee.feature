Feature: Employee Search

Scenario: Search employee by ID
Given user is navigated to HRMS
And user is logged in with valid admin credentials
And user is navigated to employee list page
When user enters valid employee id
And click on search button
Then user see employee information is displayed

Scenario: Search employee by name
Given user is navigated to HRMS
And user is logged in with valid admin credentials
And user is navigated to employee list page
When user enters valid employee name and last name
And click on search button
Then user see employee information is displayed
