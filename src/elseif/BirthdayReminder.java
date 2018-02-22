
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 11th";
		String dadsBirthday = "May 24th";
		String myBirthday = "July 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String bday = JOptionPane.showInputDialog("Who's birthday would you like to know?");
		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if( bday.equals("mom")) {
			System.out.println( momsBirthday );
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if( bday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		
		// 6. if user asked for your name
			// print myBirthday
	else if( bday.equals("yours")){
		System.out.println( myBirthday );
	}
		//7. otherwise print "Sorry, I don't remember that person's birthday!"
	else {
		System.out.println("Sorry I don't know that name.");
	}
	} 
}
