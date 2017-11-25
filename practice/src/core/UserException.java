package core;

class AgeException extends Exception
{
	AgeException(String str){super(str);}
}
public class UserException 
{

	void ageCheck(int age) throws Exception
	{
		if (age>20){System.out.println("welcome");}
		else{throw new AgeException("Jigar");}
	}	

	public static void main (String [] args) throws Exception
	{
		UserException on = new UserException();
		on.ageCheck(12);
	}


}
