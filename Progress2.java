import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Progress2 {
	public static void main(String[] args) {
		Object[] option = { "Play", "No"};

	    JPanel Guess = new JPanel();
	    Guess.add(new JLabel("Enter number between 0 and 1000"));
	    JTextField textField = new JTextField(9);
	    Guess.add(textField);

	    int user = JOptionPane.showOptionDialog(null, Guess, "Enter a Number",
	        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
	        option, null);
	    if (user == JOptionPane.YES_OPTION) {
//	      JOptionPane.showMessageDialog(null, textField.getText());
	    
		Random rn = new Random();//Randomizer Code Sytnax : Random variable(); 
		int[] RandomNumber = new int[9]; //0-9 number 
		{
//		String Guess = JOptionPane.showInputDialog("0-9 only: ");

		String message = "Result:";
//		int user = Integer.parseInt(Guess);//it converts the string to integer.
		
		for (int i = 0; i < 1; i++) {
			RandomNumber[i] = rn.nextInt(9);//randomizer Code Sytnax : int value = variable.nextInt(value) 

	      if(RandomNumber[i] == user) { // if the Random number and the user number the same he/she won
	    		JOptionPane.showMessageDialog(null, RandomNumber[i] + " Congratulation! You Won!", message, JOptionPane.INFORMATION_MESSAGE);
	    		
	    	}else {
	    			JOptionPane.showMessageDialog(null,"The Winning Number: " + RandomNumber[i] + " You Lost", message, JOptionPane.INFORMATION_MESSAGE);
	    	}
	    }
	}
	}
}
}