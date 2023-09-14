@EditClass
Feature: Edit class Validation

  Background: Admin clicks Edit button in manage class after reaching manage class page
    Given Admin is in Manage class page 

 Scenario: Verify Edit class popup window
    When Admin clicks Edit button in data table  
    Then Edit popup window appears with heading Class Details
    
  Scenario: Verify values in popup window
    When Admin clicks Edit button from one of the row in data table  

  
  Scenario: Validate admin able to update class with valid data in mandatory fields
    When Admin clicks Edit button from one of the row in data table  
   
    
  Scenario: Validate admin able to  update class with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, ) 
    Then Error message should appear in alert
    
  Scenario: Validate admin able to  update class with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings) 
    Then Admin should see particular class details is updated in the data table
    
  Scenario: Validate admin able to  update  class with invalid data  in all fields
    When Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) 
    Then Error message should appear in alert
    
  Scenario: Validate admin able to update class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id) 
    Then Batch Id is missing
  
  Scenario: Validate admin able to update  class missing No of Class
    When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id, ) 
    Then No of classes is missing
    
  Scenario: Validate admin able to update class missing Class Date
    When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, ) 
    Then class date is missing
    
  Scenario: Validate admin able to update class missing staff id
    When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date ) 
    Then staff id is missing
    
  Scenario: Validate  admin able to update class passing past date 
    When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) 
    Then class cannot be updated for the passed date
    
  Scenario: Validate cancel button function in Edit class details popup window
    When Admin clicks Cancel button without entering values in the fields 
    Then Admin should land on Manage Class page
    
  Scenario: Validate cancel button function in Edit class details popup window with values in field
    When Admin clicks Cancel button entering values in the fields 
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table
  