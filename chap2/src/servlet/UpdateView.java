package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateView extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException 
	{
		arg1.setContentType("text/html") ;
		arg1.setCharacterEncoding("utf-8");
		
		String username = arg0.getParameter("username") ;
		
		PrintWriter pw = arg1.getWriter() ;
		
		pw.println("<form action = '/ForwardRedirct/updateAction' method = 'post'>");
		pw.println("用户名 :<input type = 'text' name = 'username' value = "+username+" readonly><p/>");
		pw.println("密码:<input type = 'password' name = 'password'><p/>");
		pw.println("<input type = 'submit' value = '更新'><p/>");
		pw.println("<input type = 'reset' value = '重置'><p/>");


		pw.println("</form>");
		
		pw.flush();
	}
	
}