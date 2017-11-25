package com.corejava.statment;
import java.util.Random;// importing class random

public class Assig1_2 {

	public static void main (String [] args)
	{
		Random rob = new Random();//creating object 
		
		int tt;
		
		for (int i =1; i<10; i++)//if not using for loop then it would be printing only one number
		{
			tt = rob.nextInt(99);//range of numbers to be used 
			System.out.println(tt);
		}
	}
}
