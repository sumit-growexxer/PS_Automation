Feature: Sales report my orders page

  Scenario: User navigates to sales orders page
    Given user is on dashboard 
    When Hover to Operations
    And Hover to sales
    And Click on Sales orders 
    Then User is on Sales orders page 