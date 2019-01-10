package Lesson11;
import java.util.Scanner; // imports scanner

public class ProjectNameReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanWords = new Scanner(System.in); // creating an object
		
		System.out.print("Hey there!  What is your name? "); // prompts the user to type name
		String name = scanWords.nextLine(); // scanning words in the next line
		String reverse = " "; // declares string reverse and storing a 'space' into it 
		name = name.toLowerCase(); // makes sure that all the letters in the user's name is in lower case when it is reversed
		
		for (int x = name.length() - 1; x >= 0; x--) // does all the reversing work (uses the index of the name string)
		{
			reverse += name.charAt(x); // combines the reverse name and stores it into reverse variable
		}
		
		System.out.println("The reversed version of your name is... " + reverse + ".");
		 // prints out the reversed version of the user's input
		
	}

}
