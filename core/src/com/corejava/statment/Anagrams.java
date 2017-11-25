package com.corejava.statment;


import java.util.Arrays;


public class Anagrams {
	
	public static void main (String [] args)
	{
		String input1 ="listen";
		String input2 ="silent";
		
		Anagrams anagrams = new Anagrams();
		
		System.out.println(anagrams.areAnagram(input1, input2));
	}



public boolean areAnagram(String str1, String str2)
{
	if(str1.length() != str2.length())
	{
		return false;
	}
	str1 = str1.toUpperCase();
	str2 = str2.toUpperCase();
	
	char[] str1_charArray = str1.toCharArray();
	char[] str2_charArray = str2.toCharArray();
	
	Arrays.sort(str1_charArray);
	Arrays.sort(str2_charArray);
	
	return Arrays.equals(str1_charArray, str2_charArray);
	
	
}
}