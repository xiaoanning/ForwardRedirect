package entity;

public class TestUser 
{
	private String username ;
	private String password ;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TestUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public TestUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestUser [username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
