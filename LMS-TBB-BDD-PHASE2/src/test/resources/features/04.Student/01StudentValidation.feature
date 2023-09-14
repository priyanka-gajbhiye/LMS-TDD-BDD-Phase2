
@tag
Feature: Student Page Validation

Background: Logged on the LMS portal as Admin 


  @tag1
  Scenario: Validate the title of the page 
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see the Student details Page Title
    
  @tag2
  Scenario: Validate response time from dashboard page to student page
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then  Maximum navigation time in milliseconds, defaults to 30 seconds
  
  @tag3
  Scenario: Validate the broken link
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then HTTP response >= 400. 
  And  The link is broken
  
  @tag4
  Scenario: Verify LMS title 
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see LMS -Learning management system  as title  
  
  @tag5
  Scenario: Verify the alignment of the Student detail title
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Student Detail title should be in centre of the page
 
  @tag6
   Scenario: Validate drop down is present in the page
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Two dropdowns should be present in the page
  
  @tag7
   Scenario: Validate search bar in select student name drop down
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see search box inside studentname drop down 
  
 
 @tag8
   Scenario: Validate search bar in select batch id drop down
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see search box inside  batch id drop down 
  
   @tag9
   Scenario: Validate text spelling student name
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see correct spelling select student name
  
   @tag10
   Scenario: Validate text spelling select batch id
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see correct spelling select  batch id text
  
  
  
 @tag11
   Scenario: Validate gray color in student name drop down
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see select student name in gray color
                        
                        
   @tag12
   Scenario: Validate gray color in batchId drop down
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see select batch ID in gray color
                        
                        
  @tag13
   Scenario: Validate first drop down label is select student name
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see select student name in first
  
   @tag14
   Scenario: Validate second drop down label is select batch id
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should see select batch id in second
  
   @tag15
   Scenario: Validate scroll down inside student name dropdown
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should able to scroll down to select the student name
   
   @tag16
   Scenario: Validate scroll down inside batch id dropdown
  Given Admin is on dashboard page after Login
  When Admin clicks "Student" on the navigation bar
  Then Admin should able to scroll down to select the batch id
  
                                                                                                                                                                                     