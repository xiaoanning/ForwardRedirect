package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import entity.TestUser;

public class UserDaoImplement implements UserDao
{

	public List<TestUser> queryAll() 
	{
		Connection con = null ;
		PreparedStatement ps = null ;
		ResultSet rs = null ;
		
		List<TestUser> list = new ArrayList<TestUser>();
		
		try 
		{
			con = JDBCUtil.getConnection() ;
			ps = con.prepareStatement("select * from test_user");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				TestUser user = new TestUser(rs.getString(1),rs.getString(2));
				
				list.add(user) ;
			}
			
			return list ;
		} catch (Exception e)
		{

			e.printStackTrace();
			
			return null ;
			
		}finally
		{
			try 
			{
				JDBCUtil.close(rs,ps,null);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}

	public TestUser queryByUsername(String username) 
	{

		Connection con = null ;
		PreparedStatement ps = null ;
		ResultSet rs = null ;
				
		try 
		{
			con = JDBCUtil.getConnection() ;
			ps = con.prepareStatement("select * from test_user where username like ?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			
			TestUser user = null ;
			while(rs.next())
			{
				user = new TestUser(rs.getString(1),rs.getString(2));
				
			}
			
			return user ;
		} catch (Exception e)
		{

			e.printStackTrace();
			
			return null ;
			
		}finally
		{
			try 
			{
				JDBCUtil.close(rs,ps,null);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
	}

	public void insert(TestUser user) 
	{
		Connection con = null ;
		PreparedStatement ps = null ;
				
		try 
		{
			con = JDBCUtil.getConnection() ;
			ps = con.prepareStatement("insert into test_user values(?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword()) ;
			ps.executeUpdate();
			

		} catch (Exception e)
		{

			e.printStackTrace();
			
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null,ps,null);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
		
	}

	public void update(TestUser user) 
	{
		Connection con = null ;
		PreparedStatement ps = null ;
				
		try 
		{
			con = JDBCUtil.getConnection() ;
			ps = con.prepareStatement("update test_user set password = ? where username = ?");
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getUsername()) ;
			ps.executeUpdate();
			

		} catch (Exception e)
		{

			e.printStackTrace();
			
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null,ps,null);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}

	public void delete(String username) 
	{
		Connection con = null ;
		PreparedStatement ps = null ;
				
		try 
		{
			con = JDBCUtil.getConnection() ;
			ps = con.prepareStatement("delete test_user where username = ?");
			ps.setString(1, username) ;
			ps.executeUpdate();
			

		} catch (Exception e)
		{

			e.printStackTrace();
			
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null,ps,null);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
