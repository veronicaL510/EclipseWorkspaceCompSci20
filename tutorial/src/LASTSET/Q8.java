package LASTSET;
import java.util.Random;

public class Q8 {

	public static void monopolyRoll() {
		Random randy = new Random ();
		
		int randNum = randy.nextInt(7); // generates a random number
		int randNum2 = randy.nextInt(7); // generates a random number
//		randNum = 2;    for testing 
//		randNum2 = 2;   for testing
		int totalRolled = 0; // declares a variable
		
		while (randNum == randNum2) {
			totalRolled = randNum + randNum2 + totalRolled;
//			randNum = randy.nextInt(7); // generates a random number
			randNum2 = randy.nextInt(7); // generates a random number
//			randNum = 3; 
//			randNum2 = 2;
			
		if (randNum != randNum2) {
			System.out.println("Since the new generated numbers are not the same, you're good!  The sum is " 
		+ (randNum + randNum2 + totalRolled) + "."); // prints out sum to the console
		}

		}
		
		System.out.println("Since the generated numbers are not the same, you're good!  The sum is " 
				+ (randNum + randNum2 + totalRolled)+ ".");  // prints out sum to the console
	}
	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		monopolyRoll(); // calls monopolyRoll 
		
	}

}
