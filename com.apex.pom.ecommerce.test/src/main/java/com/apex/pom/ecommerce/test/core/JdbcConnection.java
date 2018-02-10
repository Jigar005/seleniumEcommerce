package com.apex.pom.ecommerce.test.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcConnection {
	private static void InsertToDB() {
		try {
			// create a mysql Database connection
			String myUrl = "jdbc:mysql://localhost:3306/testDB";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(myUrl, "root", "root");
			
			// the mysql insert statement
			String query = " Insert into sampletable (FirstName, LastName , PhoneNo, Company) values(?,?,?,?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, "<FirstName>");
			preparedStmt.setString(2, "<LastName>");
			preparedStmt.setString(3, "<Phone No.>");
			preparedStmt.setString(4, "<Company Name>");
			
			// execute the preparedstatement
			preparedStmt.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}

}
