package core;
/*Author <JIGAR MEHTA> Example of multithreading with method overriding and
 * three threads. output may vary as per thread scheduler
*/
class Increment
{
	static int a = 10;
	public static void ThreadV1 ()
	{Increment.a = a+10;
	System.out.println("V1 - "+Increment.a);
	}
	public static void ThreadV2 ()
	{Increment.a = a+20;
	System.out.println("V2 - "+Increment.a);
	}

	public static void ThreadV3 ()
	{Increment.a = a+30;
	System.out.println("V3 - "+Increment.a);
	}


}
class ThreadV1 extends Thread
{
	public void run(){Increment.ThreadV1();}
}
class ThreadV2 extends Thread
{
	public void run(){Increment.ThreadV2();}
}
class ThreadV3 extends Thread
{
	public void run(){Increment.ThreadV3();}
}
public class MultiThreading {
	public static void main(String[] args) 
	{	new ThreadV1().start();
		new ThreadV2().start();
		new ThreadV3().start();
		System.out.println(Increment.a);
	}
}


