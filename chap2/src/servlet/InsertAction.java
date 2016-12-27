package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.TestUser;

import service.UserServiceImplement;

public class InsertAction extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException 
	{
		TestUser user = new TestUser() ;
		user.setUsername( arg0.getParameter("username") );
		user.setPassword( arg0.getParameter("password"));
		
		UserServiceImplement usi = new UserServiceImplement() ;
		usi.insert(user) ;
		
		arg1.sendRedirect("/ForwardRedirct/queryAllAction") ;
	}
	
}