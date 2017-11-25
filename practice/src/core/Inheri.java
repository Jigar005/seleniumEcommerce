// Inheritance with constructor, methods, instance block, static blocks
package core;
class A  
{
	A()//constructor
	{System.out.println("Class A constructor");}

	void m1()//parent class method
	{System.out.println("m1 Method");}
	//instance block
	{System.out.println("instance block of A");}
	//Static block
	static {System.out.println("Static block of A");}
}


class B extends A
{
	B()// constructor with invisible super keyword 
	{System.out.println("Class B constructor");}

	void m2 ()//parent class method
	{System.out.println("m2 method");}
	//instance block of B
	{System.out.println("instance block of B");}
	//static block
	static {System.out.println("Static block of B");}
}


public class Inheri extends B 
{

	void m1()
	{super.m1();// Same name method called from parent class
	System.out.println("Inheri m1 method");
	}
	public static void main (String [] args)
	{
		Inheri ri = new Inheri();
		ri.m1();
		ri.m2();

	}


}
