package dbConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

	private static Connection con;
	
	public static Connection getConnection() throws IOException
	{
		if(con != null)
		{
			return con;
		}
		
		/*InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream( "/db.properties" );
		Properties properties = new Properties();
		
			properties.load( inputStream );
			String driver = properties.getProperty("driver");
			String url = properties.getProperty( "url" );
			String user = properties.getProperty( "user" );
			String password = properties.getProperty( "password" );*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CURDWithServletandJSP", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void closeConnection( Connection toBeClosed ) {
		if( toBeClosed == null )
			return;
		try {
			toBeClosed.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
