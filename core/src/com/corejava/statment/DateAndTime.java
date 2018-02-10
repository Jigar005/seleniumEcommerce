package com.corejava.statment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {

		
		
	DateFormat dateformate = new SimpleDateFormat("MM/DD/YY hh:mm:ss");
	Date date = new Date();
	String date1 = dateformate.format(date);
	System.out.println(date1);
	
	

	}

}
