@addEmployees
Feature: Add Employee

  Background: 
    Given user is logged in with valid admin credentials
    And user navigates to AddEmployeePage
@regression
  Scenario: Add Employee with first and lastname
    When user enters employees "bumssba" and "bumssba"
    And user clicks save button
    Then "bumssba bumssba" is added successfully
@regression
  Scenario: Add Employee without employee id
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully
@regression
  Scenario: AddEmployee and create Login Credentials
    When user enters employees first name and last name
    And user clicks on create login checkbox
    And user enters login credentials
    And user clicks save button
    Then employee is added successfully

  #to perform DDT in cucumber we use Scenario Outline with Examples
  @regression
  Scenario Outline: Adding multiple employees
    When user enters employees "<FirstName>","<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>","<MiddleName>" and "<LastName>" is added succesfully

    Examples: 
      | FirstName | MiddleName | LastName |
      | James     | M          | Rodrigez |
      | Jesse     | P          | Rodrigez |
      | Jack      | S          | White    |

  #adding multiple employees using Cucumber DataTable
  @regression
  Scenario: 
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | j          | Smith    |
      | Jane      | j          | Smith    |
     
     @regression 
      Scenario: Adding Multiple Employees from Excel
      When user enters employee data from "Employee" excel sheet than employee is added
     
