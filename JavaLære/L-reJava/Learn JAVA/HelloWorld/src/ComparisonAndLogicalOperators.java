import java.util.Scanner;

public class ComparisonAndLogicalOperators {

	public static void main(String[] args) {
	System.out.println("Hvor gammel er du?");
	
	
	Scanner scanner = new Scanner(System.in);
	int age = Integer.parseInt(scanner.nextLine());
	
	System.out.println("Katter Eller Hunder?");
	String dyr = scanner.nextLine();
	
	if(age > 12 && dyr.equals("Katter"))
	{
		System.out.println("Welcome!");
	}
	
	}
/* Comparison Operators
 * == Equality (equal to)
 * Innequality ( not equal to)
 * < less then 
 * > greater then 
 * <= Less then or equal 
 * >= Greater or equal 
 */
	
/* Locical operators
 * && and (both have to be true)
 * || or ( either can be true...or both) 
 * ! not (Inverse the boolean) 
 */
	

	
}
