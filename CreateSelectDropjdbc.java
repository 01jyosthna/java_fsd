package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateSelectDropjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"Ramcharan@143");
			System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			System.out.println("Statement created..");
			//String create = "CREATE TABLE example(" +
              //      "id INT PRIMARY KEY AUTO_INCREMENT," +
                //    "name VARCHAR(255)," +
                  //  "age INT)";

            //stmt.executeUpdate(create);

            //System.out.println("Table created successfully!");
           
			
			// String select = "SELECT * FROM example";
            //ResultSet result = stmt.executeQuery(select);

           // while (result.next()) {
             //  int id = result.getInt("id");
               // String name = result.getString("name");
              //  int age = result.getInt("age");

                //System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            //}
			//Dropping the table
            String drop = "DROP TABLE IF EXISTS example";
            stmt.executeUpdate(drop);
            System.out.println("Table dropped successfully!");
	}
catch(Exception e) {
	System.out.println(e);
}
}
}