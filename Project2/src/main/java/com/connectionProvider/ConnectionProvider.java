package com.connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
			//driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","devil123");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
