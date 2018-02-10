package com.corejava.statment;
import java.util.Scanner;


public class NumberTotal {

	public static void main (String[] args)
	{
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter any number to get total");
		int input = scr.nextInt();

		int a,c=0;
		int d,e=0;

		while(input !=0) 			// loop breaking condition
		{
			a 	= input%10;	
			//System.out.println(a);// separating last digit in order to store value to add
			input = input/10;		//removing last digit in order to restore "a" value by second last digit from left side
			c	 = c+a;				//stored each changed value of "a" and adding them to have final total. 	
		}
		System.out.println(c);

//		if (c/10 != 0)				// to make a total of 2digit answer in single digit
//		{
//			while (c < 0)
//			{
//				d = c%10;
//				c = c/10;
//				e = e+d;
//			}
//			if (e==0){e = 1;
//			System.out.println("E"+e);}// if answer is 10 it will take 1 as answer.
//		} 
//		else {System.out.println("c"+c);}



		scr.close();

	}
}
