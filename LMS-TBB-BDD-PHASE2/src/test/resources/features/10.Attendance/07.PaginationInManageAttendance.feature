
#		Background: Logged on the LMS portal as Admin
		
				Feature: Pagination Manage Attendance
				Given Admin is on dashboard page after Login
				When Admin clicks "attendance" button on the navigation bar
				
				Scenario: Verify sheet one is displayed on default in data table
				Then Data table should display 1 page  when entries available
    	
    		Scenario: Verify  right arrow is enable when sheet one is displayed in data table
				Then Data table should display 1 page  when entries available
				
    	
    		Scenario: Verify  left arrow is disable when sheet one is displayed in data table
				Then Left arrow should be disabled in page one  when entries are more than 5 available
				
				Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
				Then Right arrow should be enabled in page two when entries are more than 10 available
				
				Scenario:Verify  left arrow is enable when sheet two is displayed in data table
				Then Left arrow should be enabled in page two 

    		Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
				Then Data table should display  page 1  when entries available
				
				Scenario: Verify pagination controls enabled
				Then If the entries are more than 5 in data table pagination controls enabled
				
				
				Scenario: Verify pagination controls disabled
				Then If the entries are less than 5 in data table pagination controls disabled
			
#			Background: Admin click +Add New attendance button after reaching to Manage attendance page	
			
				
				Scenario: Verify next page is enabled
				Given Admin is in add attendance details popup window
				When Admin creates 6 new attendance 
				Then if the total attendance entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
				
				
    		Scenario: verify next page is disabled
    		Given Admin is in add attendance details popup window
				When Admin creates less than or equal to 5 new attendance 
				Then When total attendance entries  5 or below next page is disabled
				
				
    	
				
    	
    	
    	