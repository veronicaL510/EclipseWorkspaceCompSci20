package tutorialPackage;

import java.util.Scanner;

import java.util.Random;

public class Tut1 {
	
	
	/**
	 * it calculates circumference given a radius
	 * @param radius - a double that represents the radius
	 * @return - the circumference
	 */

		public static double circumference(double radius) { // this is called a header or signature
			
			double diameter = 2 * radius;
			double circumference = 2 * Math.PI * radius; 
			
			return circumference;
		}
		
	public static double areaOfRectangle(int l, int w) {
		return l * w;
	
	}
		
	public static void printName() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("yello roni");
		}
		
	}
	
	public static void main(String[] args) {
		int varNum1;
		varNum1 =10;
		
		int varNum2 = 25;
		
		int varNum3;
		
		varNum3= varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName();
		
if(varNum3 > 5) {
	System.out.println("greater");
		}
//else if thingy majidgi
else
	System.out.println("less");


		String inData;
		Scanner scan = new Scanner( System.in );
	
		System.out.println("Enter the data:");
		inData = scan.nextLine();
	
		System.out.println("You entered:" + inData );
		
		int num;
		int square;
		System.out.println("Enter an integer:");
		num = scan.nextInt();
		square = num * num ;  // compute the square
		
		System.out.println("The square of " + num + " is " + square);
	
		
		Random rand = new Random();
		
		int randomNum = rand.nextInt(11) + 5;
		
		System.out.println(randomNum);
		
		
		double r = 4.6;
		double c = circumference(r); // r is the argument
		
		System.out.println("Circumference is: " + c);
		
		int l = 4;
		int w = 10;
		
		System.out.println("Area is: " + areaOfRectangle(l,w));
		
	}//end main

}
