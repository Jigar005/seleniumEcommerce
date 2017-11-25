package jayAmbe;
interface it1 {void m1();}
interface it2 {void m2();}
interface it3 extends it1, it2 {void m3();}// contained it1,2,3 methods in
interface it4 {void m4();}

class A implements it3//contained 03 methods visible
{
	public void m1(){System.out.println("interF method m1");}//used public keyword 
	public void m2(){System.out.println("interF method m2");}//to maintain permission level
	public void m3(){System.out.println("interF method m3");}
}
//SO HERE M4 METHOD IMPLEMENTATION IS PENDING 
public class InterF extends A implements it4
{
	public void m4(){System.out.println("interF method m4");}
public static void main (String [] args)
{
	InterF f = new InterF();
	f.m1();
	f.m2();
	f.m3();f.m4();
}
}
	
	
	
