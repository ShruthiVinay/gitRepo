package classPgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

//import com.mysql.jdbc.Driver;

public class S_2_ForInsertQuery {
	Connection con;
	@Test
	public void insertQuery() throws Throwable{
		
		try {
		//Step1: Register the driver or database
		
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//Step2: connect to database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "admin");
		
		//Step3: issue/create SQL statement
		Statement stat=con.createStatement();
		
		String query =  "insert into students_info(regno, firstName, middleName, lastName) values('5','zam','zango','h')"; //Values in single quote not in double quotes
		
		
		//Step4: execute SQL Query
		int result=stat.executeUpdate(query);
		if (result==1) 
			System.out.println("data is inserted");
		ResultSet res=stat.executeQuery("select * from students_info");
		while(res.next())
			System.out.println(res.getInt(1)+" "+res.getInt(2)+" "+res.getInt(3));
	
	}
	
	catch(Exception e){
		System.out.println("data is not inserted");
	}
		finally {
		con.close();
		}
		}
		
		
		
	}
