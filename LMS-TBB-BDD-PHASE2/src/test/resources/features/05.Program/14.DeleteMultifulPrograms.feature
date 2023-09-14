Feature: Multiple Delete Program

Background: Logged on the LMS portal

#Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
Scenario: Validate Common Delete button enabled after clicking on any checkbox

 Given :Admin is in Manage Program page
 When :Admin clicks any checkbox in the data table
 Then :Admin should see common delete option enabled under header Manage Program
   
 #Background: Admin clicks delete button under header after selecting the check box in the data table
 Scenario: Validate multiple program deletion by selecting Single checkbox

 Given :Admin is on Confirm Deletion alert
 When :Admin clicks <YES> button on the alert
 Then :Admin should land on Manage Program page and can see the selected program is deleted from the data table
 
 Scenario: Validate multiple program deletion by selecting Single checkbox
 
 Given :Admin is on Confirm Deletion alert
 When :Admin clicks <NO> button on the alert
 Then :Admin should land on Manage Program page and can see the selected program is not deleted from the data table
 
 #Background: Admin clicks delete button under header after selecting multiple checkboxes in the data table
 
 Scenario: Validate multiple program deletion by selecting multiple check boxes
 
 Given :Admin is on Confirm Deletion alert
  When :Admin clicks <YES> button on the alert
 Then :Admin should land on Manage Program page and can see the selected programs are deleted from the data table
 
 Scenario: Validate multiple program deletion by selecting multiple check boxes
 
 Given :Admin is on Confirm Deletion alert
  When :Admin clicks <NO> button on the alert 
 Then :Admin should land on Manage Program page and can see the selected programs are not deleted from the data table