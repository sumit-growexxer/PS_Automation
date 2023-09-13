Feature: Sales report Sales orders page

  Scenario: User navigates to sales report sale orders page
    Given user is on dashboard 
    When Click on Operation
    And Click on Sales reports
    And Click on Sales orders 
    Then user is on sales orders page 
    
      Scenario: validate whether the Excel to export is working or not
    Given user is on dashboard 
    When Click on Operation
    And Click on Sales reports
    And Click on Sales orders  
    And Click on Exxcel export icon 
    Then Loader should be display untill excel is downloads