package extras;

import org.jointheleague.graphical.robot.Robot;


public class SaintValentinesDay {
	
	
	
	public static void main(String[] args) {
		
		Robot Valentine=new Robot("vic");
		
		Valentine.setWindowImage("valentine.jpg");
		
		Valentine.setSpeed(100);
		Valentine.setPenColor(250, 250, 250);
		Valentine.penDown();
		Valentine.setPenWidth(75);
		Valentine.turn(-35);
		Valentine.move(200);
		
		for(int o=0; o<2; o++) {
		for(int i=0; i<210; i++) {
			Valentine.move(1);
			Valentine.turn(1);
			
		}
		Valentine.turn(180);
		}
		
		Valentine.move(-200);
		Valentine.setAngle(0);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Valentine.hide();
	}
	}
	
	
	
	
	
	

