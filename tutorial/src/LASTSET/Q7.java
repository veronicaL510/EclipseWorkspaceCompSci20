package LASTSET;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 3;
		for (int i = 1; i <= rows; i++) {
			String thisRow = "";
			for (int j = 0; j < i; j++) {
				thisRow = thisRow + "t";
			}
			System.out.println(thisRow);
		}
	}

}
