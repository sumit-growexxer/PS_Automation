Feature: Chargebacks

  Scenario: User navigates to Chargebacks
    Given user is on dashboard 
    When Hover to Operations
    And Click on Chargebacks
    Then User is on Chargebacks
    
    
   Scenario: User should be able to download excel  
     Given User is on Chargebacks 
     When User clicks on Download excel page 
     Then Excel is downloaded 
     
     
   Scenario: User should be able to search a record
     Given User is on Chargebacks 
     When Click on Searchbar 
     And Enter Text
     And Click on Search button 
     Then Searched record is displayed 
     

     
       