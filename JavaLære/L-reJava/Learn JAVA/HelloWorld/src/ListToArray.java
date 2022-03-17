import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> allekarakterer = Arrays.asList(5,3,4,5,6);
		int[] karakterer = new int[allekarakterer.size()];
		
		for(int i = 0; i < allekarakterer.size(); i++) {
			karakterer[i] = allekarakterer.get(i);
			
		}
		System.out.println(Arrays.toString(karakterer));
		
	}

}
