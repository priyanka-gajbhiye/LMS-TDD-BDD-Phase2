Feature: User page validation

Background: Logged on the LMS portal

Scenario: Validate landing in User page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should see "Manage User Page" Title

Scenario: Validate header in the User Page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should see the "Manage User" in the header

Scenario: Validate pagination in the User Page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should see the pagination controls under the data table

Scenario: Validate data table headers in the User Page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin Should see the data table with headers 


Scenario: Validate Delete button in User Page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "Delete" icon button that is disabled

Scenario: Validate "+ A New user" button in User Page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "+ A New User" button

Scenario: Validate "+ Assign staff"  button in User page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "+ Assign staff" button

Scenario: Validate search box in User page
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the search text box

Scenario: Validate data rows
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a checkbox

Scenario: Validate data rows for edit button
Given Admin is on the dashboard page after Login 
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a edit icon that is enabled

Scenario: Validate data rows for delete button
Given Admin is on the dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a delete icon that is enabled

Scenario: Validate pop up for adding user
Given Admin is on the dashboard page after Login and clicks "User" from navigation bar
When Admin clicks "+ A New User" button
Then A new pop up with User details appears

 

















