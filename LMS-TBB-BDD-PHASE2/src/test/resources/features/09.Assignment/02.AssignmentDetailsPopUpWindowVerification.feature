#Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

Feature: Assignment details Popup window verification

  Scenario: Verify Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then  Admin should see a popup  with  heading "Assignment details"
    
    Scenario Outline: Verify input fields in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then  Admin should see input "<fields>" Text
    Examples:
    |fields|
    |Program Name| 
    |batch number|
    |Assignment Name|
    |Assignment Description|
    |Grade By|
    |Assignment Due Date|
    |Assignment File1|
    |Assignment File2|
    |Assignment File3|
    |Assignment File4|
    |Assignment File5|
    
    Scenario: Verify text box present in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then  8 textbox should be  present in Assignment details popup window
    
    Scenario: Verify drop down in Batch Number  in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  dropdown option for Batch Number
    
    Scenario: Verify drop down in Program name  in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  dropdown option for Program name
    
    Scenario: Verify calendar icon in Assignment due date  in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  calendar icon for assignment due date
    
    Scenario: Verify save button is present
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  save button in the Assignment detail popup window
    
    Scenario: Verify cancel button is present
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  cancel button in the Assignment detail popup window 
    
    Scenario: Verify close button in  Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then  Admin should see  close button on the Assignment details popup window
    