package com.alexspalvieri.assessment;

public class CeilingFan {
	//Pulls a cord based on the given cord number
	public void pullCord(int cord) {
		if (cord == 1) {
			//Increments speed, or sets it to 0 if it's greater than 3
			this.speed = (this.speed + 1 <= 3 ? this.speed + 1 : 0);
			System.out.println("\nSpeed changed!");
		}
		else if (cord == 2) {
			//Swaps the direction of the fan
			this.direction = !this.direction;
			System.out.println("\nDirection changed!");
		}
		else {
			System.out.println("\nInvalid cord pulled!");
		}
	}
	
	//Prints the current statistics of this fan
	public void printFan() {
		System.out.println("Fan Speed: " + (this.speed == 0 ? "off" : this.speed));
		System.out.println("Fan Direction: " + (this.direction ? "right" : "left"));
	}
	
	//4 possible speeds, 1-3 with 0 being off
	private int speed = 0;
	//Two directions, right(true) and left(false)
	private boolean direction = true;
}
