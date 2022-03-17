import java.util.Scanner;

public class MoreStringMethods {
	
	public static void main(String[] args) {
		
		String Reklame = "Kom og lær deg Java Programmering, bare 200kr i dag!";
		System.out.println(Reklame.toUpperCase());
		System.out.println(Reklame.toLowerCase());
		System.out.println(Reklame.strip()); // Removes blank space 
		System.out.println(Reklame.substring(0, 10));// Henter ut bare det du vil av strengen altså "KOM OG LÆR"
		System.out.println(Reklame.repeat(200));// Repeats the String 
		System.out.println(Reklame.equals("Er Java Kjedelig?"));// viser om strengen har dette i seg, altså false
		
		
		// Small password System
		String Passord = "ABC123";
		System.out.println("Hva er Passordet?");
		
		// Input
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(Passord.equals(guess));
		
		
		
		
	}

}
