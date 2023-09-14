Feature: Add New Program

Background: Logged on the LMS portal
#Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

Scenario: Validate Program Details Popup window

Given : Admin is on Manage Program Page
When : Admin clicks <A New Program>button
Then : Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window

Scenario: Validate input fields and their text boxes in Program details form 

Given : Admin is on Manage Program Page
When : Admin clicks <A New Program>button
Then : Admin should see two input fields and their respective text boxes in the program details window

Scenario: Validate radio button for Program Status 

Given : Admin is on Manage Program Page
When : Admin clicks <A New Program>button
Then : Admin should see two radio button for Program Status

#Background: Admin is on Manage Program Page after clicks Program on the navigation bar

Scenario Outline: Empty form submission

Given : Admin creates new Program from "<SheetName>" and <Rownumber>
When : Admin clicks <Save>button without entering any data
Then : Admin gets a Error message alert 

 Examples:
   |SheetName| Rownumber|
   |Program   |     0|
   |Program   |    1|
   
Scenario Outline: Enter only Program Name

Given : Admin creates new Program from "<SheetName>" and <Rownumber>
When : Admin enters only<Program Name> in text box and clicks Save button
Then : Admin gets a message alert 'Description is required'

Examples:
   |SheetName| Rownumber|
   |Program    |     0|
   |Program    |     2|
   
Scenario Outline: Enter only Program Description

Given : Admin creates new Program from "<SheetName>" and <Rownumber>
When : Admin enters only<Program description> in text box and clicks Save button
Then : Admin gets a message alert 'Name is required'

Examples:
   |SheetName| Rownumber|
   |Program    |     0|
   |Program    |     3|
   
Scenario Outline: Select Status only

Given : Admin creates new Program from "<SheetName>" and <Rownumber>
When : Admin selects only Status and clicks Save button
Then : Admin gets a message alert 'Name and Description required'

Examples:
   |SheetName| Rownumber|
   |Program    |     0|
   |Program    |     4|
Scenario Outline: Validate invalid values on the text column

Given : Admin creates new Program from "<SheetName>" and <Rownumber>
When : Admin enters only numbers or special char in name and desc column
Then : Admin gets a Error message alert 

Examples:
   |SheetName| Rownumber|
   |Program    |     0|
   |Program    |     5|
Scenario: Validate Cancel/Close(X) icon on Program Details form

Given : Admin is on "Program Details" Popup window
When : Admin clicks Cancel/Close(X) Icon on Program Details form
Then : Program Details popup window should be closed without saving

Scenario: Validate Save button on Program Details form

Given : Admin is on "Program Details" Popup window
When : Enter all the required fields with valid values and click Save button
Then : Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table

Scenario: Validate Cancel button on Program Details form

Given : Admin is on "Program Details" Popup window
When : Admin clicks <Cancel>button 
Then : Admin can see the Program details popup disappears without creating any program

