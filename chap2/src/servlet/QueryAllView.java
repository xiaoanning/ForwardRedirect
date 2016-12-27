package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.TestUser;

public class QueryAllView extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException 
	{
		arg1.setContentType("text/html") ;
		arg1.setCharacterEncoding("utf-8") ;
		
		List<TestUser> list = (List<TestUser>) arg0.getAttribute("list") ;
		
		PrintWriter pw = arg1.getWriter() ;
		
		pw.println("<table border = '1px' cellspacing = '0px' cellpadding = '10px'>");
		
		pw.println("<tr align = 'center' bgcolor = '#d0d0d0'>");
		pw.println("<td>username</td>");
		pw.println("<td>password</td>");
		pw.println("<td>option</td>");
		pw.println("</tr>");

		for(TestUser user : list)
		{
			pw.println("<tr>");
			pw.println("<td>"+user.getUsername()+ "</td>");
			pw.println("<td>"+user.getPassword()+ "</td>");
			pw.println("<td align = center><a href = '/ForwardRedirct/updateView?username="+user.getUsername()+"'>update</a>&nbsp<a href = '/ForwardRedirct/deleteAction?username="+user.getUsername()+"'>delete</a></td>");
			pw.println("</tr>");

		}
		
		pw.println("</table><p/>");
		
		pw.println("<text style = 'align : center'><a href = '/ForwardRedirct/insertView'>add user</a></text><p/>");
		
		pw.flush();
	}
	
}
