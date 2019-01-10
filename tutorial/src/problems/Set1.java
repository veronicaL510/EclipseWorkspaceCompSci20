package problems;

public class Set1 {

	public static void main(String[] args) {
		
		
		
// q1 is D
		
		
		
		double register = 10.0;         // original value
		register = register + 5;        // customer pays $5
		register = register - 2.5;		// customer receives $2.50 as change 
		register = register + 10;		// customer pays $10
		register = register - 3;		// customer pays $3 as change 
		System.out.println(register);	// prints the value into the console
		
// q2 is B. output is 19.5
		

		
		System.out.println(" ");  		
		
		
		
		int bankBalance;				// defines an integer variable called bankBalance
		bankBalance= 500;				// intializes the value 500 to bankBalnce variable
		bankBalance = bankBalance + 250; // adds 250 from bankBalance value
		bankBalance = bankBalance - 100; // subtracts 100 from bankBalance value
		System.out.println(bankBalance); // prints the final value of bankBlance into console
	
// q3 output is 650
		
		
		
		System.out.println(" ");
		
		
		
		System.out.println(2.0 * (5 / 2));; 

// q4 is B. output is 4.0
	
	
		
		System.out.println(" ");
		
		
		
		int day;
		day = 4; 						// stores the value 4 to the variable day 
		System.out.println(day);		// prints the value of day into the console
		System.out.println(" ");
		String month;
		month = "march";				// stores the string 'march' in the variable month
		System.out.println(month);		// prints the value of month into the console
		
// q5 above output is 4 and then march
		
		
		
		System.out.println(" ");
		
		
		
		String firstName;
		firstName = "Roni";							// stores "Roni" into firstName variable
		String lastName;							
		lastName = "Lopez";							// stores "Lopez" into lastName variable
		String fullName;
		fullName = firstName + " " + lastName;		// stores the firstName and lastName into fullName
		System.out.println(fullName);				// prints fullName into the console
		System.out.println(" ");
		System.out.println(fullName.length());		// prints out the number of letters in my name
		System.out.println(" ");
		
		int length;
		length = (fullName.length());				// stores the number of letters in my name in length variable
		
		System.out.println("Hello, my name is" + " " + fullName + "." + " " + "There are" + " " + length + " " + "letters in my name." );
		
// q6 is above. output is my full name. then the number 10. then the sentence that says "Hello, my name is Roni Lopez. There are 10 letters in my name."
		 
		
		
		
		System.out.println(" ");
		
		
		
		double fahrenheit;
		
		fahrenheit = 29; 				// stores the number 29 into fahrenheit
		
		double celcius;					
		
		celcius = fahrenheit - ((32 * 5) / 9);	// converting fahrenheit to celcius
	
		System.out.println("The final value of celcius is" + " " + celcius + ".");
	
// q7 is above. the output is "The final value of celcius is 12.0."
		

		
	}
	
	

}
