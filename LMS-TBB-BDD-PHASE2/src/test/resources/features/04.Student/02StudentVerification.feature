

@tag
Feature: Student Page Verification and  validation 

Background: Admin is logged in and on the student Details page
Given Admin is on student details page


  
  @tag1
   Scenario Outline: Validate only numbers inside select batch id
  Given Admin is on student details page
  When Admin clicks <options> on the batchid dropdown
  Then Admin should see only numbers inside batch id drop down
  Examples:
  |1255|
  |7583|
  |8675|
  |7566|
  

  @tag2
  Scenario: Validate select student name is fading
  Given Admin is on student details page
  When Admin select student name from the drop down 
  Then Admin should not see select student name text 
  
  @tag3
  Scenario: Validate select batch id is fading
  Given Admin is on student details page
  When Admin select batch id from the drop down 
  Then Admin should not see select batch id text 
  
   
  
   @tag4
  Scenario: Validate select student name using search box
  Given Admin is on student details page
  When Admin clicks select student name and  enters "s" alphabet in the search box 
  Then Admin should see student name start with "s" is listed below
  
   @tag5
  Scenario: Validate select batch id using search box
  Given Admin is on student details page
  When Admin  clicks select batch id and enter 6 number in the search box 
  Then Admin should see batch id start with 6 is listed below 
  
   
 @tag6
  Scenario Outline: Validate selecting only  student name  will not display any details
  Given Admin is on student details page
  When Admin selects only student name from "<sheetname>" and <rownumber>
  Then Student details should not be displayed
  Examples:
  |sheetname|rownumber|
  |sheet1        |0        |
  |sheet1        |1        |
     
   @tag7
  Scenario Outline: Validate selecting only  batch id  will not display any details
  Given Admin is on student details page
  When Admin selects only  batch id from "<sheetname>" and <rownumber>
  Then Student details should not be displayed
  Examples:
  |sheetname|rownumber|
  |sheet1        |0        |
  |sheet1        |2        |
     
   @tag8
  Scenario Outline: Validate selecting student name and batch id
  Given Admin is on student details page
  When Admin selects  student name and batch id from "<sheetname>", <rownumber>
  Then Particular student informations should be displayed
  Examples:
  |sheetname|rownumber|
  |sheet1        |0        |
  |sheet1        |3       |
     
    @tag9
  Scenario: Program link on navigation bar
  Given Admin is on student details page
  When Admin clicks on program link on student  page
  Then Admin is redirected to Program page
  
    @tag10
  Scenario: Batch link on navigation bar
  Given Admin is on student details page
  When Admin clicks on Batch link on student page
  Then Admin is redirected to Batch page
  
    @tag11
  Scenario: Class link on navigation bar
  Given Admin is on student details page
  When Admin clicks on Class link on student page
  Then Admin is redirected to Class page
  
    @tag12
  Scenario: User link on navigation bar
  Given Admin is on student details page
  When Admin clicks on user link on student page
  Then Admin is redirected to User page
  
    @tag13
  Scenario: Assignment link on navigation bar
  Given Admin is on student details page
  When Admin clicks on Assignment link on student page
  Then Admin is redirected to Assignment page
  
  @tag14
  Scenario: Attendance link on navigation bar
  Given Admin is on student details page
  When Admin clicks on attendance link on student page
  Then Admin is redirected to Attendance page
  
   @tag15
  Scenario: Logout link on navigation bar
  Given Admin is on student details page
  When Admin clicks on Logout link on student page
  Then Admin is redirected to Login page
  
                                                                                                                                                                                                                                                                                                                             