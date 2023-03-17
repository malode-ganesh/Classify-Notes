package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connectionProvider.ConnectionProvider;

/**
 * Servlet implementation class ReadNotice
 */
public class ReadNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String id = request.getParameter("uploadFileName");
    	
    	Connection con = ConnectionProvider.getConnection();
    	
    	try {
			PreparedStatement pstmt = con.prepareStatement("select pdf from notices where filename =?");
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Blob b = rs.getBlob("pdf");
				byte byteArray[] = b.getBytes(1, (int) b.length());
				response.setContentType("application/pdf");
				OutputStream os = response.getOutputStream();
				os.write(byteArray);
				
			}else {
				PrintWriter pw = response.getWriter();
				pw.println("not found");
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
    }

}
