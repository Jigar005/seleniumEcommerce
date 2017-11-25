package com.corejava.statment;

public class Split {
	/**
	 * @param args
	 */
	public static void main (String [] args)
	{
		String sp = "A BC DE FG HI";
		String[] spArray= sp.split(" ");
		
		for (String i : spArray)
		{
			System.out.println(i);
		}
	
	
	}
}
