import java.util.Random;
import javax.swing.JOptionPane;

public class FinalProject_Guessing_Game {

	public static void main(String[] args) {
		Random rn = new Random(); 
		int[] RandomNumber = new int[9]; 
		
		int Option = JOptionPane.showConfirmDialog(null, "Would You like To play?", "Number Guessing Game", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(Option == JOptionPane.NO_OPTION) {
			System.exit(Option);
		}
		
		while(true) {															
		String Guess = JOptionPane.showInputDialog("Enter a Guess: (0-9 only) ");
		 if (Guess == null) {
		      return; 
		 } 
		
		int Display = JOptionPane.showConfirmDialog(null,"Your Number is " + Guess, "Do you want To proceed?" ,  
				JOptionPane.YES_NO_OPTION);
		
		if(Display == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Returning....");
		}else {	
				
		int user = Integer.parseInt(Guess);
			
		for (int i = 0; i < 1; i++) {
			RandomNumber[i] = rn.nextInt(9);
		
	      if(user >= 10) { 
	    	  JOptionPane.showMessageDialog(null, "Invalid, Try Again", "Error", JOptionPane.ERROR_MESSAGE);
	    	}
	      
	      else if(RandomNumber[i] == user)
	    	  JOptionPane.showMessageDialog(null,"The Number is " + RandomNumber[i] + " Congratulation! You Won!", "Result"
	    			  , JOptionPane.INFORMATION_MESSAGE);
	      
		else{
	    			JOptionPane.showMessageDialog(null,"The Winning Number: " + RandomNumber[i] + " You Lost, Try Again", "Result",
	    					JOptionPane.INFORMATION_MESSAGE); 
	    	}
	     }
	    }
	   }
      }
}