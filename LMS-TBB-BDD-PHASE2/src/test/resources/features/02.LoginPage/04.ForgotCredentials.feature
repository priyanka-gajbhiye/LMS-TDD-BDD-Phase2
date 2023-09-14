@ForgotCredentials
Feature: Forgot username/password

  Background: Admin in login page after clicking login button in home page
    Given Admin is on login Page
    When Admin clicks forgot username or password link

  Scenario: Verify forgot username or password link
    Then Admin should land on forgot username or password page

  Scenario: verify broken link
    Then HTTP response >= 400 the link is broken

  Scenario: verify input descriptive text for Email
    Then Admin should see Email text in gray color

  Scenario: Verify email text in text field
    Then Admin should see Email in text field

  Scenario: Verify send link button is present
    Then Admin should see send Link  button

  Scenario: Verify asterik near Email text
    Then Admin should see asterik "*" symbol need Email

  Scenario: Verify text spelling
    Then Admin should see correct spellings in all fields

  Scenario: Verify the alignment of the send link button
    Then Admin should see send link button in center of the page
