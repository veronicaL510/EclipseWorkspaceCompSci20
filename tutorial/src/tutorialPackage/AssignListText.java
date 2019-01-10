package tutorialPackage;
import java.util.ArrayList;
public class AssignListText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> listOfInts = new ArrayList<>();
		//useful methods of ArrayList
		
		listOfInts.add(98); //adding to ArrayList
		listOfInts.add(55);
		listOfInts.add(1, 80); // inserts to index 1 in this case
		listOfInts.remove(0);// remove item at first item
		listOfInts.get(0); //returns item at index 0
		listOfInts.size(); // returns size of ArrayList
		
		//print arraylist
		listOfInts.add(98);
		listOfInts.add(24);
		
		for (int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		listOfInts.remove(listOfInts.size()-1); // remove last element
		// print new arrayList 
		for (int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
		System.out.println(listOfInts.indexOf(98));
		System.out.println(listOfInts.indexOf(99));
			
	}

}
