package tutorialPackage;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nameArray = {"esther", "roni", "nya", "chris", "france", "scott", "mr truong"};
		int[] gradesArray = new int[nameArray.length];

		int avg = 0;
		
		for (int i = 0; i < nameArray.length; i++) { // print arrays
			System.out.println("Name: " + nameArray [i] + "Grade: " + gradesArray[i]);
		}
		Random r = new Random(); // create random object
		
		for (int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = r.nextInt(101);
		}
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray [i] + "Grade: " + gradesArray[i]);
		}
		gradesArray[5] = 85; // update index 5
		
		for (int i = 0; i < nameArray.length; i++) { // print arrays
			System.out.println("Name: " + nameArray [i] + "Grade: " + gradesArray[i]);
		}
		for (int i = 0; i < nameArray.length; i++) { // print arrays
			avg += gradesArray[i]; // adding the grades
		}
		avg = avg/gradesArray.length; // dividing by total number of grades
		System.out.println("Class average is " + avg); // print the average
	}

}
