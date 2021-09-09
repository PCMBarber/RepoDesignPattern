package org.qa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	private String jdbcConnectionURL = "jdbc:mysql://localhost:3306/vehicles?serverTimezone=UTC";
    private String username = "root";
    private String password = "root";
    
    private Connection connection;
    
    private DBUtils() {
    	try {
    		connection = DriverManager.getConnection(jdbcConnectionURL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
	private static DBUtils instance = null;
	
	public static DBUtils getInstance() {
		if(instance == null) {
			instance = new DBUtils();
		}
		return instance;
	}
    
    public Statement getStatement() {
    	Statement state = null;
    	try {
    		state = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return state;
    }
}
