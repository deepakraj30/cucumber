Feature: test login

  Scenario: check login is successful with valid credentials
   
    Given browser is open
    And user is on login page
    When user enters mail id and password
    And user clicks login button
    Then user is navigated to the homepage
