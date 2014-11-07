package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnexionPostgreSql {
	
	private static Connection connect;
	
	private static String url = "jdbc:postgresql://localhost:5432/flebret";
	private static String user = "user";
	private static String passwd = "password";
	
	public static Connection getInstance(){
		if (connect == null){
			try{
				connect = DriverManager.getConnection(url, user, passwd);
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return connect;
	}
}
