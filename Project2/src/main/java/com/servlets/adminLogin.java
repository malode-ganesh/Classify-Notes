package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connectionProvider.ConnectionProvider;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class adminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		PrintWriter pw = response.getWriter();
		
		try {
			Connection con = ConnectionProvider.getConnection();			
			PreparedStatement pstmt = con.prepareStatement("select * from classify_admin where email=? and pwd=?");
			pstmt.setString(1,email);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {				
				RequestDispatcher rd = request.getRequestDispatcher("/adminDashboard.jsp");
				rd.include(request, response);
			}else {
				pw.print("<body><center><br><br><br><br><h3 style=color:red>Invalid username or password<br>Retry</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}		
	}

}
