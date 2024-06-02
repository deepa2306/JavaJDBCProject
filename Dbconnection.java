package BusResv;

import java.sql.*;

public class Dbconnection {

	private static final String url="jdbc:mysql//localhost:3306/busreserv";
	private static final String userName="root";
	private static final String passWord="Jivivenu@12";
	
	public static Connection getConnection() throws SQLException{
	{
		return DriverManager.getConnection(url,userName,passWord);
	}
}
}
