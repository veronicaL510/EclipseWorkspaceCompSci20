package Set3;

public class Set3 {

	public static double absoluteValue (double x) { // this is part of q4
		if ( x < 0 ) {
			return x * -1;
		}
		else {
			return x;
	}
		
	
		
	}
	public static double calculateTip (double price) {
		return price * 0.15; } // returns the price multiplied by 0.15. this is function of q5
	
	
	
	public static String nametagText (String name) {
		return "Hello, my name is " + name + "."; // this is q6. returns the string "Hello, my name is" with the name parameter added to the end.
	}
	
	
	
	public static double fahrenheitToCelcius (double Ftemp) {
		return (Ftemp - 32) * 5 / 9; // this is part of q7.  returns the converted temperature from fahrenheit to celcius
		
	}
	
	
	
	public static void printTemperature (double fTemp) {
		System.out.println("F: " + fTemp + "   " + "C: " + fahrenheitToCelcius(fTemp)); // part of q7.
	}
	
	
	
	public static void main(String[] args) {
		
		
		
// this is q1		public float squareRoot (int x);
	
// q1 is b
		
		
		
// this is q2		public boolean isPrime (int x);
		
// q2 above
		
		
		
// this is q3		public getAccountBalanace (long accountNumber);
		
// q3 answer is A because it does not have a return type
		
		
		
	System.out.println(absoluteValue(-3)); // prints out q4. prints out 3.0
		
	System.out.println(calculateTip(20)); // prints out q5. prints out 3.0
		
	System.out.println(nametagText("Roni")); // prints out q6. prints out "Hello, my name is Roni."
		
	System.out.println(fahrenheitToCelcius(300)); // prints out part of q7. prints out 148.88888888888889 into the console
	
	printTemperature(300); // calling method (for q7)
	
	
	
	
	
		}
	}


