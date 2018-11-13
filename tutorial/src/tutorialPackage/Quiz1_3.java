package tutorialPackage;

public class Quiz1_3 {

	
	
	
	public static int smallest (int x, int y, int z) {
		int smallest = x;
		if(x < y) {
			smallest = x;
			if (x < z) {
				smallest = x;
			}
		}
		if (y < x) {
			smallest = y;
			if (y < z) {
				smallest = y;
			}
		}
		if (z < x) {
			smallest = z;
			if (z < y) {
				smallest = z;
			}
		}
		return smallest;
		
		
		
		
		
	}
	public static int smallest (int x, int y, int z) {
		if (y > x < z); {
			return x;
		}
		if (x > y < z); {
			return y;
		}
		if {
			return z;
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(smallest(3, 4, 9));
	}

}
