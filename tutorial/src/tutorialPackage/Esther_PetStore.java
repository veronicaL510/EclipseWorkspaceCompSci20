package tutorialPackage;
import java.util.Scanner;

public class Esther_PetStore {

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in); // scanner object to take in words
		Scanner scanNums = new Scanner(System.in); // scanner object to take in numbers
		double dogPrice = 30.0; // price of one dog
		double catPrice = 29.0; // price of one cat
		double birdPrice = 15.0; // price of one bird
		double price = 0; // total price of sale
		final double TAX = 0.05;
		
		
		System.out.print("What is your name? "); // prompts user to type name
		String name = scanWords.nextLine();  // declare name variable and stores input
		
		System.out.println("\nWelcome" + " " + name + " " + "to Esther's PET STORE!"); // greets user
		
		System.out.println("\nWhat would you like to buy?\n"
				+ "0. Exit\n"
				+ "1. Dog\n" 
				+ "2. Cat\n" 
				+ "3. Bird");
		// prompts the user to choose which one they are going to buy in the pet store
		
		int itemNum = scanNums.nextInt(); // declares itemNum variable and stores input 
		
		while(itemNum != 0) {
			 
		System.out.println("How many would you like? "); // prompts the user to enter how many items they would like
		
		int qty = scanNums.nextInt(); // stores what the next input will be
		
		if (itemNum == 1) {
			price =  dogPrice * qty + price; // computes how much the price will be if user chooses dog
		}
		else if (itemNum == 2) {
			price += catPrice * qty; // computes how much the price will be if user chooses cat
		}
		else if (itemNum == 3) {
			price += birdPrice * qty; // computes how much the price will be if user chooses bird
		}
		else {
			System.out.println("We're sorry.  We do not provide that."); // what will be printed out into the console if the user enters a digit that is not 1 or 2 or 3

	}
		
		System.out.println("\nWhat would you like to buy?\n"
				+ "0. Exit\n"
				+ "1. Dog\n" 
				+ "2. Cat\n" 
				+ "3. Bird");
		// prompts the user to choose which one they are going to buy in the pet store
		
		itemNum = scanNums.nextInt(); // declares itemNum variable and stores input 
		
		}// END WHILE
		
		System.out.println("Your subtotal is" + " " + price + " " + "CAD" + "."); // prints out the price into the console
		System.out.println("Tax is " + TAX * price + ".");
		double totalPrice = price + TAX + price;
		System.out.println("Your total with tax is " + totalPrice + ".");
		System.out.println("We'll see you soon " + name + "!"); // goodbyes
		System.out.println("Thank you for shopping in Esther's PeT StoRe!  Take care.  Bye!"); 
		
	}// end main
	}// end class 
