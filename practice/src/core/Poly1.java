//Example of parent class variable holding a child class object but vice a versa not possible
// for that its needs type casting
//method Hiding by using Static method

package core;
class Parent
{
	void m1(){System.out.println("m1 parents");}//overridden method
	//Hidden method
	static void h1(){System.out.println("Parent class hidden method");}
}
public class Poly1 extends Parent
{
	void m1(){System.out.println("m1 child");}//overriding method
	void m2(){System.out.println("m2 child");}
	//child class shows only implementation but not overriding and not executing
	static void h1(){System.out.println("Child class show off method");}
	public static void main(String [] args)
	{
		Parent nt = new Poly1();
		nt.m1();
		//nt.m2(); this is invalid so type casting is needed.
		Poly1 ly1=(Poly1)nt;//type casting
		ly1.m2();
		
		//creating object and calling static method to archive method hiding
		Parent pp = new Poly1();
		pp.h1();//method not overriding and parent class method will be executed
		
		
		
		
		
	}

}
