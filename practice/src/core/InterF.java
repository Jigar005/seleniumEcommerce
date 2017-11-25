package core;
interface It1{void m1();}
interface It2{void m2();}
interface It3 extends It1, It2 {void m3();}
interface It4{void m4();}

abstract class Helper implements It3
{
	public void m1(){System.out.println("m1 method implementation in Helper class");}
	public void m2(){System.out.println("m2 method implementation in Helper class");}
	public void m3(){System.out.println("m3 method implementation in Helper class");}
}


public class InterF extends Helper implements It4 
{
	public void m4(){System.out.println("m4 method implementation in InterF class");}
	public static void main (String [] args)
	{
		InterF rf = new InterF();
		rf.m1();
		rf.m2();
		rf.m3();
		rf.m4();
		
	}
	

}
