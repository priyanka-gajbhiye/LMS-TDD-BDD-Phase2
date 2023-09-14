 Feature: Add new Batch

Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "Batch" from navigation bar
Admin clicks "+ A New Batch" button

Scenario Outline: Check if the fields exist in pop

 Given :A new pop up with Batch details appears
 Then :Admin should see all the fields

Examples:
|Name|
|Number of classes|
|Description|
|Program Name |
|Status |


Scenario Outline: Check if description is optional field

 Given :Admin creates new Batch from "<SheetName>" and <Rownumber>
 When :Fill in all the fields except description with valid values and click save
 Then :The newly added batch should be present in the data table in Manage Batch page
   
   Examples:
   |SheetName| Rownumber|
   |Batch    |     0|
   |Batch    |     1|
   
Scenario Outline: Check if the program details are added in data table

Given :Admin creates new Batch from "<SheetName>" and <Rownumber>
When :Fill in all the fields with valid values and click save
Then :The newly added batch should be present in the data table in Manage Batch page

Examples:
   |SheetName| Rownumber|
   |Batch    |     0|
   |Batch    |     2|
   
Scenario Outline: Check for error messages for invalid fields

Given :Admin creates new Batch from "<SheetName>" and <Rownumber>
When :any of the fields have invalid values and click save
Then :Error message should appear

Examples:
   |SheetName| Rownumber|
   |Batch    |     0|
   |Batch    |     3|
   
Scenario Outline: Check for error messages for mandatory fields

Given :Admin creates new Batch from "<SheetName>" and <Rownumber>
When :Any of the mandatory fields are blank and click save
Then :Error message should appear

Examples:
   |SheetName| Rownumber|
   |Batch    |     0|
   |Batch    |     4|
   