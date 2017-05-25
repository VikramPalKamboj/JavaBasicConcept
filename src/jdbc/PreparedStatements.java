package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatements {

	public static void main(String[] args) {

		try {
			
			//Register the driver class.
			Class.forName("com.mysql.jdbc.Driver");
			
			//Creating connection.
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vikram","root","quarry98");
			
			//Creating statement
			PreparedStatement rs=cn.prepareStatement("insert into Emp values(?,?)");

			//Executing queries.
			rs.setInt(1,12); 
			rs.setString(2,"Vikram");    
			int i=rs.executeUpdate();  
			System.out.println(i+" records inserted"); 
			
			//Closing connection.
			cn.close();  
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
