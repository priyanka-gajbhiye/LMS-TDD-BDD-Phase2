#Background: Logged on the LMS portal as Admin

Feature: Manage class page Verification

  Scenario: Verify landing in class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" on the navigation bar
    Then Admin should see URL with "Manage Class"
    
    Scenario: Capture the response time to navigate to manage class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage class page
    
    Scenario: Verify manage class page Header
    Given Admin is on dashboard page after Login
   
    Then Admin should see header with "Manage Class"
    
    Scenario Outline: Validate text in manage class page
    Given Admin is on dashboard page after Login
    When Admin clicks class button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields as "<fields>"
    Examples:
    |fields|
    |LMS - Learning Management System| 
    |Batch Id|
    |Class No|
    |Class Date|
    |Class Topic|
    |Staff Id|
    |Description|
    |Comments|
    |Notes|
    |Recording|
    |Edit/Delete|
    
    Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login
   
    Then Admin should see disabled delete icon below the Manage Class
    
    Scenario: Verify search bar on the manage class page
    Given Admin is on dashboard page after Login
    
    Then Admin should see search bar on the manage class page
    
    Scenario: Verify add new class button  on manage class page
    Given Admin is on dashboard page after Login
   
    Then  Admin should see +Add New Class button on the manage assignment page
    
    Scenario: Verify data table on the manage class page
    Given Admin is on dashboard page after Login
    
    Then  Admin should see data table on the manage class page With following column headers
    
    Scenario: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
   
    Then  Edit Icon in each row of data table only  when entries are available
    
    Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
   
    Then  Edit Icon will not be present in data table
    
    Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
  
    Then  Delete Icon in each row of data table only  when entries are available
    
    Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
   
    Then Delete Icon will not be present in data table
    
    Scenario: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
   
    Then Admin should see sort icon near the column headers except for Edit and Delete
    
    Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login
    
    Then  Admin should see check box in the all rows  of data table when entries available
    
    Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login
  
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table
   
    Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login

    Then  Admin should see the pagination controls under the data table
    
    Scenario: Validate footer  text
    Given Admin is on dashboard page after Login
   
    Then Admin should see the text with total number classes in the data table 
    
    
    #searchbox
    Scenario Outline: Validate search box function
    Given Admin is on dashboard page after Login
    When Admin enters batch id into search box from excel sheet "<Sheetname>" and <RowNumber>
    Then Displays entries with that batch id
     Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
    
    Scenario: Validate search box function
    Given Admin is on dashboard page after Login
    When  Admin enters batch id is not existing the table into search box    
    Then Displays empty details in the data table
    
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When Admin enters class number into search box     
    #Then Displays entries with that class number
    #
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When Admin enters class date which is not existing the table into search box     
    #Then Displays empty details in the data table
    #
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When    Admin enters class topic into search box  
    #Then Displays entries with that class topic
    #
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When   Admin enters staff id which is not existing the table into search box   
    #Then Displays empty details in the data table
    #
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When   Admin enters description  into search box   
    #Then Displays entries with that description
    #
    #Scenario: Validate search box function
    #Given Admin is on dashboard page after Login
    #When Admin enters notes which is not existing the table into search box     
    #Then Displays empty details in the data table