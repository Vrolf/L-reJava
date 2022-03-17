import java.util.Arrays;

public class array2D {

	public static void main(String[] args) {
		
		int[][] todArrayer = {
				{1,5,6},
				{1,9,4}, // They can be longer then each other aswell, but then be careful while iterating the array
				{1,3,8}
				
				};
				
		System.out.println(todArrayer [2][2]);
		System.out.println(Arrays.deepToString(todArrayer));
		
		// How to iterate this array and 2D arrays
		
		System.out.println(todArrayer.length);
		System.out.println(todArrayer[1].length);
		
		for(int rad = 0; rad < todArrayer.length; rad++) {
			for(int colum = 0; colum < todArrayer[rad].length; colum++) {
				System.out.println(todArrayer[rad][colum]);
			}
		}
		
		
		}
		

	}


