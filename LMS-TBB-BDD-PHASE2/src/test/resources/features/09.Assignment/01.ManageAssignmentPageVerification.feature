#Background: Logged on the LMS portal as Admin

Feature: Manage assignment page Verification

  Scenario: Verify landing in manage assignment page  
  Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then Admin should see URL with Manage assignment
    
    Scenario: Capture the response time to navigate to manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage assignment page
    
    Scenario: Verify manage assignment page Header
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then Admin should see header with "Manage assignment"
    
    Scenario Outline: Validate text in manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields as "<fields>"
    Examples:
    |fields|
    |LMS - Learning Management System| 
    |Assignment Name|
    |Assignment Description|
    |Assignment Due Date|
    |Assignment Grade|
    |Edit/Delete|
    
    Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then Admin should see disabled delete icon below the Manage assignment
    
    Scenario: Verify search bar on the manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then Admin should see search bar on the manage assignment page
    
    Scenario: Verify add new assignment button  on manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Admin should see +Add New assignment button on the manage assignment page
    
    Scenario: Verify data table on the manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Admin should see data table on the manage assignment page With following column headers
    
    Scenario: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Edit Icon in each row of data table only  when entries are available
    
    Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Edit Icon will not be present in data table
    
    Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Delete Icon in each row of data table only  when entries are available
    
    Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then Delete Icon will not be present in data table
    
    Scenario: Verify sort icon in the data table
		Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then Admin should see sort icon near the column headers except for Edit and Delete
    
    Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Admin should see check box in the all rows  of data table when entries available
    
    Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table
   
    Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then  Admin should see the pagination controls under the data table
    
    Scenario: Validate footer  text
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar 
    Then Admin should see the text with total number assignments in the data table 
    
    
    #searchbox
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When Admin enters assignment name into search box from excel sheet "<Sheetname>" and <RowNumber>
    Then Displays entries with that assignment name
     Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         2 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When  Admin enters assignment name is not existing the table into search box from excel sheet "<Sheetname>" and <RowNumber>   
    Then Displays empty details in the data table
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When Admin enters assignment description into search box from excel sheet "<Sheetname>" and <RowNumber>   
    Then Displays entries with that assignment description
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         2 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When Admin enters assignment description which is not existing the table into search box from excel sheet "<Sheetname>" and <RowNumber>
    Then Displays empty details in the data table
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When    Admin enters assignment due date into search box from excel sheet "<Sheetname>" and <RowNumber> 
    Then Displays entries with that assignment due date
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         2 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When   Admin enters assignment due date which is not existing the table into search box from excel sheet "<Sheetname>" and <RowNumber>  
    Then Displays empty details in the data table
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When   Admin enters grade value  into search box from excel sheet "<Sheetname>" and <RowNumber>  
    Then Displays entries with that assignment  grade
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         2 |
    
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When Admin enters grade value which is not existing the table into search box from excel sheet "<Sheetname>" and <RowNumber>    
    Then Displays empty details in the data table
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
      