package core;

public class MarkableInterface implements Cloneable 
{
	int a = 10; int b = 20; static int f = 30;
	public static void main (String [] args) throws Exception
	{
		
		
		MarkableInterface ce = new MarkableInterface();
		System.out.println(ce.a);
		System.out.println(ce.b);
		System.out.println(MarkableInterface.f);
		MarkableInterface ce1 = (MarkableInterface)ce.clone();
		
		ce.a=800; ce.b=800; MarkableInterface.f=800;
		System.out.println(ce.a);
		System.out.println(ce.b);
		System.out.println(MarkableInterface.f);
		System.out.println(ce1.a);//its get the value of same object ce, becouz its a clone object
		System.out.println(ce1.b);//
		
		
		
		
	}
	
	

}
