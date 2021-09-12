#Author:davutseker29@gmail.com
Feature: Dashboard

@inProgress
  Scenario: Dashboard menu view for admin
    Given user is logged in with valid admin credentials
    Then user sees dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
