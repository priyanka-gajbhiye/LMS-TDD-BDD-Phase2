#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#		Background: Admin click +Add New Attendance button after reaching to Manage attendance page
				Feature: Edit Attendance
			Scenario Outline: Verify input fields in Attendance details popup window
    Given Admin is on manage attendance Page
    When Admin click +Add new attendance button
    Then  Admin should see input "<fields>" Text
    Examples:
    |fields|
    |Program Name| 
    |Class Name|
    |Student Name|
    |Attendance|
    |Attendance Date|

    	
				Scenario: Validate admin able to update attendance data without program name
    		Given Admin is in  attendance details popup window
    		When Admin fills values missing program name and click save
    		Then Program name is missing
    		
    		Scenario: Validate admin able to update attendance data without class name
    		Given Admin is in  attendance details popup window
    		When Admin fills values missing class name and click save
    		Then class name is missing
    		
    		
    		Scenario: Validate admin able to create new attendance data without student name
    		Given Admin is in  attendance details popup window
    		When Admin fills values missing student name and click save                
    		Then student name is missing
    		
    		Scenario: Validate admin able to create new attendance data without attendances
    		Given Admin is in  attendance details popup window
    		When Admin fills values missing attendance and click save                
    		Then Attendance is missing
    		
    		Scenario: Validate admin able to create new attendance data without attendance date
    		Given Admin is in  attendance details popup window
    		When Admin fills values missing attendance date  and click save                
    		Then Attendance date is missing
    		
    		Scenario: Validate admin able to create new attendance by selecting future date
    		Given Admin is in  attendance details popup window
    		When Admin fills values with future date  and click save                
    		Then Invalidate attendance date
    		
    	