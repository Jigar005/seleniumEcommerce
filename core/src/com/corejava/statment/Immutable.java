package com.corejava.statment;

public class Immutable {
	public static void main (String [] args)
	{
		Immu immu = new Immu ();
		System.out.println(immu.getValue());
		
//		immu.A = 50;
	
	}
}

final class Immu
{
	private final static int A = 20, B = 30;
	
	public int getValue ()
	{
		return (A+B);
	}
	
}