import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class DSA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrays (English and Spanish words)
				String[] wordEnglish = {"apple", "bird", "cake", "dog", "elephant", "falcon", "gouda", "hell", "I", "joke", "kale", "land", "mother", "normal", "orphan", "pancake", "question", "request", "station", "tacos", "underline", "vacation", "when", "xylophone", "young", "zealous"};
				String[] wordSpanish = {"manzana", "pájaro", "pastel", "perro", "elefante", "halcón", "Gouda", "infierno", "yo", "broma","col rizada", "tierra", "madre", "normal", "\r\n" + 
						"huérfano", "crepe", "pregunta", "solicitud", "estación", "tacos", "subrayar", "\r\n" + 
								"vacaciones", "cuando", "xilófono", "joven", "celoso" };
				
				// converts to arraylist 
				ArrayList<String> wordEng = new ArrayList<String>(Arrays.asList(wordEnglish));
				ArrayList<String> wordSpan = new ArrayList<String>(Arrays.asList(wordSpanish));
				
				boolean flag = true;
				
				// introduce user to translator 
				System.out.println("Hi there! Welcome to our English-Spanish translator!");
				
				while(flag = true) 
					
				{
					// asks the user what they want to do, prompts them if they want to translate or quit
					System.out.println("\nWhat are you up to doing? Choose..."
							+ "\n1. Translate something from English to Spanish "
							+ "\n2. Quit translator "
						  );
					
					// will be used to scan 	
					Scanner scanNums = new Scanner(System.in);
					
					// stores choice and scans
					int choice = scanNums.nextInt();
					
					// check if user wants to continue translating or quit 
					if(choice == 1) {
						// continue loop
						flag = true;
					}
					else if (choice == 2)
					{
						// end loop and program
						System.out.println("See you soon! Hasta pronto! ");
						flag = false;
						return;
					}
					

					// prints words to translate
					System.out.println("Here are your options of words to translate...");
					System.out.println("English: ");
					for(int i = 0; i < wordEnglish.length; i++)
					{
						//print list of options
						System.out.printf("%-1s: %-10s  \n",i + 1, wordEng.get(i));
					}
					
					// prompt user for input
					System.out.println("\nWhat word do you want translated?  Type the number.");
					
					// store the number
					choice = scanNums.nextInt();
					
					// print translation 
					System.out.println(" ");
					System.out.println("You chose" + " '" + wordEng.get(choice - 1) + "'.");
					System.out.println("The Espanol translation is" + " '" + wordSpan.get(choice - 1) + "'.");
					
				}
				
				return;
			}

		}


