package core;

public class Try 
{
	void j1 (){
	try {System.out.println(10/0);}
	catch(ArithmeticException e)
	{
		System.out.println(10/5);
	}
	finally{System.out.println("Finally Block");}
	}
	public static void main (String [] args)
	{
		Try ry = new Try();
		ry.j1();
		
	}
}
