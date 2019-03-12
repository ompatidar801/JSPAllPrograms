package javaBeanEx;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServletEx6
 */
@WebServlet("/ELServletEx6")
public class ELServletEx6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<PersonBean> al = new ArrayList<PersonBean>();
		PersonBean p1 = new PersonBean();
		p1.setFirstName("Ramakant <br>");
		p1.setEmail("rk23@gmail.com <br>");
		p1.setAge(23);
		p1.setWeight(67.99);
		
		PersonBean p2 = new PersonBean();
		p2.setFirstName("Umakant <br>");
		p2.setEmail("uk23@gmail.com <br>");
		p2.setAge(25);
		p2.setWeight(78.99);
		
		al.add(p1);
		al.add(p2);
		request.setAttribute("p", al);
		RequestDispatcher rg = request.getRequestDispatcher("ELExample10.jsp");
		rg.forward(request, response);
	}
	

}
