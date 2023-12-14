package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUpdateDeletejdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"Ramcharan@143");
			System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			System.out.println("Statement created..");
			//insert query
			//int result = stmt.executeUpdate("insert into employee values(7,'raj',45000)");
			
			//if(result>0) {
				//System.out.println("Record inserted successfully");
		//}
			//Delete Query
			//int result = stmt.executeUpdate("delete from employee where id =2");
		//if(result>0) {
			//	System.out.println("Record deleted successfully");
			//}else {
				//System.out.println("Record not present");
			//}
			// update Query 
			int result = stmt.executeUpdate("update employee set salary = 65000 where id=123");
			if(result>0) {
				System.out.println("Record updated successfully");
			}else {
				System.out.println("Record not present");
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
