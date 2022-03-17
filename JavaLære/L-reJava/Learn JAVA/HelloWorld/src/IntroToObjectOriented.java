
public class IntroToObjectOriented {

	public static void main(String[] args) {

		UsersToObjectOriented user = new UsersToObjectOriented();
		user.firstName = "Victor"; // Setting a property
		user.lastName = "Rolf";
		System.out.println(user.getFullName());	
		
		UsersToObjectOriented age = new UsersToObjectOriented();
		user.age = 20;
		System.out.println(user.getAge());
		
		UsersToObjectOriented birthYear = new UsersToObjectOriented();
		user.birthYear = 2002;
		System.out.println(user.getBirthYear());
		
		UsersToObjectOriented university = new UsersToObjectOriented();
		user.university = "UiA";
		System.out.println(user.getUniversity());
		
		
	}

}
