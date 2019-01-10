import java.util.ArrayList;
import java.util.Scanner;

public class DSA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> allSongs = new ArrayList<>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Thank u, next");
		artists.add("Ariana Grande");
		
		allSongs.add("Happier");
		artists.add("Marshmallow");
		
		allSongs.add("Without me");
		artists.add("Halsey");
		
		for (int i = 0; i < allSongs.size();i++) {
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}
		
		System.out.println("1. add to library \n" + 
				"2. delete from library \n" +
				"3. add to party playlist \n" +
				"4. exit" );
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice) {
		 
		case 1:
			input.nextLine(); // gets rid of extra enter character
			System.out.println("Enter song title: ");
			allSongs.add(input.nextLine());
			System.out.println("Enter artist: ");
			artists.add(input.nextLine());
			break;
			
		case 2:
			System.out.println("Enter song number to delete: ");
			int delete = input.nextInt();
			allSongs.remove(delete);
			artists.remove(delete);
			break;
			
		case 3:
			System.out.println("Enter song number to add to partyplaylist: ");
			partyPlaylist.add(allSongs.get(input.nextInt()));
			break;
			
		case 4:
			System.out.println("Byeee");
			flag = false;
			break;
			
		default:
			System.out.println("Invalid option.");
			
		}// end switch
		
	}while (flag);
		for (int i = 0; i < allSongs.size();i++) {
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}
		
	}

}
