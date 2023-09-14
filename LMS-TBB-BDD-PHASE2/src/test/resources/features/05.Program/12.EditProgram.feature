Feature: Edit Program Details

Background: Logged on the LMS portal
#Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
Scenario: Validate Edit Feature

Given : Admin is on Manage Program Page 
When : Admin clicks <Edit> button on the data table for any row
Then : Admin should see a popup open for Program details to edit

#Background: Admin is on Manage Program Page after clicks Program on the navigation bar

Scenario Outline: Edit Program Name

Given : Admin edits new Program from "<SheetName>" and <Rownumber>
When : Admin edits the Name column and clicks save button
Then : Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

Examples:

|SheetName| Rownumber|
   |ProgramEdit    |     0|
   |ProgramEdit    |     1|
   
Scenario Outline: Edit Program description

Given : Admin edits new Program from "<SheetName>" and <Rownumber>
When : Admin edits the Description column and clicks save button
Then : Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program

Examples:

|SheetName| Rownumber|
   |ProgramEdit    |     0|
   |ProgramEdit    |     2|
   
Scenario Outline: Change Program Status

Given : Admin edits new Program from "<SheetName>" and <Rownumber>
When : Admin changes the Status and clicks save button
Then : Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program

Examples:

|SheetName| Rownumber|
   |ProgramEdit    |     0|
   |ProgramEdit    |     3|
   
Scenario Outline: Validate invalid values on the text column

Given : Admin edits new Program from "<SheetName>" and <Rownumber>
When : Admin enters only numbers or special char in name and desc column
Then : Admin gets a Error message alert 

Examples:

|SheetName| Rownumber|
   |ProgramEdit    |     0|
   |ProgramEdit    |     4|
Scenario: Validate Cancel button on Edit popup

Given : Admin is on Program Details Popup window to Edit
When : Admin clicks <Cancel>button on edit popup
Then : Admin can see the Program details popup disappears and can see nothing changed for particular program

Scenario: Validate Save button on Edit popup

Given : Admin is on Program Details Popup window to Edit
When : Admin clicks <Save>button on edit popup
Then : Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program