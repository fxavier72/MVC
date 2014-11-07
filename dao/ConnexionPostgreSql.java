package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnexionPostgreSql {
	
	private static configConnexion connexion = new configConnexion();
	
	private static Connection connect;
	
	private static String url = "jdbc:postgresql://localhost:5432/flebret";
	
	public static Connection getInstance(){
		if (connect == null){
			try{
				connect = DriverManager.getConnection(url, connexion.getLogin(),connexion.getPassword());
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return connect;
	}
}
