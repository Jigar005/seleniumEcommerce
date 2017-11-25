//Example of polymorphism-method-constructor-operator overloading 
//compile time, static binding, early binding

package core;

public class Poly {
	
	//method overloading
	void m1(int a){System.out.println("method 1arg");}
	void m1(int a, int b){System.out.println("method 2args");}
	
	//constructor overloading
	Poly(char c){System.out.println("constructor 1args");}
	Poly(char c, int f){System.out.println("constructor 2args");}
	
	public static void main (String [] args)
	{
		Poly ly = new Poly('J');//01 arg constructor used 
		ly.m1(10);//01 args m1 used
		
		Poly ly1 = new Poly('d',30);//02 args constructor used
		ly1.m1(50,60);//02 args method used
		
		
		//Operator overloading
		int x=20,y=30;
		System.out.println(x+y+"Jigar"+"Chandni"+20+50);
		System.out.println(x+y);
	}

}
