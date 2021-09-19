#Author: dsekeroffice@gmail.com
@report

Feature: Employee Personal Detail

Scenario: Search Employee by ID
Given user is logged in with valid admin credentials
And user is navigated to employee list page
When user enters valid employee id "17708"
And click on search button
Then user see employee information is displayed

Scenario: Update Employee Personal Details

Given user is logged in with valid admin credentials
And user is navigated to employee list page
When user enters valid employee id "17708"
And click on search button
Then user see employee information is displayed
When user clicks on employee id
And user navigated to personal details page
And user clicks on edit button
And user udpates employee name to "pamir"
And user updates employee last name to "sedatAli"
And user updates employee nationality to "Turkey"
And user updates employee marital status to "Single"
And user updates employee gender to "male"
And user updates employee birthday
Then user clicks on save button

