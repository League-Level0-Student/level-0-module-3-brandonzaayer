//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import org.jointheleague.graphical.robot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robo=new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		//4. Use an if/else statement to set the pen color that the user requested

        //5. If the user doesn’t enter anything, choose a random color

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
robo.penDown();
robo.setSpeed(100);
		for (int i =0; i < 5; i++){
		robo.move(100);
robo.turn(144);
}
robo.hide();
	}
}
