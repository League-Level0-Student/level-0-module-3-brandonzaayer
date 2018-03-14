import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String Pi = ("3.1415926535897932384626");
		System.out.print("Pi equals: ");
		for (int i = 0; i < 4; i++) {
			System.out.print(Pi.charAt(i));
		}

		
for(int i = 4; i < Pi.length(); i++) {
	String QuestionPi = JOptionPane.showInputDialog("Do you know the next digit of pi?");
if(QuestionPi.equals(Character.toString(Pi.charAt(i)))){
			
			
	JOptionPane.showMessageDialog(null, "You got it, but do you know the next digit?");
	System.out.print(Pi.charAt(i));
		}
			
		else {
			JOptionPane.showMessageDialog(null, "NO PIE FOR YOU!");
			System.exit(0);
		}
		
}
		
		
		
	}

}
