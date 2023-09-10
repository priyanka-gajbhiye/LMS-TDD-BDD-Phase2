@HomePage
Feature: Home Page Verification

  Background: 
    Given Admin Launch the Browser
    When Admin gives correct LMS portal URL

  @Check_Home_Page01
  Scenario: Verify Admin is able to land on Home Page
    Then Admin should land on the Home Page

  Scenario: Verify for broken Link
    Then HTTP response ">=400" then the link is broken

  Scenario: Verify text spelling in the page
    Then Admin should see correct spelling all the fields

  Scenario: Verify logo of the LMS
    Then Admin should see correct logo of the LMS

  Scenario: Verify logo properly aligned
    Then Admin should see logo is properly aligned

  Scenario: Verify login button is present
    Then Admin should see login button

  Scenario: Verify login button is clickable
    Then Admin should able to click login button
