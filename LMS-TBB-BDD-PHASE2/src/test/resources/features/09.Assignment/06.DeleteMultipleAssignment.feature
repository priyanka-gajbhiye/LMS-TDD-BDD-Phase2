#Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

		Feature: Delete multiple class validation

  	Scenario: Verify delete multiple class  button is enabled
    Given Admin is in manage assignment page
    When Admin clicks single  row level check box in the data table
    Then Admin should see delete icon below the header is enabled
    
    #single delete checkbox
    Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table
    
    Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to assignment page and selected assignment details are not deleted from the data table
    
    #multiple delete checkbox
    Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table
    
    Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to assignment page and selected assignment details are not deleted from the data table