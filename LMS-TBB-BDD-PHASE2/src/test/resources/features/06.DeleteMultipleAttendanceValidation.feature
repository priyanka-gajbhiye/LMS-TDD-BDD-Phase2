
#		Background: Admin logged into LMS portal and clicks attendance button on the navigation bar 
		Feature: Delete Multiplication Attendance
				Scenario: Verify delete multiple class  button is enabled
    		Given Admin is in manage attendance page
    		When Admin clicks single  row level check box in the data table
    		Then Admin should see delete icon below the header is enabled
    		
    		Scenario:verify tick mark is visible after clicking on check box for single data
    		Given Admin is in manage attendance page
    		When Admin clicks single  row level check box in the data table
    		Then Admin should see delete icon below the header is enabled
    		
    		Scenario: verify tick mark is visible after clicking on check box for single data
    		Given Admin is in manage attendance page
    		When Admin clicks single  row level check box in the data table
    		Then Admin should see tick mark in check box 
    		
    		Scenario: verify admin able to click multiple check box
    		Given Admin is in manage attendance page
    		When Admin clicks multiple row level check box in the data table
    		Then Admin should see tick mark in check box  of the selected rows
    	
    	
    #	Background: Admin clicks delete button under header after selecting the check box in the data table		
    		Scenario: Verify accept alert in delete multiple attendance by selecting single checkbox
    		Given Admin is in delete alert
    		When Admin clicks yes button
    		Then Success message and selected attendance detail are deleted from the data table
    		
    		Scenario: Verify reject alert in delete multiple attendance by selecting single checkbox
    		Given Admin is in delete alert
    		When Admin clicks no button
    		Then Redirected to attendance page and selected attendance details are not deleted from the data table
    		
				Scenario: Verify reject alert in delete multiple attendance by selecting multiple checkbox
				Given Admin is in delete alert
				When Admin clicks no button
				Then Redirected to attendance page and selected attendance details are not deleted from the data table
							
				