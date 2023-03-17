package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connectionProvider.ConnectionProvider;

/**
 * Servlet implementation class DeleteNotice
 */
public class DeleteNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("deleteFile");
		PrintWriter pw = response.getWriter();
		
		Connection con = ConnectionProvider.getConnection();
		
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from notices where FileName =?");
			pstmt.setString(1, fileName);
			pstmt.executeUpdate();
			
			pw.print("<body><center>");
			pw.print("<h3 style=color:red>File deleted successfully..</h3>");
			pw.print("</center></body>");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


}
