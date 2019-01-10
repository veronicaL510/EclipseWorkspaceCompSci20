import java.util.Scanner;

public class Assign3Store {

	Scanner scanNums = new Scanner(System.in); // scanner object to take in numbers
	
	// global variables 
	public static String [] product = {"dog", "cat", "bird", "fish", "snake", "teacup pig", "baby elephant", "guinea pig", "rabbit", "chicken"};
	static int [] prices = {1000, 500, 50, 30, 50, 150, 20000, 30, 40, 30};
	static int [] itemNum = {};

	{
		
	for (int i = 0; i < product.length; i++) {
		System.out.println(i + ". " + product[i] + " and it costs " + prices[i] + " CAD.                                                                    ");
	}
	
	int itemNumb;
	int totalQty;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanNums = new Scanner(System.in); // scanner object to take in numbers
		
		
		
		System.out.print("Please enter the number of the product you would like to purchase: "); // prompts user to type name
		itemNumb = scanNums.nextInt(); // declares itemNumb variable and stores input
		
		if(itemNumb != 0) // not equal to 0
			System.out.println("How many would you like? "); // prompts the user to enter how many items they would like
		  int qty = scanNums.nextInt(); // stores what the next input will be
			totalQty += qty; 
			
			if (itemNumb == 1) {
				itemNum = prices[0] * qty; 
				
				
			}
			else if (itemNumb == 2) {
				price += calcCost(catPrice, qty); // computes how much the price will be if user chooses cat
				catQty += qty;
			}
			else if (itemNumb == 3) {
				price += calcCost(birdPrice, qty); // computes how much the price will be if user chooses bird
				birdQty += qty;
			}
			else {
				System.out.println("We're sorry.  We do not provide that."); // what will be printed out into the console if the user enters a digit that is not 1 or 2 or 3
			}
		} while(itemNumb != 0); 
}
		public static double calcCost(double itemPrice, int qty) {
			return itemPrice * qty;
		} // end calcCost
	
	}

}
