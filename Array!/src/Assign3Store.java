import java.util.Scanner;

public class Assign3Store {

	Scanner scanNums = new Scanner(System.in); // scanner object to take in numbers
	
	// global variables 
	public static String product [] = {"Dog", "Cat", "Bird", "Fish", "Snake", "Teacup pig", "Baby elephant", "Guinea pig", "Rabbit", "Chicken"};
	public static double prices [] = {1000.00, 500.00, 50.00, 30.00, 50.00, 150.00, 20000.00, 30.00, 40.00, 30.00};
	public static int itemNum []  = new int [10];
	public static double discount = 1.00;
	public static double totalPrice = 0;
	
	public static void listOfProducts() {
		for (int i = 0; i < product.length; i++) {
		System.out.println(i + ". " + product[i] + " and it costs " + prices[i] + " CAD.                                                                    ");
	}
	
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 0;
		
		do {
			System.out.println("Hi there! What would you like to buy?");
			System.out.println(" ");
			listOfProducts();
			System.out.println("Type the number of the product you would like to get.");
			Scanner choice = new Scanner(System.in);
			int wantedProduct = choice.nextInt();
			
			if (10 > wantedProduct && wantedProduct > 0) {
				System.out.println("How many are you going to get?");
				Scanner choice2 = new Scanner (System.in);
				int numberOfProduct = choice2.nextInt();
				itemNum [wantedProduct] = numberOfProduct;
				double finalAmount = itemNum [wantedProduct] * prices [wantedProduct] * discount;
				System.out.println(itemNum [wantedProduct] + " " + product[wantedProduct] + " would be $" + finalAmount + ".");
				
			}
				
			else if (wantedProduct == -1) {
				System.out.println("CONGRATS YOU GOT A 10% DISCOUNT!");
				discount = 0.90;
				
			}
			
			else {
				System.out.println("Sorry about that but I don't think we have that.");
				
			}
			
			System.out.println("Are you looking for anything else? Type the corresponding number.");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			Scanner choice3 = new Scanner (System.in);
			int question = choice3.nextInt();
			
			if (question == 1) {
				
			}
			
			else if (question == 2) {
				y = 1;
			}
			
			else {
				System.out.println("Let's go anyway :) ");
			}
			
		} while (y == 0);
		
		System.out.println(" ");
		
		for (int i = 0; i < product.length; i++) {
			if (itemNum[i] > 0) {
				double eachPriceTotal = prices[i] * itemNum[i] * discount;
				System.out.println("Product Price Num Bought Total");
				System.out.printf(product[i] + "     " + prices[i] + "     " + itemNum[i] + "     " + eachPriceTotal);
				System.out.println("\n_________________________________________");
				System.out.println("Your total is $" + eachPriceTotal + ".  Come back again!");
			}
			
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	