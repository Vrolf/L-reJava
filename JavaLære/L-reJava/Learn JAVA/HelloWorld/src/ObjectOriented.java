import java.util.ArrayList;
import java.util.List;

public class ObjectOriented {

	public static void main(String[] args) {
		
		String[] firstNames = {"Victor","Johan","Rolf","Peter"};
		String[] lastNames = {"ROlf", "Johannesen", "Rolf", "Kristiansen"};
		
		List<User> brukere = new ArrayList<User>();
		
		for(int i = 0; i < firstNames.length; i++) {
			User u = new User();
			u.SetFirstname(firstNames[i]);
			u.setLastName(lastNames[i]);
			brukere.add(u);
		}
		
		for(User u : brukere) {
			System.out.println(u.getFullname());
		}
		 

		/*User bruker = new User(); 
		bruker.SetFirstname("Victor");
		bruker.setLastName("Rolf");
		
		User sensei = new User() ;
			sensei.SetFirstname("Caleb");
			sensei.setLastName ("Curry");
			
			
		User test = new User();
		test.SetFirstname("Test");
		test.setLastName("Testing");
		
		
		
		//bruker.output(2);
		
		String output1 = bruker.melding();
		 System.out.println(output1);
		
		 System.out.println(bruker.getFristName());
		 System.out.println(bruker.getLastName());
		 
		 System.out.println(bruker.getFristName() + " " + bruker.getLastName());
		 
		 System.out.println(bruker.getFullname());
		 
		 List<User> brukere = new ArrayList<User>();
		 brukere.add(bruker);
		 brukere.add(sensei);
		 brukere.add(test);
		 
		 System.out.println(brukere.get(2).getFullname());
	*/	 
		
		ObjectOriented m = new ObjectOriented(); // Les mere på denne, og hvorfor den gjøres slik 
		m.printUser(brukere.get(0));  
		
		
	}
	
	public void printUser(User u) { // Det gjelder også denne 
		System.out.println(u.getFullname());
	}
	
	
}


// 