package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.connectionProvider.ConnectionProvider;
import com.entities.Users;

import dao.UserDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<body><center> ");
//		pw.print("<div class=row><div class=col-md-4>");
		
		String name = request.getParameter("fname");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		String pwd = request.getParameter("pwd");
		
		//check faculty or student
		String userType = request.getParameter("profession");
		
		//create Users obj and set the data in constructor
		Users user = new Users(name,email,course,pwd,userType);
		
		//create UsersDao obj
		UserDao dao = new UserDao(ConnectionProvider.getConnection());
		
		if(dao.SaveUsers(user)) {
			pw.print("<h2>Registered Successfully.."+ name +"</h2><br>");
			
			if(userType.equals("Teacher")) {
				pw.println("<br><br><br><h3>You will get confirmation email with <b>username</b> and <b>password</b></h3>");
				pw.println("<br><a href=index.jsp>Home</a>");
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.include(request, response);				
			}
			
			
			
		}else {
			pw.println("<br><br><br><h3>User already registered with <a href=#>"+ email +"</a> </h3>");
			pw.print("<div><a href=index.jsp class=btn btn-danger>Home Page</a></div>");
			pw.println("</center></body>");
		}
		
	}

}
