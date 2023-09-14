Feature: Delete user

Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar

Scenario: Validate row level delete icon
Given The delete icon on row level in data table is enabled
When Admin clicks the delete icon
Then Alert appears with yes and No option

Scenario: Validate accept alert
Given Admin is on alert window
When Admin click yes option
Then User deleted alert pops and user is no more available in data table

Scenario: Validate reject alert
Given Admin is on alert window
When Admin click No option
Then User is still listed in data table