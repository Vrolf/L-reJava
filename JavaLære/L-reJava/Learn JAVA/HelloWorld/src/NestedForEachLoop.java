import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedForEachLoop {

	public static void main(String[] args) {

		List<List<Integer>> allekarakterer = new ArrayList<List<Integer>>();
				allekarakterer.add(Arrays.asList(1,3,4,5,6));
				allekarakterer.add(Arrays.asList(3,4,5,6,6));
				allekarakterer.add(Arrays.asList(1,3,4,3,5));
 		
				for(List<Integer> karakterer : allekarakterer) {
					for(List<Integer> karakterer1 : allekarakterer) {
						System.out.println(karakterer1 +" ");
						
					}
					
					System.out.println();
					
				}
		
	}

}
