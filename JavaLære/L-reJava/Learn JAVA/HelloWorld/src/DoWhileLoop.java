import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		String passord = "ABC123";
		Scanner scanner = new Scanner(System.in);
		String gjett;
		
		do 
		{
			System.out.println("Gjett Passordet!");
			gjett = scanner.nextLine();
		}while(!gjett.equals(passord));
		
		System.out.println("Du Kom inn");
		scanner.close();
		
		
				
	}

}
