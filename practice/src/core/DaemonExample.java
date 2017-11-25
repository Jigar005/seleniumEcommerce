package core;

class Thread3 extends Thread {
	public void run() {
		
		for (int i = 1; i < 10; i++)
		{
			System.out.println("Daemon Thread");
			try {Thread.sleep(2000);} 
			catch (InterruptedException ie) 
			{
				System.out.println(ie.fillInStackTrace());
			}
		}
	}
}

public class DaemonExample {
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.setDaemon(true);
		t3.start();

		for (int i = 1; i < 10; i++)
		{
			System.out.println("Main Thread");
//			try {Thread.sleep(2000);} 
//			catch (InterruptedException ie) 
//			{
//				System.out.println(ie.fillInStackTrace());
//			}
		}

	}
}
