$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Mars.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of rover direction",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Rover processing",
  "keyword": "Given "
});
formatter.match({
  "location": "RoverSteps.rover_direction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rover Positioning 1 and 2 with specific direction",
  "keyword": "When "
});
formatter.match({
  "location": "RoverSteps.rover_Positioning_and_with(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Direction facing and position initialization",
  "keyword": "Then "
});
formatter.match({
  "location": "RoverSteps.direction_facing_and_position_initialization()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of rover x, y position and location",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Rover processing",
  "keyword": "Given "
});
formatter.match({
  "location": "RoverSteps.rover_direction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rover Positioning 1 and 2 with specific direction",
  "keyword": "When "
});
formatter.match({
  "location": "RoverSteps.rover_Positioning_and_with(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move rover position and location",
  "keyword": "Then "
});
formatter.match({
  "location": "RoverSteps.move_rover_position_and_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of rover scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Rover processing",
  "keyword": "Given "
});
formatter.match({
  "location": "RoverSteps.rover_direction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rover Positioning 1 and 2 with specific direction",
  "keyword": "When "
});
formatter.match({
  "location": "RoverSteps.rover_Positioning_and_with(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rover processed with specific input \"LMLMLMLMM\"",
  "keyword": "And "
});
formatter.match({
  "location": "RoverSteps.rover_processed_with_specific_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rover scenario validation per input",
  "keyword": "Then "
});
formatter.match({
  "location": "RoverSteps.rover_scenario_validation_per_input()"
});
formatter.result({
  "status": "passed"
});
});