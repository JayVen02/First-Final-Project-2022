import java.util.Scanner;

public class CodeGuess {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    int[] guess = {0, 1, 2, 3, 4};
	    int[] secretNumber = {0, 1, 2, 3, 4};

	    System.out.println("Let the game begin...");
	    System.out.println("Guess my secret code, consisting of 1 and 2");
	    System.out.println(" ");

	        for (int i=0; i<5; i++) {
	        System.out.print("Guess number " + (i+1) + " (1 or 2): ");
	        guess[i] = scan.nextInt();
	        }
	        System.out.println(" ");
	        System.out.println("Your guess: " + "[" + guess[0] + "]" + 
	            "[" + guess[1] + "]" + "[" + guess[2] + "]" + 
	            "[" + guess[3] + "]" + "[" + guess[4] + "]");

	       for (int i=0; i<5; i++) {
	           secretNumber[i] = (int) (Math.random() * 2 + 1);
	       }
	       System.out.print("Secret code: " + "[" + secretNumber[0] + "]" + 
	            "[" + secretNumber[1] + "]" + "[" + secretNumber[2] + "]" + 
	            "[" + secretNumber[3] + "]" + "[" + secretNumber[4] + "]");

	}

	}


