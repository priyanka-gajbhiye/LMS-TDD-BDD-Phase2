	
		#	Background: Admin click +Add New Attendance button after reaching to Manage attendance page

			Feature: Add New Verification 
			
		Scenario Outline: Validate admin able to create new attendance data
    	Given Admin is in  attendance details popup window
    	When 	Admin enters all the mandatory values with valid data from "<SheetName>"and <RowNumber> and click save
    	Then 	Admin should see new attendance details in manage attendance details
    	Examples:
      | SheetName | RowNumber |
      | Sheet2    |      2|
      
  	Scenario Outline: Validate admin able to create new attendance data without program name
			Given Admin is in attendance details popup window
    	When Admin enters data missing value in program name from "<SheetName>" and <RowNumber> and clicks save button
    	Then Program name is missing "Error Msg"
    	Examples: 
      | sheetname | RowNumber |
      | Sheet2    |         3 |
    	
    
    	Scenario Outline: Validate admin able to create new attendance data without class name
    	Given Admin is in  attendance details popup window
    	When Admin enters data missing value in class name from "<SheetName>" and <RowNumber> and clicks save button
    	Then class name is missing "Error Msg"
    	Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         4 |
    	
    	Scenario Outline: Validate admin able to create new attendance data without student name
    	Given Admin is in  attendance details popup window
    	When Admin enters data missing value in student name from "<SheetName>" and <RowNumber>  and click save                
    	Then student name is missing "Error msg"
    	Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |         5 |
    
    	
    	Scenario Outline: Validate admin able to create new attendance data without attendances
    	Given Admin is in  attendance details popup window
    	When Admin fills values missing attendance from "<SheetName>"and<RowNumber> and click save                
    	Then Attendance is missing "Error msg"
   		Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        6 |   
      
    	Scenario Outline: Validate admin able to create new attendance data without attendance date
    	Given Admin is in  attendance details popup window
    	When Admin fills values missing attendance date from "<SheetName>" and <RowNumber> and click save                
    	Then Attendance date is missing "Error msg"
    
      
    	Scenario Outline: Validate admin able to create new attendance by selecting future date
    	Given Admin is in attendance details popup window
    	When Admin fills values with future date from "<SheetName>"and <RowNumber>  and click save                
    	Then Invalidate attendance date 
    	Examples: 
      | Sheetname | RowNumber |
      | Sheet2    |        8 |
    
    	
		
		
			