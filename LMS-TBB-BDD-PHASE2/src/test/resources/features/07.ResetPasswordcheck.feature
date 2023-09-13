@ResetPasswordcheck
Feature: Reset Password

  Background: Admin clicks reset password link after  reaching in login page
    Given Admin reset password page

  Scenario: verify text box is in enabled in new password field
    When Admin clicks on type in new password field
    Then Admin should see text box is enabled state

  Scenario: verify text box is in enabled in retype password field
    When Admin clicks on retype password field
    Then Admin should see retype text box is enabled state

  Scenario Outline: Validate reset password with valid details
    When Admin enters same password from excel sheet "<Sheetname>" and <RowNumber>
    Then Admin should recieve  Your password has been reset Please click here to login

    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         9 |

  Scenario Outline: Validate reset password with invalid details
    When Admin enters same password on both field with invalid details from excel sheet "<Sheetname>" and <RowNumber>
    Then Error message Please try again

    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        10 |

  Scenario: Validate reset password with empty details
    When Admin enters  empty details on both fieldand clicks submit button
    Then Error msg Please try again details

  Scenario Outline: Validate reset password mismatch values
    When Admin enters  mismatch values from excel sheet "<Sheetname>" and <RowNumber>
    Then Error message Please try again

    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        11 |
