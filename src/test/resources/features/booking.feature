Feature: Test if user able to book hotel

  developer - Chirag
  tester - Saniia

  Background:
    Given user open website
    And verify user chose the hotel
    And verify user is on booking page
@Smoke @Regression
    Scenario: Verify user can book hotel
      When user enter valid credentials
      Then verify booking page is displayed
      Then verify user credentials are valid
      Then verify user can proceed to checkout page
@Smoke @Regression @Saniia
      Scenario: Verify user cannot book hotel with invalid credentials
        When user enter invalid credentials
        Then verify invalid login error message is displayed
