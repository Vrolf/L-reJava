import java.util.Scanner;

public class StringComparisonAndInterning {

	public static void main(String[] args) {
	String Passord = "ABC123";
	System.out.println("Hva er Passordet?");
	
	Scanner scanner = new Scanner(System.in); // Yellow  underline, means that it is not used. Not an error. Just the program telling that it is not being used
	String guess = scanner.nextLine();
	
	System.out.println(Passord.equals(guess)); // WORKS = Returns True on "ABC123"
	
	System.out.println(Passord == guess); // Does not work - returns FALSE
		
	// Password == guess 
	// primitives - this works 
	// objects - this does not work!
	// values of objects is a refrence to the object
	
	String a = new String("hi");// Not going to give true
	String b = new String("hi");// ===11===
	System.out.println(a == b); // This uses classes, so they will not be true, even if they have the same string input
	// However, this will work, if we write 
	// String a = ("hi");
	// String b = ("hi"); 
	// Return true, so this works. 
	
	int x = 10;// Primitive
	int y = 10;// Primitive
	
	System.out.println(x == y); // Going to be true, because it is a primitive. 
	
	}

}
