import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberGuessingProject_First {

	public static void main(String[] args) {
			int[] RandomNumber = new int[49];
			int WinningNum;
			
			Scanner num = new Scanner(System.in);
			System.out.println("Your Guess Number 0-9 only: ");
			int user = num.nextInt();
			
			for (int i = 0; i < 1; i++) {
				WinningNum = (int) (Math.random() * 9);// this will generate random number 0 to 49
				for	(int w = 0; w < i; w++) {
				if (RandomNumber[w] == WinningNum) // if the lotteryNumber is equal to Winning number, this will check if they have the same number
				{
//					WinningNum = (int) (Math.random() * 9); // the purpose of this is to check if the winning number is the same it will generate again
//				    w = -1;
				}
				
			}
				RandomNumber[i] = WinningNum;
		
		      for (int w = 0; w < RandomNumber.length; w++);
		      
		      if(RandomNumber[i] == user) { // if the lottery number and the user guess number the same he/she won
		    		System.out.println(RandomNumber[i] + " Congratulation");
		    		
		    	}else {
		    			System.out.println("The Winning Number: " + RandomNumber[i] + " You Lost");
		    		}
		    	}
		}
	}

