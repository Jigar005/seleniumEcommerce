//ADAPTER CLASS 
package core; 
interface It111
{
	void v1();
	void v2();
	void v3();
	void v4();
	void v5();
}

class Ado implements It111//adapter class 
{
	public void v1(){System.out.println("v1 impemented at Adapter class");}
	public void v2(){}
	public void v3(){}
	public void v4(){}
	public void v5(){System.out.println("v5 implemented at adapter class");}
}

class Client1 extends Ado
{
	public void v5(){System.out.println("method v5 client1 implemented ");}
}

class Client2 extends Ado//hierarchical inheritance
{
	public void v3(){System.out.println("method v3 client2 implemented");}
}

public class InterF2 extends Client1
{
	public static void main (String[] args)
	{
		InterF2 f2= new InterF2();
		f2.v1();//implemented at adapter class with implementation
		f2.v2();//implemented at adapter class with EMPTY implementation
		f2.v3();//implemented by client2 by method overriding, overridden method of adapter class
		f2.v4();//implemented at adapter class with implementation
		f2.v5();//implemented by client1 by method overriding, overridden method of adapter class
	}
	
	
}
