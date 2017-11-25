package core;

public class Throws {
	
	
	void authorityApproval () throws InterruptedException
	{
		System.out.println("Before");
		Thread.sleep(3000);
		System.out.println(10/5);
		System.out.println("Before");
	}
	void centralRecords() throws InterruptedException
	{
		authorityApproval();
	}
	
	void birthcerti() throws InterruptedException
	{
		centralRecords();
	}
	public static void main (String [] args)throws InterruptedException
	{
		Throws ws = new Throws();
		ws.birthcerti();
		System.out.println("lst print");
		
		
	}

}
