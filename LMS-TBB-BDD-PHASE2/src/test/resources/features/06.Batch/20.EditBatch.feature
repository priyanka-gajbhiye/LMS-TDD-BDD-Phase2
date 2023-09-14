Feature: Edit Batch

  Background: Logged on the LMS portal
    Admin is on dashboard page after Login
    Admin clicks ""Batch"" from navigation bar


  Scenario: Validate row level edit icon
    Given :The edit icon on row level in data table is enabled
    When :Admin clicks the edit icon
    Then :A new pop up with Batch details appears

  Scenario Outline: Check if the fields are updated
    Given :Admin Edit new Batch from "<SheetName>" and <Rownumber>
    When :Update the fields with valid values and click save
    Then :The updated batch details should appear on the data table

    Examples: 
      | SheetName | Rownumber |
      | BatchEdit |         0 |
      | BatchEdit |         1 |

  Scenario Outline: Check if the update throws error with invalid valued
    Given :Admin Edit new Batch from "<SheetName>" and <Rownumber>
    When :Update the fields with invalid values and click save
    Then :Error message should appear

    Examples: 
      | SheetName | Rownumber |
      | BatchEdit |         0 |
      | BatchEdit |         2 |

  Scenario Outline: Check if you get error message when mandatory fields are erased
    Given :Admin Edit new Batch from "<SheetName>" and <Rownumber>
    When :Erase data from mandatory field
    Then :Error message should appear

    Examples: 
      | SheetName | Rownumber |
      | BatchEdit |         0 |
      | BatchEdit |         3 |

  Scenario Outline: Check if description field is optional in update
    Given :Admin Edit new Batch from "<SheetName>" and <Rownumber>
    When :Erase data from description field
    Then :The updated batch details should appear on the data table

    Examples: 
      | SheetName | Rownumber |
      | BatchEdit |         0 |
      | BatchEdit |         4 |
