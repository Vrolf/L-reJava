import java.util.Arrays;
import java.util.Scanner;

public class IntroToArray {

	public static void main(String[] args) {
		
		/*int[] karakterer = {10,10,8,2,4,6,6,1,3,10} ;
		// 0 - 9, this is what we can call on 
		
		System.out.println(karakterer[7]); // This prints out 10.
		
		// Printing Arrays 
		System.out.println(Arrays.toString(karakterer));
		
		int[][] tullball = {{1,1,1,1,1,1,1},{7,7,7,7,7,7}};
		
		System.out.println(Arrays.deepToString(tullball));// Prints out multiple arrays 
		*/
		
		//HOW TO ITTERATE TRUE AN ARRAY 
		
		
		/* int[] it = new int[20];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			int x = input.nextInt();			// THIS CODE lets me put in different values of the array up to 20 and then prints it out
			it[i] = x; 
		}
		
		System.out.println(Arrays.toString(it));
		*/
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] test = new int [size];
												// This code lets me first write in how long the Array should be, then i can write the different values of the array. And when finished, it will will print it out.
		for(int i = 0; i < size; i++) {
			int x = input.nextInt();
			test[i] = x;
		}
		System.out.println(Arrays.toString(test));
		
		
	}

}
