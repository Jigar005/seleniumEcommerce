//Example of immutable String class and mutable StringBuffer class


package core;

public class Str 
{
	public static void main (String [] args)
	{
		//example of immutable String class
		String sss = "Jigar";
		System.out.println(sss);
		sss.concat("mehta");
		System.out.println(sss);
		
		//example of mutable StringBuffer class 
		StringBuffer ppp = new StringBuffer("bhai");
		ppp.append("kumar");
		System.out.println(ppp);
		
		
		
	}
}
