
public class NestedBlocksIF {

	public static void main(String[] args) {

		boolean additionalLogging = true;
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(i);
			
			if (i == 7) {
				if(additionalLogging == true) {
					System.out.println("We Found 7");
				}
				
			}
			
		}
		
	}

}
