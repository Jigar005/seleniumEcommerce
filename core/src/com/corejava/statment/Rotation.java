package com.corejava.statment;

public class Rotation {
	public static void main(String[] args) {
		String st1 = "freemont";
		String st2 = "montfree";
		
		Rotation rotation = new Rotation();
		
		System.out.println(rotation.suSt(st1, st2));

	}

	public boolean suSt(String str1, String str2) {
		String str12 = str1 + str2;
		if (str1.length() != str2.length())
		{
			return false;
		}
		else{
			return str12.contains(str2);
		}

	}
}
