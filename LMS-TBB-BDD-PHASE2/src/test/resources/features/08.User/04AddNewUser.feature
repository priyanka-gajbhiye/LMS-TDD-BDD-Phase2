Feature: Add new user

#Background: Logged on the LMS portal




Scenario: Check if the fields exist in pop
Given A new pop up with user details appears
When Admin checks all fields is displayed
Then The pop up should include the fields 


Scenario Outline: Check if user details are added without optional fields 
Given Admin is on pop up window
 When Admin enters valid data in mandatory fields except optional fields from "<SheetName>",<RowNumber> and click submit
  Then  The newly added user should be present in the data table in Manage User page
Examples:
|SheetName| RowNumber|
|sheet1   |    1        |

Scenario Outline: Check if the new user details are added in data table 
Given Admin is on pop up window
 When Admin enters valid data in mandatory fields and optional fields from "<SheetName>",<RowNumber> and click submit
Then  The newly added user should be present in the data table in Manage User page
Examples:
|SheetName| RowNumber|
|sheet1    |   2     |



Scenario Outline: Check for error messages for invalid fields 
Given Admin is on pop up window
 When Admin enters invalid data in mandatory fields and valid optional fields from "<SheetName>",<RowNumber> and click submit
Then  Error message should dispaly
Examples:
|SheetName| RowNumber|
|sheet1|    3        |

Scenario Outline: Check for error messages for mandatory fields 
Given Admin is on pop up window
 When Admin enters valid data in optional fields with empty mandatory fields from "<SheetName>",<RowNumber> and click submit
Then  Error message should dispaly

Examples:
|SheetName| RowNumber|
|sheet1|    4       |






