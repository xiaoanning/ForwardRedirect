package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import util.JDBCUtil;
import dao.UserDaoImplement;
import entity.TestUser;

public class UserServiceImplement implements UserService
{

	public List<TestUser> queryAll() 
	{
		Connection con = null ;
		
		try
		{
			con = JDBCUtil.getConnection() ;
			con.setAutoCommit(false) ;
			
			UserDaoImplement udi = new UserDaoImplement();
			List<TestUser> list = udi.queryAll() ;
			
			con.commit() ;
			
			return list ;
			
		} catch (Exception e)
		{

			e.printStackTrace();
			try 
			{
				con.rollback() ;
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
			return null ;
		}finally
		{
			try 
			{
				JDBCUtil.close(null, null, con) ;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}

	public TestUser queryByUsername(String username)
	{

		Connection con = null ;
		
		try
		{
			con = JDBCUtil.getConnection() ;
			con.setAutoCommit(false) ;
			
			UserDaoImplement udi = new UserDaoImplement();
			TestUser user = udi.queryByUsername(username) ;
			
			con.commit() ;
			
			return user ;
			
		} catch (Exception e)
		{

			e.printStackTrace();
			try 
			{
				con.rollback() ;
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
			return null ;
		}finally
		{
			try 
			{
				JDBCUtil.close(null, null, con) ;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	public void insert(TestUser user) 
	{
		Connection con = null ;
		
		try
		{
			con = JDBCUtil.getConnection() ;
			con.setAutoCommit(false) ;
			
			UserDaoImplement udi = new UserDaoImplement();
			udi.insert(user) ;
			
			con.commit() ;
			
			
		} catch (Exception e)
		{

			e.printStackTrace();
			try 
			{
				con.rollback() ;
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null, null, con) ;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
				
	}

	public void update(TestUser user) 
	{
		Connection con = null ;
		
		try
		{
			con = JDBCUtil.getConnection() ;
			con.setAutoCommit(false) ;
			
			UserDaoImplement udi = new UserDaoImplement();
			udi.update(user) ;
			
			con.commit() ;
			
			
		} catch (Exception e)
		{

			e.printStackTrace();
			try 
			{
				con.rollback() ;
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null, null, con) ;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
				
	}

	public void delete(String username)
	{
		Connection con = null ;
		
		try
		{
			con = JDBCUtil.getConnection() ;
			con.setAutoCommit(false) ;
			
			UserDaoImplement udi = new UserDaoImplement();
			udi.delete(username) ;
			
			con.commit() ;
			
			
		} catch (Exception e)
		{

			e.printStackTrace();
			try 
			{
				con.rollback() ;
			} catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
		}finally
		{
			try 
			{
				JDBCUtil.close(null, null, con) ;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
				
	}

}
