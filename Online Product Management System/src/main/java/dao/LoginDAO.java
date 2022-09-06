package dao;
import java.sql.*;

import dbutil.DBUtil;
import pojo.LoginInfo;
public class LoginDAO {
	public static boolean isUserValid(LoginInfo userDetails)
	{
		boolean validStatus = false;
		try
		{
			Connection conn = DBUtil.getConnecton();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM login_info WHERE user_name='"+userDetails.getUserName()+"' AND PASSWORD='"+userDetails.getPassword()+"'");
			while(rs.next())
			{
				validStatus = true;
			}
			DBUtil.closeConnection(conn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return validStatus;
	}	
}
