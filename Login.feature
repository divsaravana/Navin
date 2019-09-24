@tag
Feature: To check login functionality

  @tag1
  Scenario: To check login page
    Given User launch facebook application
    And User check url and title
    When User enter username and password
    And User clicks login button
    Then User close the browser
