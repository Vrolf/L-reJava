
public class Teacher extends UserOne implements Talk { 

	@Override
	public void SayHello() {
		System.out.println("I am a teacher");
		
	}

	@Override
	public void sayHello() {
		System.out.println("Implemented");
		
	}

}
