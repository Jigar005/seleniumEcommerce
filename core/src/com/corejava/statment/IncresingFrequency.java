package com.corejava.statment;

public class IncresingFrequency{

	public static void main (String[] args){
		int[] feb = new int [10];
		feb[0] = 0;
		feb[1] = 1;
		
		for (int i =2; i<10; i++)//initialization of array 
		{
			feb[i] = feb[i-1]+feb[i-2];
		}

		for (int i : feb)// printing of array
		{
			System.out.println(i);
		}

	}
}
