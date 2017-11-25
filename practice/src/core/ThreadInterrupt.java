package core;
/*Author<JIGAR MEHTA>
 * Important thing in this example is : 
 * 1) Every time sleep method require exception handling, without handling 
 * file will not compile, means its a checked/compile time exception
 * 2)compile time exception are not a real exception its a assumption of 
 * compile that, this line/command may generate real time exception
 * (runtime exception), but the fact is run time it may not generate 
 * exception.
 * 3)So in this example when you run this code with out line no 30 
 * (t5.interrupt();) then it will not generate exception, proof of this is 
 * it will not print 23 stacktrace.
 * 4)If you run this with line no 30 then it will generate exception by 
 * t5.interrupt method

*/
class Thread5 extends Thread
{
	public void run ()
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.println("My Thread");
			try {Thread.sleep(2000);} catch (InterruptedException e) 
			{
				System.out.println(e.getStackTrace());
			}
		}
	}
}
public class ThreadInterrupt{
	public static void main (String [] args)
	{ Thread5 t5 = new Thread5();
		t5.start();
		t5.interrupt();
		System.out.println("Main Thread");
		System.out.println("Main Thread");
		System.out.println("Main Thread");
	}
}
	



