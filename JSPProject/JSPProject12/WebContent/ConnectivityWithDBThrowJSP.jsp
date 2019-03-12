<%@page import="com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*, java.io.*,javax.servlet.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
            <%!   
                Connection con = null;
                Statement st = null;
                public void jspInit() 
                {
                    try 
                    {
                    	Class.forName("com.mysql.jdbc.Driver");	
        				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","root");
        				st = con.createStatement();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
              }%>
             
               <%
          
               try
           	{
           		ResultSet rs = st.executeQuery("select id,name from tab1");
   				while(rs.next())
   				{
   					out.println("<h3>" + rs.getInt(1) + "	" + rs.getString(2) + "</h3>");
   				}
           	}
       		catch(Exception e)
			{
				e.printStackTrace();
			}
               %>

        </body>
   </html>
