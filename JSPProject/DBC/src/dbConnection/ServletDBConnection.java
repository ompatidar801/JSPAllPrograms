package dbConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDBConnection
 */

public class ServletDBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	private PreparedStatement ps;
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnectionWithServletandJSP", "root", "root");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			System.out.println("Enter");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String fstname = request.getParameter("fname");
			String lstname = request.getParameter("lname");
			String Email = request.getParameter("email");
			String Password = request.getParameter("password");
			String Gender = request.getParameter("gen");
			
			ps = con.prepareStatement("insert into Registration(fname ,lname ,email ,password ,gender) values(?,?,?,?,?)");
			ps.setString(1, fstname);
			ps.setString(2, lstname);
			ps.setString(3, Email);
			ps.setString(4, Password);
			ps.setString(5, Gender);
			
			int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");
 
			
	} catch (SQLException e) {

		e.printStackTrace();
	}
	}

	@Override
	public void destroy() {
		
		super.destroy();
	}

	
	
	
	/*public ServletDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnectionWithServletandJSP", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
				response.setContentType("text/html");
				String fstname = request.getParameter("fname");
				String lstname = request.getParameter("lname");
				String Email = request.getParameter("email");
				Integer Password = Integer.parseInt(request.getParameter("password"));
				String Gender = request.getParameter("gen");
				
				ps = con.prepareStatement("insert into Users(fname ,lname ,email ,password ,gender) values(?,?,?,?,?)");
				ps.setString(1, fstname);
				ps.setString(2, lstname);
				ps.setString(3, Email);
				ps.setInt(4, Password);
				ps.setString(5, Gender);
				
				ps.executeUpdate();
				
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/
	
}
