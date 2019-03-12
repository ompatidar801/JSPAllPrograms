package jspBooklet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServletEx3
 */
@WebServlet("/ELServletEx3")
public class ELServletEx3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int t[] = {10,20,454,867,78,30,23};
		request.setAttribute("array", t);
		RequestDispatcher fd = request.getRequestDispatcher("ELExample7.jsp");
		fd.forward(request, response);
	}

}
