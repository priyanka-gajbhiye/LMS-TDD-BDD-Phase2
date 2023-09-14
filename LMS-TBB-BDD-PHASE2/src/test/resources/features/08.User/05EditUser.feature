Feature: Edit new user

#Background: Logged on the LMS portal


Scenario: Validate row level edit icon
Given The edit icon on row level in data table is enabled
When Admin clicks the edit icon
Then A  pop up window with User details appears


Scenario Outline: Check if the fields are updated
Given Admin is on pop up window
When Update the fields with valid values from "<Sheet Name>",<RowNumber> and click submit
Then The updated user details should appear on the data table
Examples:
|SheetName| RowNumber|
|sheet2   |    1        |


Scenario Outline: Check if the update throws error with invalid values
Given Admin is on pop up window
When Update the fields with invalid values from "<Sheet Name>", <RowNumber> and click submit
Then The error message should appear
Examples:
|SheetName| RowNumber|
|sheet2   |    2        |


Scenario Outline: Check if the update throws error with empty mandatory values
Given Admin is on pop up window
When Update the fields with empty values from "<Sheet Name>",<RowNumber> and click submit
Then The error message should appear
Examples:
|SheetName| RowNumber|
|sheet2   |    3       |


Scenario Outline: Check if the update throws error with  mandatory and optional values
Given Admin is on pop up window
When erase  email data from "<Sheet Name>",<RowNumber> and click submit
Then The updated user details should appear on the data table
Examples:
|SheetName| RowNumber|
|sheet2  |    4        |

Scenario: Validate cancel button
Given Admin is on pop up window
When  Admin clicks cancel button 
Then  Admin should redirected to manage user page







