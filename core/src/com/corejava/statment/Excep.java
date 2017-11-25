package com.corejava.statment;

import java.util.Scanner;

class AgeException extends Exception {
	AgeException(String str1) {
		super(str1);
	}
}

public class Excep {

	public void checkAge(int input, String gender) throws AgeException {
		if ((input > 18) && (gender.contains("m"))) {
			System.out.println("WELCOME HANDSOME");
		}

		else if ((input > 21) && (gender.contains("f"))) {
			System.out.println("WELCOME BEAUTIFUL");
		} else {
			throw new AgeException("INVALID AGE ");
		}
	}

	public static void main(String[] args) throws AgeException {
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int input = scr.nextInt();
		
		Scanner scr1 = new Scanner(System.in);
		System.out.println("ENTER YOUR GENDER M/F");
		String gender = scr1.nextLine();

		Excep excep = new Excep();
		excep.checkAge(input, gender);
		scr.close();
		scr1.close();
	}
}
