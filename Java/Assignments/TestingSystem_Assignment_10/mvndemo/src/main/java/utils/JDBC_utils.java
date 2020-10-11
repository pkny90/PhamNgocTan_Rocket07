package mvndemo.src.main.java.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import utils.properties.DatabaseProperties;

public class JDBC_utils {

	private Connection connection;
	private DatabaseProperties databaseProperties;
	
	public JDBC_utils() throws FileNotFoundException, IOException
	{
		databaseProperties = new DatabaseProperties();
	}
	public Connection connect() throws SQLException
	{
		String url = databaseProperties.getProperty("db_URL");
		String user = databaseProperties.getProperty("user");
		String psw = databaseProperties.getProperty("password");
		return connection = DriverManager.getConnection(url,user,psw);
	}
	
	public void disconnect() throws SQLException
	{
		connection.close();
	}
	
	
}
