
public class Assign2Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {"Roni", "Yna", "Ann", "Jerm", "Nie", "Gem"}; // string array that stores the names of six people
		int [] gradeNum = {11, 11, 12, 12, 12, 12}; // array that stores what grade people they're on 
		int [] exam1 = {7 , 29, 41, 99, 100, 77}; // int array that stores marks out of 100
		int [] exam2 = {60, 77, 99, 88, 33, 5}; // int array that stores marks out of 100
		int [] exam3 = {40, 89, 6, 5, 33, 70}; // int array that stores marks out of 100
		
		for (int i = 0; i < 1; i++) { // printing all data for just the first person
			System.out.println("Name: " + name[i] + " \tGrade: " + gradeNum [i] + " \tExam 1: " + exam1[i] + " \tExam 2: " + exam2[i] + " \tExam 3: " + exam3[i]);
		}
		
		System.out.println();
		
		for (int i = 5; i < 6; i++) { // printing all data for the last person
			System.out.println("Name: " + name[i] + " \tGrade: " + gradeNum [i] + " \tExam 1: " + exam1[i] + " \tExam 2: " + exam2[i] + " \tExam 3: " + exam3[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) { // printing all the names of the students
			System.out.println("One of my students is " + name[i] + ".");
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) { // printing all the data of each person
			System.out.println(name[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) { // printing all the data of each person but numbered
			System.out.println((i + 1) + " " + name[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) { // printing the average mark of each person
			System.out.println("The average exam marks of " + name [i] + " is " + ((exam1[i] + exam2[i] + exam3[i]) / 3) + ".");
		}
		
		System.out.println();
		
		for (int i = 0; i < exam3.length; i++) { // printing the name of whoever got a mark higher than 79 in the first exam
			if (exam3[i] > 79) {
				System.out.println(name [i] + " got greater than 79 in the third exam!");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < exam1.length; i++) { // whoever got a mark less than 50 in the first exam, their mark will change to 40
			if (exam1[i] < 50) {
				exam1[i] = 40;
			
			System.out.println("Since " + name[i] + " got a mark less than 50, " + name[i] + "'s grade will change to a 40.");
			}
			
		System.out.println("Name: " + name[i] + " \tGrade: " + gradeNum [i] + " \tExam 1: " + exam1[i] + " \tExam 2: " + exam2[i] + " \tExam 3: " + exam3[i]);
		System.out.println();
		}
	}

}



























