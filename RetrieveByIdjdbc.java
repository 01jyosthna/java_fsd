package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveByIdjdbc {
	public static void main(String args[]) {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root" ,"Ramcharan@143");
		System.out.println("Connected successfully");
		Statement stmt  = con.createStatement();
		System.out.println("Statement created..");
		//insert query
		//int result = stmt.executeUpdate("insert into product values(108,'prakash',15000)");
		//update Query 
		//int result = stmt.executeUpdate("update product set price = 16000 where id=103");
		//if(result>0) {
			//System.out.println("Record updated successfully");
		//}else {
			//System.out.println("Record not present");
		//}
		 //Retrieve query 
		ResultSet rs = stmt.executeQuery("select * from product where id='102' ");
		while(rs.next()) {
			//System.out.println(" Id "+rs.getInt(1)+" Name is "+rs.getString(2)+" price is "+rs.getFloat(3));
			System.out.println(" Id "+rs.getInt("id")+" Name is "+rs.getString("name")+" price is "+rs.getFloat("price"));
		}
	}
		catch(Exception e) {
			System.out.println(e);
		}
}

}


