package StepDefenition;

public class Rover {

	    private int x;
	    private int y;
	    private Direction direction;

	    public Rover(int x, int y, Direction direction) {
	        this.x = x;
	        this.y = y;
	        this.direction = direction;
	    }

	    public void move() {
	        switch (direction) {
	            case NORTH:
	                y++;
	                break;
	            case EAST:
	                x++;
	                break;
	            case SOUTH:
	                y--;
	                break;
	            case WEST:
	                x--;
	                break;
	        }
	    }

	    public void turnLeft() {
	        switch (direction) {
	            case NORTH:
	                direction = Direction.WEST;
	                break;
	            case EAST:
	                direction = Direction.NORTH;
	                break;
	            case SOUTH:
	                direction = Direction.EAST;
	                break;
	            case WEST:
	                direction = Direction.SOUTH;
	                break;
	        }
	    }

	    public void turnRight() {
	        switch (direction) {
	            case NORTH:
	                direction = Direction.EAST;
	                break;
	            case EAST:
	                direction = Direction.SOUTH;
	                break;
	            case SOUTH:
	                direction = Direction.WEST;
	                break;
	            case WEST:
	                direction = Direction.NORTH;
	                break;
	        }
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public Direction getDirection() {
	        return direction;
	    }
	}



