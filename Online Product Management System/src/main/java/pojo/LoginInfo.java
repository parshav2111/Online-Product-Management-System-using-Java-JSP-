package pojo;

public class LoginInfo {

	String userName;
	String password;
	
	public LoginInfo()
	{
		
	}
	
	public LoginInfo(String userName, String passWord) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginInfo [userName=" + userName + ", password=" + password + "]";
	}
	
}
