import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Hva Heter Du?");
		
		Scanner scanner = new Scanner(System.in);
		String navn = scanner.nextLine();
		
		switch(navn) // the switch statements are more used with single options
		{
		case "Victor":
			System.out.println("Velkommen Til Java Programmering");
			break;
			
		case "Johan":
		case "Rolf":
			System.out.println("Du er ikke velkommen");
			break; 
			default: 
				System.out.println("Prøv Senere");
				break;
		}
		
	}
	
	
	
}
