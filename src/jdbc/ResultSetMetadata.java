package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class ResultSetMetadata {

	public static void main(String[] args) {

		try {
			
			//Register the driver class.
			Class.forName("com.mysql.jdbc.Driver");
			
			//Creating connection.
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vikram","root","quarry98");
			
			//Creating statement
			PreparedStatement rs=cn.prepareStatement("select * from emp");

			//Executing queries.
			ResultSetMetaData rsmd=rs.getMetaData() ;
			
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
			
			//Closing connection.
			cn.close();  
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
