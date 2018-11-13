package tutorialPackage;
import java.util.Scanner;

public class HalloweenMonsters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String [] halloweenMonsters = {"mummy", "frank", "zombie", "vampire", "werewolf", "player"};
		
		System.out.println("Enter player name: ");
		halloweenMonsters[halloweenMonsters.length - 1] = "Player: " + input.nextLine();
		
		int [] coins = new int [halloweenMonsters.length];
		
		// add coins
		for (int i = 0; i < halloweenMonsters.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(halloweenMonsters[i] + " has " + coins[i] + " gold coins.");
		}
		
		String [] abilities = new String [halloweenMonsters.length];
		
		abilities [0] = "TP-ing"; 
		abilities [1] = "brain-eater";
		abilities [2] = "scary";
		abilities [3] = "blood-drinking";
		abilities [4] = "fast-run";
		abilities [5] = "invisibility";
		
		System.out.println();
		
		for (int i = 0; i < halloweenMonsters.length; i++) {
			System.out.println(halloweenMonsters[i] + " has the ability of " + abilities [i]);
		}
		
		int [] hp = new int [halloweenMonsters.length];
		// assign random hp
		
		for (int i = 0; i < halloweenMonsters.length; i++) {
			hp [i] = (int)(Math.random() * 15 + 2);
		}
		
		System.out.println();
		
		// prints out hp
		for (int i = 0; i < halloweenMonsters.length; i++) {
			System.out.println(halloweenMonsters[i] + " has " + hp [i] + " health points.");
		}	
		System.out.println("The " +  halloweenMonsters[2] + " ate a teenager, how "
				+ "many coins did he get?  ");
		// taking in a number from a user input
		coins [2] += input.nextInt(); // adding coins to coins [2]
		input.nextLine(); // get rid of extra enter character
		
		// taking in a string from user input
		System.out.println(halloweenMonsters[2] + " morphs into what? ");// prompt
		halloweenMonsters [2] = input.nextLine();
		
		System.out.println("The monster is a " +  halloweenMonsters[2] + ".");
		

		// to do list
		
		int totalCoins = coins[halloweenMonsters.length - 1];
		int turns = 0;
		//fight fight while player > 0
		while (hp[hp.length-1] > 0) {
			int randomhalloweenMonsters = (int)(Math.random() * halloweenMonsters.length);
			if (randomhalloweenMonsters !=  halloweenMonsters.length-1) {
				// decide whether to hit or be hit
				int hitChance = (int)(Math.random() * 2);
				
				if (hitChance % 2 == 0) { // 
					// subtract random hp if player is hit
					int randomDmg = (int)(Math.random() * 2 + 1);
					hp[ halloweenMonsters.length - 1] -= randomDmg; // subtracting hp
					System.out.println(halloweenMonsters [randomhalloweenMonsters] + " hit you for "
							+ randomDmg + " hp!  And they have " + hp[halloweenMonsters.length - 1] + " left.");
				}
				else { // player does dmg
					System.out.println("Player hits with " + abilities[halloweenMonsters.length - 1] + " " +  halloweenMonsters[randomhalloweenMonsters] + " runs away.  I left " + coins[randomhalloweenMonsters] + " coins."); 
					// collect coins
					totalCoins += coins [randomhalloweenMonsters];
				}
				// track number of turns
				turns++;
			} // end if
			System.out.println();
		} // end while
		
		System.out.println("You run away with " + totalCoins + " coins and lasted " + turns + " turns.");
			
	} // end main

}
