
	#	Background: Admin is manage class page after logged in

	Feature: Navigation function validation from manage attendance page to other pages  

  	Scenario: Verify admin is able to navigate from manage attendance to student page
    Given Admin is in manage attendance page
    When Admin clicks " Student" button in the navigation bar
    Then Admin should able to land on student page
    
    Scenario: Verify admin is able to navigate from manage attendance to program page
    Given Admin is in manage attendance page
    When Admin clicks " Program" button in the navigation bar
    Then Admin should able to land on program page
    
    Scenario: Verify admin is able to navigate from manage attendance to batch page
    GivenAdmin is in manage attendance page
    When Admin clicks " Batch" button in the navigation bar
    Then Admin should able to land on batch page
    
    Scenario: Verify admin is able to navigate from manage  attendance to user page
    Given Admin is in manage attendance page
    When Admin clicks " User" button in the navigation bar
    Then Admin should able to land on user page
    
    Scenario: Verify admin is able to navigate from manage attendance to assignment page
    Given Admin is in manage assignment page
    When Admin clicks " class" button in the navigation bar
    Then Admin should able to land on class page
    
    Scenario: Verify admin is able to navigate from manage attendance to attendance page
    Given Admin is in manage attendance page
    When Admin clicks " Attendance" button in the navigation bar
    Then Admin should able to land on Attendance page
    
    Scenario: Verify admin should able to do logout function from manage attendance
    Given Admin is in manage attendance page
    When Admin clicks "Logout" button in the navigation bar
    Then Admin should able to land on login page
     	
				