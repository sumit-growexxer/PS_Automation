Feature: Bill Management

  Scenario: User navigates to Bill management
    Given user is on dashboard 
    When Hover to Operations
    And Click on Bill management
    Then User is on Bill management
    
    
   Scenario: User should be able to download excel on Bill management 
     Given User is on Bill management 
     When User clicks on Download excel on Bill management
     Then Excel is downloaded on Bill management
     
     
   Scenario: User should be able to search a record on Bill management
     Given User is on Bill management 
     When Click on Searchbar on Bill management 
     And Enter Text in searchbar on Bill management
     And Click on Search button on Bill management 
     Then Searched record is displayed on Bill management 
     
       Scenario: User should be able to add a private note on Bill management 
     Given User is on Bill management 
     When Click on Note icon on Bill management 
     And Enter text on note on Bill management 
     And Select privacy as private on Bill management 
     And Click on save on note popup on Bill management 
     Then Note should be displayed to list on Bill management 