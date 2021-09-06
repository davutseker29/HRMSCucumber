Feature: Login

Scenario: valid admin login
Given user is navigated to HRMS
When user enter valid admin username and password
And user click on login button
Then admin user is successfully logged in

Scenario: valid ess login
Given user is navigated to HRMS
When user enter valid admin username and password
And user click on login button
Then admin user is successfully logged in

Scenario: login with valid username and invalid password
Given user is navigated to HRMS
When user enter valid admin username and invalid password
And user click on login button
Then user see invalid credentails text on login page
