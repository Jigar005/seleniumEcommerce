package core;
interface It11
{	int a = 10;//all interface variable is public static access by interface name only
	void t1();
	
	interface It22// nested interface 
	{
		int b = 20;
		void t2();
	}
}
public class InterF1 implements It11
{
	public void t1(){System.out.println("t1 method implemented in InterF1");}
	public void t2(){System.out.println("t2 method implemented in InterF1");}
	
	public static void main (String [] args)
	{
		InterF1 f1 = new InterF1();
		f1.t1();
		f1.t2();
		System.out.println(It11.a);
		System.out.println(It11.It22.b);
		System.out.println(It11.It22.b);
		
	}

}
