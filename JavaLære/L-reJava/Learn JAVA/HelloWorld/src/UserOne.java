
public abstract class UserOne implements Talk  {
	public enum status {active, innactive, probation};
	public String firstName;
	public String lastName;
	public boolean verified = false; 
	public status status;
	
	public final abstract void SayHello();


}
