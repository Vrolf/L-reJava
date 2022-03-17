
public class NestedForLoops {

	public static void main(String[] args) {

		for(int i = 25; i >= 0; i--) {
			for(int v = i; v >= 0; v--) {
				System.out.print(v + " "); // Triangle Design
			}
			System.out.println();
		}
		
	}

}
