package com.corejava.statment;

public class ReverseString {
public static void main(String[] args) {
	String abc = "ABCD";
	//METHOD 1 
//	char [] ch1 = abc.toCharArray();
//	StringBuffer str = new StringBuffer();
//	for (int i = ch1.length-1; i >=0; i--)
//	{
//		str.append(ch1[i]);
//	}
//	System.out.println(str);
	
	//METHOD 2 RETURNING AS STRING OBJECT BUT REVERSE
	StringBuffer str = new StringBuffer(abc);
	str.reverse();
//	String rrr = new String(str);//TYPE CASTING FROM STRINGBUFFER TO STRING
//	System.out.println(rrr);
	abc = str.toString();// TOSTRING METHOD RETURNTYPE IS STRING SO WE CAN HAVE STRING OBJECT AS REVERSE
	System.out.println(abc);
}

}
