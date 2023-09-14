@ValidateEmail
Feature: Forgot username/password

  Background: Admin Clicks forgot username and password after reaching login page
    Given Admin is in forgot username and password page

  Scenario Outline: Validate email sent for forgot password
    When Admin enters valid email id from excel sheet "<Sheetname>" and <RowNumber> and clicks send link button
    Then Admin should receive link in mail for reset username and password

    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         7 |

  Scenario Outline: Validate email sent for forgot password with invalid email if
    When Admin enters invalid email id from excel sheet "<Sheetname>" and <RowNumber> and clicks send link button
    Then Admin should not receive link in mail for reset username and password

    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         8 |
