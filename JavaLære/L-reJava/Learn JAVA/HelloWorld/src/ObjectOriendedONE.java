import java.util.ArrayList;
import java.util.List;

public class ObjectOriendedONE {

	public static void main(String[] args) {
	
	Student s = new Student();
	s.major = "JAVA DESIGN";
	s.firstName = "Victor";
	s.lastName = "Rolf";
	s.SayHello();
	
	// UserOne u = new UserOne(); 
	

	List<Talk> thingsThatTalk = new ArrayList<Talk>();
	thingsThatTalk.add(s);
	
	//Polymorphism
	Teacher t = new Teacher();
	t.firstName = "teach";
	t.lastName = "Lærer";
	
	List<UserOne>  users = new ArrayList<UserOne>(); 
	users.add(s); users.add(t);
	
	for(UserOne u : users) {
		u.SayHello();
		
	}
	
	s.status = s.status.probation;

	System.out.println(s.status);
	
	switch(s.status) {
	
		case probation; 
	
		System.out.println("OUCH");
	
		break; 
	}
	
	}

}
