package core;

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Hook Thread");
	}
}
public class HookThreadExample {
	public static void main (String [] args)
	{
			Thread2 t2 = new Thread2();
			Runtime r = Runtime.getRuntime();
			r.addShutdownHook(t2);
			t2.start();
	// Main logic
			for (int i =1; i<10; i++)
			{
				System.out.println("Main thread");
				try{Thread.sleep(2000);}
				catch(InterruptedException ie )
				{
					System.out.println(ie.getStackTrace());
				} if (i==5){System.exit(0);}
			}
	}

}
