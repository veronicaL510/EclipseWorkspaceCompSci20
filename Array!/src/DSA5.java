import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class DSA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrays (English and Spanish words)
				String[] wordEnglish = {"robin","treat","trick","search","circle","whole","five", "pizza","cheese","spaghetti","monkey","horse","dog","cat","juice"};
				String[] wordSpanish = {"robin", "traiter", "tour", "chercher", "cercle", "entier", "cinq", "pizza", "fromage", "spaghetti","singe", "cheval", "chien", "chat", "jus"};
				
				//convert to arraylist for easier use
				ArrayList<String> wordEng = new ArrayList<String>(Arrays.asList(wordEnglish));
				ArrayList<String> wordSpan = new ArrayList<String>(Arrays.asList(wordSpanish));
				
				// introduce them to translator and set flag to make program loop
				boolean flag = true;
				System.out.println("Welcome to the english french translator");
				
				while(flag = true) 
				{
					System.out.println("\nwhat would you like to do next, select number..."
							+ "\n1. Translate something "
							+ "\n2. Quit "
						  );

					Scanner scanNums = new Scanner(System.in);
					// store choice for later
					int choice = scanNums.nextInt();
					
					// check if they want to exit the loop or not 
					if(choice == 1) {
						// continue loop
						flag = true;
					}
					else if (choice == 2)
					{
						// end loop and program
						System.out.println("Bye!");
						flag = false;
						return;
					}
					

					// iterate through and print each word in english and french
					System.out.println("Here are your words...");
					System.out.println("English: 	French:");
					for(int i = 0; i < wordEnglish.length; i ++)
					{
						//print list of options
						System.out.printf("%-1s: %-10s %-15s \n",i + 1, wordEng.get(i), wordSpan.get(i));
					}
					
					// prompt user for input
					System.out.println("\nwhat do you want translated? please input the number below");
					
					// store that input
					choice = scanNums.nextInt();
					
					//print translation 
					System.out.println("You selected " + wordEng.get(choice - 1));
					System.out.println("its french translation is " + wordSpan.get(choice - 1));
					
				}
				
				return;
			}

		}


