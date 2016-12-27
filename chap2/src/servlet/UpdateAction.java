package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserServiceImplement;

import entity.TestUser;

public class UpdateAction extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException 
	{
		String username = arg0.getParameter("username") ;
		String password = arg0.getParameter("password") ;
		
		TestUser user = new TestUser(username , password);
		
		UserServiceImplement usi = new UserServiceImplement() ;
		usi.update(user) ;
		
		arg1.sendRedirect("/ForwardRedirct/queryAllAction");
	}
	
}