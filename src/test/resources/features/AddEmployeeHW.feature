Feature: Add Employee Homework

  @inProgress
  Scenario Outline: 
    Given user is logged in with valid admin credentials
    And user navigates to AddEmployeePage
    When user enters employees "<firstname>", "<middlename>" and "<lastname>"
    And user clicks on create login checkbox
    And user enters "<username>" and "<password>"
    And user clicks save button
    

    Examples: 
      | firstname | middlename | lastname |username|password|
      | pamir     | sedatali   | seker    |PamirSedat2021,,,|Ankara06,,|
      | kaan      | vedat      | seker    |KaanVedat,,,|Ankara06,,|
      | altay     | serhat     | seker    |AltaySerhat2023,,,|Ankara06,,|
      | davut     | king       | seker    |DavutSeker1986,,,|Ankara06,,|
