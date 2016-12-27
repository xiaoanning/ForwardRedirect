package dao;

import java.util.List;

import entity.TestUser;

public interface UserDao 
{
	public List<TestUser> queryAll();
	
	public TestUser queryByUsername(String username);
	
	public void insert(TestUser user);
	
	public void update(TestUser user);
	
	public void delete(String username);
}
