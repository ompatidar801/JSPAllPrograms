package jspBooklet1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServlet4
 */
@WebServlet("/ELServlet4")
public class ELServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("abc");
		list.add(true);
		list.add(100.56);
		list.add('c');
		request.setAttribute("ArrayList", list);
		RequestDispatcher rt = request.getRequestDispatcher("ELExample8.jsp");
		rt.forward(request,response);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
