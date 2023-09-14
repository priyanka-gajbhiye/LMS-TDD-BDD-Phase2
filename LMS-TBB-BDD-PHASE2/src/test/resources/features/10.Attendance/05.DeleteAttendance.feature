

#	Background: Admin logged into LMS portal and clicks attendance button on the navigation bar 
			Feature: Delete Attendance
				Scenario: Verify Delete attendance alert
    		Given Admin is in manage attendance page
    		When Admin clicks delete button in data table row level
    		Then Admin should see alert
    		
    		Scenario: Verify  accept enabled in alert
    		Given Admin is in manage attendance page
    		When Admin clicks delete button in data table row level
    		Then Alert should have "yes" button to accept 
    		
    		Scenario: Verify reject enabled in alert
    		Given Admin is in manage attendance page
    		When Admin clicks delete button in data table row level
    		Then Alert should have "No" button to reject
    		
    		Scenario: Validate accept in alert
    		Given Admin is in delete alert
    		When Admin clicks yes button
    		Then Success message and selected attendance details are deleted from the data table
    		
    		Scenario: Validate reject in alert
    		Given Admin is in delete alert
    		When Admin clicks no button
    		Then Redirected attendance page and selected attendance details are not deleted from the data table
    		
    		
    	