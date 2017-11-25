package core;
/*Its a example of multiple construction calling them in to each other good interview question*/
public class MethodOverriding 
{
MethodOverriding()
{this(10);
	System.out.println("constructor 1");
	
}
MethodOverriding(int x)
{this(10, 20);

	System.out.println("constructor 2");
	
}
MethodOverriding(int x, int y)
{
System.out.println("constructor 3");
}
	public static void main (String [] args)
	{
		MethodOverriding me = new MethodOverriding();
		
	}
}
class Methods
{
	public static void m2()
	{
		System.out.println("Method class m2");
		
	}
	public void m3()
	{
		
		System.out.println("Method class m3");
	}
}