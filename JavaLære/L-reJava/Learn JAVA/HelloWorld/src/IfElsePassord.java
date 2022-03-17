import java.util.Scanner;

public class IfElsePassord {
	
	public static void main(String[] args) {
		
		String Passord = "ABC123";
		System.out.println("Hva er Passordet?");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		System.out.println(Passord.equals(guess));
		
		// IF STATEMENTS
		// if (expression) 
		//{
		// 		code to execute(if true)
		//}
		
		if(Passord.equals(guess))
		{
			System.out.println("Det var Riktig!");
		}else if ("Passord?".equals(guess));
		{
			System.out.println("Du fikk det andre passordet rett, men ikke det du skal bruke!");
			
		} else 
		{
			System.out.println("Det var feil");
		}
	}

}
