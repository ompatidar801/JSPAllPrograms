package jspBooklet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ElServlet14
 */
@WebServlet("/ElServlet14")
public class ElServlet14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie c1 = new Cookie("firstName","Jay");
		Cookie c2 = new Cookie("lastName","Ram");
		response.addCookie(c1);
		response.addCookie(c2);
		response.sendRedirect("ELExample3.jsp");
	}
}
