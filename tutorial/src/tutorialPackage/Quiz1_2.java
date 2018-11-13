package tutorialPackage;

public class Quiz1_2 {

	
	
	public static String isSingleDigit (int x) { // function signature
		if (x < 10) {
			return "That is a single digit.";  // returns the string if the if statement is true
		}
		else 
			return "Not a single digit."; // returns the string if the else statement is true
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSingleDigit(0)); // calls the function isSingleDigit. 
		System.out.println(isSingleDigit(23)); // calls the function again
		System.out.println(isSingleDigit(1)); // calls the function again
	}

}
