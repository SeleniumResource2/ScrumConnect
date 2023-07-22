Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Validation of rover direction
    Given Rover processing 
    When Rover Positioning 1 and 2 with specific direction
    Then Direction facing and position initialization
  
  Scenario: Validation of rover x, y position and location
    Given Rover processing
    When Rover Positioning 1 and 2 with specific direction 
    Then Move rover position and location
    
  Scenario: Validation of rover scenario
    Given Rover processing
    When Rover Positioning 1 and 2 with specific direction 
    And Rover processed with specific input "LMLMLMLMM"
    Then Rover scenario validation per input
    

