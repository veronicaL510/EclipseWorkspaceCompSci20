package LASTSET;

public class Q2 {

	public static int factorial (int n) {
		int answer = 1; // declares a variable answer and stores 1 value
		for (int i = 1; i <= n; i++) {
//			1*1*2*3*4*5
			answer = answer * i; // multiplies the answer by i 
		}
		return answer; // returns the answer
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5)); // calls method
	}

}
