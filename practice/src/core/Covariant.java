package core;
class Ji{}
class Chi{}

class test{
	public Ji n1()
	{
		System.out.println("N1 mehtod of Ji type");//overridden method
		return new Ji();
	
	}
}

public class Covariant {
	public Chi n1()
	{
		System.out.println("N1 method of chi type ");//overriding method
		return new Chi();
	}
	public static void main (String [] args)
	{
		Covariant nt = new Covariant();
		nt.n1();
		
	}

}
