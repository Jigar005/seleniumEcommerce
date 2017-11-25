package core;
abstract class A1{
	abstract void m1();//abstract method
	
	A1(){System.out.println("Class A Constructor");}//constructor
	
	{System.out.println("Instance block");}//instance block
	
	static {System.out.println("static block");}//Static block
	//Its shows that we are able to declare static, instance block and constructor inside abstract class
	
}
public class Abst extends A1 
{
	void m1(){System.out.println("complited abstract method m1");}//implementation of abstract method
	
	public static void main (String [] args)
	{
		Abst st = new Abst();//as there is no abstract method implementation pending, no need to declare class as abstract class
		// so we can create object for same
		st.m1();
		
	}

}
