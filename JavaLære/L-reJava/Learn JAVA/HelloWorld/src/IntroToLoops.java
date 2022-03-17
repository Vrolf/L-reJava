import java.util.Scanner;

public class IntroToLoops {

	public static void main(String[] args) {
	
		/* icu
		 * Intalization 
		 * Compare 
		 * Update 
		 */

		System.out.println("Gjett Passordet");
		String passord = "ABC123";
		Scanner scanner = new Scanner(System.in);
		String gjett = scanner.nextLine();
		
		while(!gjett.toLowerCase().equals(passord.toLowerCase())) // TO Lower Case allows us to put in the passord with lowercase, and get correct, even if it is origninally ment to be written in CAPITAL letters
		{
			System.out.println("Gjett passoret igjen");
			gjett = scanner.nextLine();
			
		}
		System.out.println("Du hadde Rett!");
		scanner.close(); // SHOULD BE DONE AFTER A SCANNER
	}

}
