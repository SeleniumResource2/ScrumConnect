package StepDefenition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoverSteps {

	Rover rover;

	@Then("^Direction facing and position initialization$")
	public void direction_facing_and_position_initialization() throws Exception {
		Assertions.assertEquals(1, rover.getX());
		Assertions.assertEquals(2, rover.getY());
		Assertions.assertEquals(Direction.NORTH, rover.getDirection());
	}

	@Then("^Move rover position and location$")
	public void move_rover_position_and_location() throws Exception {

		rover.move();
		Assertions.assertEquals(1, rover.getX());
		Assertions.assertEquals(3, rover.getY());
		Assertions.assertEquals(Direction.NORTH, rover.getDirection());

		rover.turnLeft();
		rover.move();
		Assertions.assertEquals(0, rover.getX());
		Assertions.assertEquals(3, rover.getY());
		Assertions.assertEquals(Direction.WEST, rover.getDirection());

		rover.turnLeft();
		rover.move();
		Assertions.assertEquals(0, rover.getX());
		Assertions.assertEquals(2, rover.getY());
		Assertions.assertEquals(Direction.SOUTH, rover.getDirection());

		rover.turnLeft();
		rover.move();
		Assertions.assertEquals(1, rover.getX());
		Assertions.assertEquals(2, rover.getY());
		Assertions.assertEquals(Direction.EAST, rover.getDirection());
	}

	@Then("^Rover scenario validation per input$")
	public void rover_scenario_validation_per_input() throws Exception {
			Assertions.assertEquals(1, rover.getX());
			Assertions.assertEquals(3, rover.getY());
			Assertions.assertEquals(Direction.NORTH, rover.getDirection());
		
	}
	
	@When("^Rover processed with specific input \"([^\"]*)\"$")
	public void rover_processed_with_specific_input(String arg1) throws Exception {
		String instructions = arg1;
		for (char instruction : instructions.toCharArray()) {
			if (instruction == 'L') {
				rover.turnLeft();
			} else if (instruction == 'R') {
				rover.turnRight();
			} else if (instruction == 'M') {
				rover.move();
			}
		}
	}

	@When("^Rover Positioning (.*) and (.*) with specific direction$")
	public void rover_Positioning_and_with(int x, int y) throws Exception {
		rover = new Rover(x, y, Direction.NORTH);
	}

	@Given("^Rover processing$")
	public void rover_direction() throws Exception {
		System.out.println("Initialization and positioning rover");
	}

}
