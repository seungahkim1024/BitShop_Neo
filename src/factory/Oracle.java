package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle implements Database{
	private Connection conn;
	private String driver, url, username, password;
	
	public Oracle(String driver, String url, String username, String password) {
		
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public Connection getConnection() {
		conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
