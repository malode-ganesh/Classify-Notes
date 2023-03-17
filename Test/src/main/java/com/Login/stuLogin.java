package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/stuLogin")
public class stuLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","devil123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from admin1 where uname= ? and pwd= ?");
			pstmt.setString(1, user);
			pstmt.setString(2, pwd);

			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
//				
				HttpSession hs = request.getSession();
				hs.setAttribute("uname", user);
				response.sendRedirect("index.jsp");
				
			}else {
				response.sendRedirect("stuLogin.jsp");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
			
		
//		if(user.equals("John") && pwd.equals("john@123")) {
//			response.sendRedirect("index.jsp");
//		}else {
//			PrintWriter pw = response.getWriter();
//			pw.print("Retry....");
//			response.sendRedirect("stuLogin.jsp");
//		}
	}

}
