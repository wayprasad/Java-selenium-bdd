@smokeTest
Feature: Test logoin functionality
  
  Scenario: Check login is successful with valid credentials
    Given browser is open
    And and user is on login page
    When user enters username and password
    And user clicks login button
    Then the user is navigated to the home page