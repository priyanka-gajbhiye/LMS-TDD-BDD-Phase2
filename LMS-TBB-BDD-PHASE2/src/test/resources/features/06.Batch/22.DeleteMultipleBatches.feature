Feature: Delete multiful batches

Background: Logged on the LMS portal
#Admin is on dashboard page after Login
#Admin clicks "Batch" from navigation bar

Scenario:

Given :None of the checkboxes in data table are selected
Then :The delete icon under the "Manage Batch" header should be disabled

Scenario:

Given : One of the checkbox/row is selected
When :Click delete icon below "Manage Batch" header
Then :The respective row in the data table is deleted


Scenario:

Given :Two or more checkboxes/row is selected
When :Click delete icon below "Manage Batch" header
Then :The respective row in the data table is deleted