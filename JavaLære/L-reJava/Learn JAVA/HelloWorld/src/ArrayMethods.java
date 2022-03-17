import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] grades1 = {1, 2, 3, 4, 5};
		int[] grades2 = {1, 2, 3, 4, 5};
		String[] toS = new String[7];
		
		if(grades1 == grades2) {
			System.out.println("equal");
			
		}
		if(grades1.equals(grades2)) {
			System.out.println("equals");
		}
		
		System.out.println(grades1 + " " + grades2);
		
		if(Arrays.equals(grades1, grades2)) {
			System.out.println("equals finally");
		}

		Arrays.fill(toS, "Victor"); // Fills the Array "toS" With Victor, can also be used with other datatypes such as int
		
		System.out.println(Arrays.toString(toS));
		
	}

}
