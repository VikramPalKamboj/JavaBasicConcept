package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMysql {

	public static void main(String[] args) {

		try {
			
			//Register the driver class.
			Class.forName("com.mysql.jdbc.Driver");
			//Creating connection.
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vikram","root","quarry98");
			//Creating statement
			Statement st=cn.createStatement();
			
			//Executing queries.
			ResultSet rs=st.executeQuery("select * from emp");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
			//Closing connection.
			cn.close();  
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
