import java.util.Scanner; // Importing Scanner Package/Class

public class SomeScanningFun {

	public static void main(String[] args ) {
		System.out.println("Hva heter du?");
	
	try (// type Identifier = new type(); | Syntax 
	Scanner scanningfun = new Scanner(System.in)) {
		String name = scanningfun.nextLine(); // Not a static, Because we have to make a new NEW version
		
		// THIS WOULD BE THE STATIC VERSION 
		// Scanner.nextLine(); with capital, because then we would calling it directly from the Scanner blueprint 
		
		System.out.println("Hei " + name);
	}
	
	
	}	
	
}
