
public class TernaryConditionalOperator {

	public static void main(String[] args) {
		
	String name = "Victor";
	
	//boolean velkommen = name.equals("Victor") ? true : false; 

	boolean velkommen; // skal klareres her og ikke inne i IF statement, fordi da vil den ikke v�re mulig � n� utenfor ifstatement
	if(name.equals("Victor"))
	{
		velkommen = true;
	}else
	{
		velkommen = false;
	}
	
	
	}

}
