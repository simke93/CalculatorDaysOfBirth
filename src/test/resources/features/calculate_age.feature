Feature: Calculate Age
  As a user
  I want to calculate age of person in days
  So that I can find out how many days have passed since their birthdate

  Scenario: Calculate age from a valid birthdate
    Given the user provides a valid birthdate "YYYY-MM-DD"
    When the user calculate the age
    Then the age in days should be displayed

  Scenario: Calculate age from an invalid birthdate
    Given the user provides an invalid brithdate "invalid_date"
    When the user calculates the age
    Then an error message should be displayed

