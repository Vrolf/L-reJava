
public class StringMethods {
	
	public static void main(String[] args) {
		String x = "Jeg l�rer Java Progammering";
		System.out.println(x.charAt(5)); // Printer ut hvilken bokstav som er den femte alts� � 
		System.out.println(x.concat(" Og det er morro!")); // Legger til denne strengen p� den andre strengen
		System.out.println(x.contains("Java")); // Gir en boolean om "JAVA" finnes i strengen eller ikke 
		System.out.println(x.indexOf("Jeg", x.indexOf("Jeg") + 1)); // Hvor stengen starter
		System.out.println(x.lastIndexOf("Programmering"));
	}
	

}
