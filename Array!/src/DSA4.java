
public class DSA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = {"bob", "jet", "nick", "egg", "jerm", "roni", "jason", "henry", "jj", "nget"};
		
		double [] raisedMoney = {200, 201.25, 79, 3.30, 700, 400, 600, 999.6, 444, 333};
		
		boolean[] returnedForm = {true, false, true, false, true, false, true, false, true, false};
		
		// step 1
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names [i] + "       $ " + raisedMoney[i] + "          Form: " + returnedForm[i] );
		}
		
		System.out.println();
		
		// step 2
		double totalAmt = 0; // stores total amount raised
		for (int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i]; // add each index to total amount 
		}
		
		double avgRaised = totalAmt / names.length; // calculates average amount raised 
		
		int bigMoneyCount = 0; // tracks how many people earned over 200 dollars
		
		for (int i = 0; i < raisedMoney.length; i++) {
			// searching for > 200
			// counting number of people over $200
			if (raisedMoney[i] > 200 ) {
				System.out.println(names[i] + " raised " + raisedMoney[i]);
				bigMoneyCount++; // add one to bigMoneyCount
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < returnedForm.length; i++) {
			// searching for people who have not returned their form
			if(returnedForm[i] == false) {
				System.out.println(names[i] + " has not returned form.");
			}
		}
		
		System.out.println();
		System.out.println("Total amount raised is " + totalAmt);
		System.out.println("Average amount raised is " + avgRaised);
		
		double lowestAmt; // declare var for item tracked 
		lowestAmt = raisedMoney[0]; // assume first index is item searched for
		String person;
		int nameIndex = 0; // tracks index of the person with the lowest amount raised 
		for (int i = 0; i < raisedMoney.length; i++) { // find lowest amount raised
			if (raisedMoney[i] < lowestAmt) {
				lowestAmt = raisedMoney[i]; // set new lowest value
				nameIndex = 1;
				person = names[i];
				
			}
		}
		
		System.out.println();
		System.out.println("Lowest amount raised is " + lowestAmt + " by " +  names[nameIndex]);

	}

}
