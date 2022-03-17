
public class User {
	
	private String firstName;
	private String lastName;


	
	//public void output(int ganger) {
		//for(int i = 0; i < ganger; i++) {
			//System.out.println(firstName + " " + lastName);	
		//}
		
		public String melding() {
			return "Hei, Jeg Heter " + firstName + " " + lastName;
		}
		
		public String getFristName() { // Getter Method 
			return firstName; 
		}
		
		public void SetFirstname(String FN) { // Setter Method
			firstName = FN;
		}
		
		public String getLastName() { // SETTER 
			return  lastName;
			
		}
		
		public void setLastName(String LN) { // GETTER
			lastName = LN;
		}
		
		public String getFullname() { // Getter method for full name 
			return getFristName() + " " + getLastName(); // Safer to write "getFullName" either than "fullName" because it does not ivaluate rules that have been set. 
		}
		
	}

