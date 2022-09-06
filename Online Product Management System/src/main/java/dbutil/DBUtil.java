package dbutil;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnecton()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/product_management","root","");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection(Connection conn) {
		// TODO Auto-generated method stub
		
	}
}
