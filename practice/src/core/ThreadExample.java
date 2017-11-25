package core;

class Thread1 extends Thread
{
	public void run ()
	{
		for (int i =1; i<4; i++)
		{System.out.println("My First Thread");}
	}
}
public class ThreadExample{
	public static void main (String [] args)
	{
		Thread1 t1 = new Thread1();
		t1.setPriority(1);
		System.out.println(t1.getPriority());//1
		
		System.out.println(t1.getName());//Thread -0
		t1.setName("j1");
		System.out.println(t1.getName());//j1
		t1.start();
		
		System.out.println(Thread.activeCount());//1
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().hashCode());//366712642
		System.out.println(t1.isAlive());//true
		t1.checkAccess();;
		
		
		for (int i =1; i<5; i++)
		{System.out.println("Regular");}
	}
}
	



