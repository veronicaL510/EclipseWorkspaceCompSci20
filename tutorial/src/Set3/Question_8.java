package Set3;
import java.util.Random;

public class Question_8 {

	public static int monopolyRoll() { // provides a random result based on the dice-rolling rules for the board game of monopoly
		Random randy = new Random (); 
	
		int randNum = randy.nextInt(7); // generates a random number
		int randNum2 = randy.nextInt(7); // generates a random number
		
		do {
		if (randNum == randNum2) { // executes if both the random numbers are the same value
			int randNum3 = randy.nextInt(7); // generates a random number
			int randNum4 = randy.nextInt(7); // generates a random number
		System.out.println("Since the generated numbers are the same, we generated two more numbers and added them together.  And the sum is " + (randNum + randNum2 + randNum3 + randNum4) + "."); // prints out sum to the console
		}
		else // executes if both the random numbers are not of the same value
			System.out.println("Since the generated numbers are not the same, you're good!  The sum is " + randNum + randNum2 + "."); // prints out sum to the console
			return randNum2;
			}
	 while (randNum == randNum2); }
	
	public static void main(String[] args) {
		monopolyRoll(); // calls monopolyRoll 
		
}
}