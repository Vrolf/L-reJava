
public class NestedWhileLoops {

	public static void main(String[] args) {
		int i = 9;
		while(i >= 0) {
			int k = i;
			while(k >= 0) {
				System.out.print(k + " ");
				k--;
				
			}
			System.out.println();
			i--;
		}
		
	}
}
// You can use break in loops for the loop to stop
// You can use continue in Loops to skip parts of the loop
