package tutorialPackage;
import java.util.Random;
import java.util.Scanner;
public class TirePressure {

	public static boolean tirePressureCheck(int r1, int r2, int p) {
		int range1 = r1; // not necessary
		
		if (p >= r1 && p <= r2) {
			//System.out.print("Pressure good.");
			return true;
		}
		else {
			//System.out.println("No good.");
			return false; 
		}
	} // end tirePressureCheck
	
	public static void main(String[] args) {
		Random randy = new Random ();
		int randNum = randy.nextInt(10) + 30;
		
		tirePressureCheck(30, 35, 22); // calling method
		System.out.println("Pressure is good: " + tirePressureCheck(30, 35, 39));
		
		if (tirePressureCheck(30, 35, 39) == true) {
			System.out.println("Good");
			
			// end if (tirePressureCheck)
		}
 
	} //end main 

}
