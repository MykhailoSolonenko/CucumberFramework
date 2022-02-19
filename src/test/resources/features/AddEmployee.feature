Feature: This feature is to test the the login functionality

  Developer - Fenton
  Tester - Mykhailo
  Reviewed By - Daniel

  Background:
    Given user opens website
    And user is on login page
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    When user hover mouse on PIM menu
    And click on Add Employee link
    Then verify user is navigated to add employee page

@Smoke @Mykhailo
  Scenario: Verify user can able to login with valid credentials
    When user enters valid details on add employee page
    And click on save button
    Then verify user is navigated to personal details page

  @Regression @Elmaz
  Scenario: Verify error message for missing first name and last name values
    When click on save button
    Then verify error message for missing first name and last name


  Scenario: Verify when user enters invalid credentials, user should not allowed to login

    When user enters username "invalidadmin" and password "12345678"
    And select on logout option
    Then verify invalid login error message is displayed