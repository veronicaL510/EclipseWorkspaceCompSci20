package Superheroesss;

public class Superhero_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] superheroesArray = {"Superman", "Batman", "Wonderwoman", "T'Chala", "Spiderman"}; // array that holds the names of superheroes
		
		for (int i = 0; i < 1; i++) { 
			System.out.println("First superhero: " + superheroesArray [i]); // prints the first hero that is stored in the array
		}
		
		System.out.println();
		
		for (int i = 4; i < 6; i++) { 
			System.out.println(superheroesArray[superheroesArray.length - 1]); // prints the last hero in my array
		}
		
		System.out.println();
		
		for (int i = 0; i < superheroesArray.length; i++) {
			System.out.println("One of my heroes is " + superheroesArray [i] + "."); // prints all of my superheroes' names
		}
		
		System.out.println();
		
		String[] superpowersArray = {"Strength", "Speed", "Flying", "NightVision", "Reflexes"};  // array that holds the superheroes' superpowers
		Boolean[] isHumanArray = {false, true, true, true, true};  // boolean values inside an array saying if the superhero is human or not
		
		for (int i = 0; i < superpowersArray.length; i++) {  // prints superheroes' names along with their superpowers and if they are human  or not
			System.out.println(i + " Name: " + superheroesArray [i] + "            Power: " + superpowersArray [i] + "            Are they human? " + isHumanArray [i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < isHumanArray.length; i++) { // goes through isHumanAray and changes whoever is non human to no superpowers
			if (isHumanArray[i] == false) {
				superpowersArray[i] = "None";
				}
		System.out.println(i + " Name: " + superheroesArray [i] + "            Power: " + superpowersArray [i] + "            Are they human? " + isHumanArray [i]);
			
		}
		
	} 

}
