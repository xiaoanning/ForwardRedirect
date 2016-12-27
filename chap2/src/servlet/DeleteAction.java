package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserServiceImplement;

public class DeleteAction extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException 
	{		
		String username = arg0.getParameter("username");
		UserServiceImplement usi = new UserServiceImplement() ;
		usi.delete(username) ;
		
		arg1.sendRedirect("/ForwardRedirct/queryAllAction") ;
		
	}
	
}