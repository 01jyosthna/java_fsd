package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CSRjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"Ramcharan@143");
			System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			System.out.println("Statement created..");
			
			int result = stmt.executeUpdate("insert into employee values(6,'raj',45000)");
			
			if(result>0) {
				System.out.println("Record inserted successfully");
		}
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
