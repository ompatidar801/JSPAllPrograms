package jspBooklet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServletEX2
 */
@WebServlet("/ELServletEX2")
public class ELServletEX2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("req", "This msg is from ELServletEX2 ");
		RequestDispatcher rd = request.getRequestDispatcher("ELExample6.jsp");
		rd.forward(request, response);
	}


}
