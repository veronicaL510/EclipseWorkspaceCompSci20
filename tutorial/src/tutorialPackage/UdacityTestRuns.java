package tutorialPackage;

import java.awt.Rectangle;

public class UdacityTestRuns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String river = "Mississippi";
		System.out.println(river.replace("ississppi", "our").length());
		
		Rectangle box = new Rectangle (50, 100, 20, 30);
		Rectangle box2 = box;
		box2.translate(15, 25);
		System.out.println(box.getY());
		System.out.println(box2.getY());
	}

}
