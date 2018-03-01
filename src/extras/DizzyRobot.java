//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		String dIzzy=JOptionPane.showInputDialog("How dizzy would you like your robot? On a scale from 1-10.");
		int numberOfSpins = Integer.parseInt(dIzzy);
		
 // 1. Use the dance method to make the robot spin.
	
		robot.setSpeed(10);
		dance(numberOfSpins);
	
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

