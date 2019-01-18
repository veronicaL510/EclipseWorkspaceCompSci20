package C_C;
import java.util.Scanner;

public class Caesar_Cipher {

	// Scanners for statements and numbers
	static Scanner scanstatements = new Scanner(System.in);
	static Scanner scannums = new Scanner(System.in);
	
	public static String encrypt(String encryptedText, int shiftValue)
	{
	
		String output = "";
		
		// changes letter to a char value and shifts values of char to encrypt and returns it to string
		for(int i = 0; i < encryptedText.length(); i ++) {
			char encrypted = (char) (encryptedText.charAt(i) + shiftValue); 
			output += String.valueOf(encrypted);
		}
		
		// return the output
		return output;
		
	} 

	public static String decrypt(String encryptedText, int shiftValue)	{
		
		String output = "";
		
		// changes letter to a char value and shifts values of char to decrypt and returns it to string
		for(int i = 0 ; i < encryptedText.length() ; i ++) {
			char dencrypted = (char) (encryptedText.charAt(i) - shiftValue); 
			output += String.valueOf(dencrypted);
		}
		
		// return output
		return output;
	} 
	
	public static void main(String[] args) {
		// asks the user for something to encrypt
		System.out.println("Hey there player!  Type something!  No punctuation please and thanks!  We're going to encrypt it.");
		// store statement in a variable and encrypt it 
		String statement = encrypt(scanstatements.nextLine(),5);
		// print the encrypted statement
		System.out.println("That statement encrypted is '" + statement + "'.");
		
		// decrypt the statement again and store in a variable
		System.out.println("\nLet's decrypt it meaning put it in it's original statement.");
		statement = decrypt(statement,5);
		// print the decrypted statement
		System.out.println("The statement decrypted is '" + statement + "'.");
			
	}

} 


	