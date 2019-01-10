package Stores;
import java.util.Scanner; // imports scanner 

public class Esther_PetStore {

	// the following are global variables
	static double price = 0; // total price of sale
	static final double TAX = 0.05;
	static int totalQty = 0; // accumulator - counter
	static int dogQty = 0; // declares dogQty
	static int catQty = 0; // declares catQty
	static int birdQty = 0; // declares birdQty
	
	public static void menu() {
		Scanner scanWords = new Scanner(System.in); // scanner object to take in words
		Scanner scanNums = new Scanner(System.in); // scanner object to take in numbers
		double dogPrice = 30.0; // price of one dog
		double catPrice = 29.0; // price of one cat
		double birdPrice = 15.0; // price of one bird
	
		int itemNum;
		
		System.out.print("What is your name? "); // prompts user to type name
		String name = scanWords.nextLine();  // declare name variable and stores input
		
		System.out.println("\nWelcome" + " " + name + " " + "to Esther's PET STORE!"); // greets user
		
		do {
		System.out.println("\nWhat would you like to buy?\n"
				+ "0. Exit\n"
				+ "1. Dog\n" 
				+ "2. Cat\n" 
				+ "3. Bird");
		// prompts the user to choose which one they are going to buy in the pet store
		
		itemNum = scanNums.nextInt(); // declares itemNum variable and stores input
			 
		  if(itemNum != 0) // not equal to 0
			System.out.println("How many would you like? "); // prompts the user to enter how many items they would like
		  int qty = scanNums.nextInt(); // stores what the next input will be
			totalQty += qty; 
			
			if (itemNum == 1) {
				price += calcCost(dogPrice, qty); // computes how much the price will be if user chooses dog
				dogQty += qty;
				
			}
			else if (itemNum == 2) {
				price += calcCost(catPrice, qty); // computes how much the price will be if user chooses cat
				catQty += qty;
			}
			else if (itemNum == 3) {
				price += calcCost(birdPrice, qty); // computes how much the price will be if user chooses bird
				birdQty += qty;
			}
			else {
				System.out.println("We're sorry.  We do not provide that."); // what will be printed out into the console if the user enters a digit that is not 1 or 2 or 3
			}
		} while(itemNum != 0);  // END OF DO/ WHILE
		
		printSummary(); 
		
	}// end menu
	
	public static double calcCost(double itemPrice, int qty) {
		return itemPrice * qty;
	} // end calcCost
				
	public static double calcTax(double TAX, double price) {
		return TAX * price;
	} // end calcTax
	
	public static void printSummary() {
		System.out.println("Your total items bought is " + totalQty + "."); // states how many total items are bought
		System.out.println("Your total dogs bought is " + dogQty + ".");
		System.out.println("Your total cats bought is " + catQty + ".");
		System.out.println("Your total birds bought is " + birdQty + ".");
		System.out.println("Your subtotal is" + " " + price + " " + "CAD" + "."); // prints out the price into the console
		System.out.printf("Tax each is %.2f CAD" , calcTax(TAX, price));
		System.out.println(" :)");
		double totalPrice = calcTax(TAX, price) + price;
		System.out.printf("Your total with tax is %.2f \n" , totalPrice + calcTax (TAX, price));
		System.out.println("We'll see you soon!"); // goodbyes
		System.out.println("Thank you for shopping in Esther's PeT StoRe!  Take care.  Bye!");
	} // end printSummary
	
	public static void main(String[] args) {
		menu();
		} // end main
	}

// end class 


