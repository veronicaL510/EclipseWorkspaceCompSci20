package LASTSET;

public class Q4 {

	public static int yearsTilOneMillion (double initialBalance) {
		
		int years = 0;
		while (initialBalance <= 1000000) {
			years++;
			initialBalance += initialBalance * 0.05;
		}
		
		return years;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("It will take " + yearsTilOneMillion(100) + " years to get a million dollars.");
	}

}
