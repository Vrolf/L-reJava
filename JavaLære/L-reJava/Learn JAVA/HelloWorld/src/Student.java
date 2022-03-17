
public class Student extends UserOne implements Talk {
	public boolean verified = true;
	public String major;
	
	public Student() {
		System.out.println("Creating a constructor"); // constructor defaul
		 
	}
	
	public Student(String fn, String ln) { // Custom Constructor
		firstName = fn; 
		lastName = ln; 
	}
	
	@override
	public  void SayHello() {
		System.out.println("Hi my major is " + major + ". My name is"
				+ firstName + " " + lastName);
	}

}
