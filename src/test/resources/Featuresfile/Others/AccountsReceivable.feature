Feature: Accounts receivable

  Scenario: User navigates to Accounts receivable page
    Given user is on dashboard 
    When Hover to Operations
    And Click on Accounts receivable 
    Then User is on Accounts receivable page 
    
    
   Scenario: User should be able to download excel  
     Given User is on Accounts receivable page 
     When User clicks on Download excel page 
     Then Excel is downloaded 
     
     
   Scenario: User should be able to add a private note   
     Given User is on Accounts receivable page
     When Click on Note icon 
     And Enter text on note 
     And Select privacy as private
     And Click on save on note popup
     Then Note should be displayed to list 
     
   Scenario: User should be able to search a record
     Given User is on Accounts receivable page 
     When Click on Searchbar 
     And Enter Text
     And Click on Search button 
     Then Searched record is displayed 
     

     
       