Feature: Sales orders page

  Scenario: User navigates to sales orders page
    Given user is on dashboard 
    When Hover to Operations
    And Hover to sales
    And Click on Sales orders 
    Then User is on Sales orders page 
    
      
    
   Scenario: User should be able to download excel  
     Given User is on Sales orders page 
     When User clicks on Download excel page 
     Then Excel is downloaded 
     
     
   Scenario: User should be able to add a private note   
     Given User is on Sales orders page
     When Click on Note icon 
     And Enter text on note 
     And Select privacy as private
     And Click on save on note popup
     Then Note should be displayed to list 
    
     
   Scenario: User should be able to search a record
     Given User is on Sales orders page 
     When Click on Searchbar 
     And Enter Text
     And Click on Search button 
     Then Searched record is displayed 
     

     
       