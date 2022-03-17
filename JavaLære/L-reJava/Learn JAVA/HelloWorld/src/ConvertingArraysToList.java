import java.util.Arrays;
import java.util.List;

public class ConvertingArraysToList {

	public static void main(String[] args) {
		List<Integer> karakterer = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(Arrays.toString(karakterer.toArray()));
		
		
		//FOR LOOP
		for(int i = 0; i < karakterer.size(); i++) {
			karakterer.set(i, karakterer.get(i) * 2); // Dobler Arrayen
			System.out.println(karakterer.get(i));
		}
		
		// FOR EACH LOOP
		for(int karakter : karakterer) {
			System.out.println(karakter);
		}
		
		
	}

} 
