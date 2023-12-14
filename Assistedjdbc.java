package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Assistedjdbc {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"Ramcharan@143");
		System.out.println("Connected successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
