package tutorialPackage;

public class Quiz1 {

	
	public static double smallest (double x, double y, double z) {
		double min = x; // VARIABLE DECLARED
		if (x > y) { // COMPARES X AND Y
			min = y; // IF TRUE, Y IS MIN
		}
		if (min > z) { // COMAPRES UPDATED MIN AND Z
			min = z; // IF TRUE, Z IS MIN
		}
		if (min > x) { // COMPARES UPDATED MIN AND X
			min = x; // IF TRUE, X IS MIN
		}
			return min; // RETURNS THE MIN VALUE
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(smallest(3, 5, 8)); // CALLS FUNCTION
		System.out.println(smallest(3, -5, 8)); // CALLS FUNCTION
		System.out.println(smallest(3, 5, -8)); // CALLS FUNCTION
	}

}


