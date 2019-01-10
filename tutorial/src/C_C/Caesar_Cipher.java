package C_C;
import java.util.Scanner;

public class Caesar_Cipher {

	public static String encrypt (String plainText, int shiftValue) {
		
	}

	public static String decrypt (String encryptedText, int shiftValue) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanWords = new Scanner(System.in); // scanner object to take in words
		
		System.out.print("Hey there player!  Type something!  No punctuation please and thanks!");
		String text = scanWords.nextLine();
		
		System.out.println(encrypt(text, 5));
		System.out.println(decrypt());
		
	}

}

	