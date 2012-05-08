package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String psw = "123456";
		Connection conn = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, psw);
			conn.setAutoCommit(false);
			System.out.println ("Database connection established");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
