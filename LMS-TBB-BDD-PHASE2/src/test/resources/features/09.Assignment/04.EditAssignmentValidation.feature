#Background: Admin logged into LMS portal and clicks assignment button on the navigation bar

Feature: Edit assignment Validation

	 @ManageAssignmentPage
   Scenario: Verify Edit assignment popup window
    Given Admin is in manage assignment page
    When Admin clicks Edit button in data table 
    Then Edit popup window appears with heading Assignment Details
    
    Scenario Outline: Verify values in popup window
    Given Admin is in manage assignment page
    When Admin clicks Edit button from one of the row in data table 
    Then Edit popup window appears with same row values in the all "<fields>"
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
    
    @EditAssignmentPopupWindow
    Scenario Outline: Validate admin able to update assignment with valid data in mandatory fields
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters all mandatory field values with valid data from "<SheetName>",<RowNumber> and clicks save button
    # ( Program name, batch number,Assignment Name, grade by, Assignment due date)
    Then Admin should see updated assignment details is added in the data table
    Examples: 
      | SheetName | RowNumber |
      | Sheet2    |         3 |
    
    Scenario Outline: Validate admin able to update assignment with invalid data in mandatory fields
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters all mandatory field values with invalid data from "<SheetName>",<RowNumber> and clicks save button 
    #(Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Error message should appear in alert "Error message"
    Examples: 
      | SheetName | RowNumber |
      | Sheet2    |         4 |
    
    Scenario Outline: Validate admin able to update assignment with valid data  in all fields
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters values in all fields with valid data from "<SheetName>",<RowNumber> and clicks save button 
    #(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see updated assignment details is added in the data table
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         5 |
      
    Scenario Outline: Validate admin able to update assignment with invalid data  in optional fields
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters with invalid data in optional fields from "<SheetName>",<RowNumber> and clicks save button 
    #(Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Error message should appear in alert "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         6 |
    
    Scenario Outline: Validate admin able to update assignment missing program name
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters  data missing value in program name from "<SheetName>",<RowNumber> and clicks save button 
    #(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Program Name is missing "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         7 |
    
    Scenario Outline: Validate admin able to update assignment missing batch number
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters data missing value in Batch number from "<SheetName>",<RowNumber> and clicks save button 
    #(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Batch number is missing "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         8 |
      
    Scenario Outline: Validate admin able to update assignment missing assignment name
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters data missing value in Assignment name from "<SheetName>",<RowNumber> and clicks save button 
    #(Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment name is missing "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         9 |
    
    Scenario Outline: Validate admin able to update assignment missing due date
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters data missing value in Assignment due date from "<SheetName>",<RowNumber> and clicks save button 
    # ( Program name, batch number,Assignment Name, grade by)
    Then Assignment due date is missing "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        10 |
    
    Scenario Outline: Validate admin able to update assignment missing grade by
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters data missing value in grade by  from "<SheetName>",<RowNumber> and clicks save button 
    #(Program name, batch number,Assignment Name, Assignment due date)
    Then Grade by is missing "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        11 |
    
    Scenario Outline: Validate  admin able to update assignment passing past date 
    Given Admin is in  Edit assignment detail popup window
    When  Admin enters passed date in the due date field from "<SheetName>",<RowNumber> and clicks save button
    # ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment cannot be updated for the passed date "Error message"
    Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        12 |
    
    Scenario: Validate cancel button function in assignment details popup window
    Given Admin is in  Edit assignment detail popup window
    When  Admin clicks Cancel button without entering values in the fields
    Then Admin should land on manage assignment page
    
    Scenario: Validate cancel button function in assignment details popup window with values in field
    Given Admin is in  Edit assignment detail popup window
    When  Admin clicks Cancel button entering values in the fields
    Then Admin should land on manage assignment Page and validate new assignment is not created in the data table
    