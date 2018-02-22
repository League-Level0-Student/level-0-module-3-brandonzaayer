package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	int answer = JOptionPane.showConfirmDialog(null, "Are you happy?"); 
	if ( answer == 0 ) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		}
	else  {
		JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
		if ( answer == 0 ) {
			JOptionPane.showMessageDialog(null, "Change something.");}
		else {
			JOptionPane.showMessageDialog(null, "You live a sad life.");
		}
	}
	
}
}
