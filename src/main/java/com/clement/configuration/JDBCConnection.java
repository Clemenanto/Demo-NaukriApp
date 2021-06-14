package com.clement.configuration;

import java.sql.*;

public class JDBCConnection {
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		
		String url="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}
}