package classPgms;

//import com.mysql.jdbc.Connection;// don't use this
import java.sql.Connection;//use this
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;
//import com.mysql.jdbc.Statement;

public class S_1_ForSelectQuery {
	
	//private java.sql.Connection connection con;

	@Test
	public void selectQuery() throws Throwable
	{
		//Step1: Register the driver or database
		Driver d = new Driver();
		DriverManager.registerDriver(d);
				      
		//Step2: Connect to database
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "admin");
		
		//Step3: Issue/create SQL statement
		Statement stat=con.createStatement();
		String query="select * from students_info";
		
		//Step4: Execute SQL Query
		ResultSet result=stat.executeQuery(query);
		//process the result
		while(result.next()) {
			System.out.println(result.getInt(1)+ "\t" +result.getString(2)+ "\t" +result.getString(3));
		}
		
		//Step5: Close the connection
		con.close(); // to close the database connection- **important
	}

}
