package com.alexspalvieri.assessment;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		CeilingFan fan = new CeilingFan();
		
		String command = "";
		boolean run = true;
		
		//Run the main program, printing commands and fan stats each time
		while (run) {
			fan.printFan();
			System.out.println("0. Exit\n1. Pull cord #1 (speed)\n2. Pull cord #2 (direction)");
			command = reader.nextLine();
			switch (command) {
			case "0":
				run = false;
				break;
			case "1":
			case "2":
				fan.pullCord(Integer.parseInt(command));
				break;
			default:
				break;
			}
		}
		reader.close();
	}
}
