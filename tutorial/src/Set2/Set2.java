package Set2;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double balance = 0;
		balance = balance + 20; // Add quarter 1 profits (thousands)
		balance = balance - 25; // Subtract quarter 1 expenses (thousands)
		balance = balance + 30; // Add quarter 2 profits (thousands)
		balance = balance - 25; // Subtract quarter 1 expenses (thousands)
		
		if (balance < 0) {
			System.out.println ("We're in the red!"); // prints out "We're in the red!" if statement is true
		} else if (balance > 0) {
			System.out.println("We made a profit!"); // prints out "We made a profit!" if statement is true 
		} else { 
			System.out.println("We broke even."); // prints out "We broke even." if statement is true
		}
		
// q1 is C. The output is "We broke even."
		
		
		
		System.out.println(" ");
		
		
		
		int dogs = 1; // sets value 1 to dogs
		int cats = 2; // sets value 2 to cats 
		
		if (dogs > 0 && cats == 0) {
			if (dogs >1) {
				System.out.println("Dog lover"); // prints out "Dog lover" if statement is true
			} else {
				System.out.println("Dog person"); // prints out "Dog person" if statement is true
			}
		} else if (cats > 0 && dogs == 0) {
			if (cats > 1) {
				System.out.println("Cat lover"); // prints out "Cat lover" if statement is true
			} else {
				System.out.println("Cat person"); // prints out "Cat person" if statement is true
			}
			System.out.println("Meow!");
		} else if (cats > 0 && dogs > 0) {
			if (dogs > cats) {
				System.out.println("I guess you like dogs more."); // prints out "I guess you like dogs more." if statement is true
			} else if (dogs == cats) {
				System.out.println("I guess you like both equally."); // prints out "I guess you like both equally." if statement is true
			} else {
				System.out.println("I guess you like cats more."); // prints out "I guess you like cats more." if statement is true
			}
		} else {
			System.out.println("What, don't you like pets?"); // prints out "What, don't you like pets?" if statement is true
		}
		
// q2 output is "I guess you like cats more."
		
		
		
		System.out.println(" ");
		
		
		
		boolean canSeePlayer = true; // sets canSeePlayer to true
		boolean playerPowereduP = true; // sets playerPowereduP to true
		
		if (canSeePlayer) {
			if (playerPowereduP) {
				System.out.println("Run away!"); // prints out "Run away!" if statement is true
			} else {
				System.out.println("Attack!"); // prints out "Attack!" if statement is true
			}
		} else { 
			System.out.println("Wander."); // prints out "Wander." if statement is true
		}
				
// q3 prints out "Run away!"
		
		
		
		System.out.println(" ");
		
		
		
		boolean isSnowing = false; // sets isSnowing to false
		boolean isRaining = true; // sets isRaining to true
		double temperature = 60.0; // sets temperature to 60.0
		
		if (isSnowing == true || isRaining == true || temperature < 50.0) {
				System.out.println("Let's stay home."); // prints out "Let's stay home." if statement is true
		} else {
			System.out.println("Let's go out!"); // prints out "Let's go out." if statement is true
				
			}
		
// q4 prints out "Let's stay home."
		
		
		
		System.out.println(" ");
		
		
		
		int time = 18; // sets time to 18
		
		if (time >= 5 && time < 12) {
			System.out.println("Morning."); } // prints out "Morning." if statement is true
		if (time >= 12 && time < 20) 
			System.out.println("Daytime."); // prints out "Daytime." if statement is true
		else  
			System.out.println("Night.");  // prints out "Night." if statement is true

// q5 prints out "Daytime."



		System.out.println(" ");
		
		
		
		int dayOfTheWeek = 5; // sets 5 to dayOfTheWeek
		boolean holiday = false; // sets false to holiday

		if (holiday || dayOfTheWeek == 6 || dayOfTheWeek == 7) {
				System.out.println("Sleep in!"); // prints out "Sleep in!" if statement is true
			} else {
				System.out.println("Wake up at 7:00."); } // prints out "Wake up at 7:00." if statement is true
		
// q6 prints out "Wake up at 7:00."
		
		
		
		System.out.println(" ");
		
		
		
		double playbackPosition = 120; // sets playbackPosition to 120
		boolean rewinding = true; // sets rewinding to true
		
		if (rewinding) {
			double rewindAmount = 0.1;
		
		playbackPosition = playbackPosition - rewindAmount;
		
		System.out.println(playbackPosition);
		
// q7 prints out "119.9"
		
}}}
			
		
		
		
		
		
	
	

	
		
			
		
				
		
		
		
		
		
		
			
		
		
		
		
			
		
		
	


