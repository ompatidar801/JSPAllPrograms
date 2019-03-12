package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDAO;
import dao.UsersDAOImplementation;
import model.Users;

/**
 * Servlet implementation class UsersController
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsersDAO usrdao;
	public static final String lIST_STUDENT = "/usersList.jsp";
	public static final String INSERT_OR_EDIT = "/userRegistration.jsp";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersController() {
        usrdao = new UsersDAOImplementation();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter( "action" );

		if( action.equalsIgnoreCase( "delete" ) ) {
			forward = lIST_STUDENT;
			int S_No = Integer.parseInt( request.getParameter("S_No") );
			usrdao.deleteUsers(S_No);
			request.setAttribute("students", usrdao.getAllUsers() );
		}
		else if( action.equalsIgnoreCase( "edit" ) ) {
			forward = INSERT_OR_EDIT;
			int S_No = Integer.parseInt( request.getParameter("S_No") );
			Users user = usrdao.getUsersByID(S_No);
			request.setAttribute("users", user);
		}
		else if( action.equalsIgnoreCase( "insert" ) ) {
			forward = INSERT_OR_EDIT;
		}
		else {
			forward = lIST_STUDENT;
			request.setAttribute("students", usrdao.getAllUsers() );
		}
		RequestDispatcher view = request.getRequestDispatcher( forward );
		view.forward(request, response);
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
				Users user1 = new Users();
				user1.setFirst_Name( request.getParameter("fname"));
				user1.setLast_Name( request.getParameter("lname"));
				user1.setEmail( request.getParameter("email"));
				user1.setPassword( request.getParameter("password"));
				user1.setGender( request.getParameter("gen"));
				user1.setCountry( request.getParameter("country"));
				user1.setState( request.getParameter("state"));
				user1.setCity( request.getParameter("city"));
				String S_No = request.getParameter("S_No");
				if( S_No == null || S_No.isEmpty() )
					usrdao.addUsers(user1);
				else {
					user1.setS_No(Integer.parseInt(S_No) );
					usrdao.updateUsers(user1);
				}
				System.out.println("Success");
	}

}
