package com.yaksh.chandrayaan3TDD;

public class GalacticSpaceCraftController {

	private int x, y, z;
	private String direction;

	public GalacticSpaceCraftController(int x, int y, int z, String direction) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}

	// function to move space craft backward
	public void moveForward() {
		if ("N".equals(direction)) {
			y++;
		} else if ("S".equals(direction)) {
			y--;
		} else if ("E".equals(direction)) {
			x++;
		} else if ("W".equals(direction)) {
			x--;
		} else if ("U".equals(direction)) {
			z++;
		} else if ("D".equals(direction)) {
			z--;
		}
	}

	// function to move space craft backward
	public void moveBackward() {
		if ("N".equals(direction)) {
			y--;
		} else if ("S".equals(direction)) {
			y++;
		} else if ("E".equals(direction)) {
			x--;
		} else if ("W".equals(direction)) {
			x++;
		} else if ("U".equals(direction)) {
			z--;
		} else if ("D".equals(direction)) {
			z++;
		}
	}

	// function to turn space craft left
	public void turnLeft() {
		if ("N".equals(direction)) {
			direction = "W";
		} else if ("S".equals(direction)) {
			direction = "E";
		} else if ("E".equals(direction)) {
			direction = "N";
		} else if ("W".equals(direction)) {
			direction = "S";
		} else if ("U".equals(direction)) {
			direction = "N";
		} else if ("D".equals(direction)) {
			direction = "S";
		}
	}

	// function to turn space craft left
	public void turnRight() {
		if ("N".equals(direction)) {
			direction = "E";
		} else if ("S".equals(direction)) {
			direction = "W";
		} else if ("E".equals(direction)) {
			direction = "S";
		} else if ("W".equals(direction)) {
			direction = "N";
		} else if ("U".equals(direction)) {
			direction = "S";
		} else if ("D".equals(direction)) {
			direction = "N";
		}
	}

	// function to turn space craft in upward direction
	public void turnUp() {

	}

	// function to turn space craft in down direction
	public void turnDown() {

	}

	
	//function to execute the commands 
	public String executeCommands(String commands) {
		for (char command : commands.toCharArray()) {

			switch (command) {
			case 'f':
				moveForward();
				break;
			case 'b':
				moveBackward();
				break;
			case 'l':
				turnLeft();
				break;
			case 'r':
				turnRight();
				break;
			case 'u':
				turnUp();
				break;
			case 'd':
				turnDown();
				break;
			}
		}

		return "(" + this.x + "," + this.y + "," + this.z + ")-" + this.direction;

	}
}
