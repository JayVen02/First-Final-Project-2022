import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] RandomNumber = new int[9]; //array that hold integer 9 value
	
		for (int i = 0; i < 5; i++) {
			RandomNumber[i] = rn.nextInt(9);
			System.out.println(RandomNumber[i]);
}
	}
}