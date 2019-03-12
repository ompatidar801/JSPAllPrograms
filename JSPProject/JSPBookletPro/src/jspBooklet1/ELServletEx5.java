package jspBooklet1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServletEx5
 */
@WebServlet("/ELServletEx5")
public class ELServletEx5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList lst = new ArrayList();
		HashMap map1 = new HashMap();
		map1.put("name", "Rahu");
		map1.put("age", 25);
		map1.put("address", "Khandwa");
		HashMap map2 = new HashMap();
		map2.put("name", "Ketu");
		map2.put("age", 24);
		map2.put("address", "Indore");
		map2.put("mobno", 235846);
		lst.add(map1);
		lst.add(map2);
		request.setAttribute("msg", lst);
		RequestDispatcher ry = request.getRequestDispatcher("ELExample9.jsp");
		ry.forward(request,response);
	}

}
