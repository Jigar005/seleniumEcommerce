package com.corejava.statment;
import java.io.*;
import java.util.*;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		FileInputStream ff = new FileInputStream("Test.property");
		
		Properties pp = new Properties();
		pp.load(ff);
		String username=pp.getProperty("username");
		String password = pp.getProperty("password");
		System.out.println(username);
		System.out.println(password);
	}
}
