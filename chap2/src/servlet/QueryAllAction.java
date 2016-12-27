package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserServiceImplement;
import entity.TestUser;

public class QueryAllAction extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html") ;
		response.setCharacterEncoding("uft-8") ;
		
		UserServiceImplement usi = new UserServiceImplement() ;
		List<TestUser> list = usi.queryAll() ;
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/queryAllView") ;
		rd.forward(request, response) ;
		
	}
	
}
