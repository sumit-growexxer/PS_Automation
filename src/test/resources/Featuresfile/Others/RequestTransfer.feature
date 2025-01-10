Feature: Request Transfer

  Scenario: User navigates to Request transfer
    Given user is on dashboard 
    When Hover to Account
    And Hover to Accounting and Wallet
    And Click on Request transfer
    Then User is on Request transfer page
    
    
   Scenario: User should be able to download excel  
     Given User is on Request transfer page 
     When User clicks on Download excel page 
     Then Excel is downloaded 
     
     
   Scenario: User should be able to add a private note   
     Given User is on Request transfer page
     When Click on Note icon 
     And Enter text on note 
     And Select privacy as private
     And Click on save on note popup
     Then Note should be displayed to list 
     
   Scenario: User should be able to search a record
     Given User is on Request transfer page 
     When Click on Searchbar 
     And Enter Text
     And Click on Search button 
     Then Searched record is displayed 