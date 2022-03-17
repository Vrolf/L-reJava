import java.util.ArrayList;
import java.util.List;

public class ArrayListerino {

	public static void main(String[] args) {
		
		List<Integer> karakterer = new ArrayList<Integer>();
		karakterer.add(10);
		karakterer.add(1);
		karakterer.add(7);
		
		karakterer.clear(); // Fjerner/clerer alt av innhold i arraylisten
		
		System.out.println(karakterer.contains(10)); // Ser om den inneholder 10, nå vil den returnere false. 
		
	}
	
	
}
