package com.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import com.connectionProvider.ConnectionProvider;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@WebServlet("/UploadFileServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class uploadServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	
	Connection con;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			con = ConnectionProvider.getConnection();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// gets values of text fields
		String year = request.getParameter("year");
		int sem = Integer.parseInt(request.getParameter("sem"));
		String sub = request.getParameter("sub");
		String course = request.getParameter("course");
		
//		PrintWriter pw = response.getWriter();
//		pw.print(num);
		
		InputStream inputStream = null; // input stream of the upload file
		
		// obtains the upload file part in this multipart request
        Part filePart = request.getPart("pdf");
        //obtain submitted file name
       String fileName = filePart.getSubmittedFileName();
       
        if (filePart != null) {
            // prints out some information for debugging
//            System.out.println(filePart.getName());
//            System.out.println(filePart.getSize());
//            System.out.println(filePart.getContentType());
//            System.out.println(fileName); 
            
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        String message = null;  // message will be sent back to client
        try {
            // connects to the database
            
            // constructs SQL statement
            String sql = "INSERT INTO db values (?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, year);
            statement.setInt(2, sem);
            
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(3, inputStream);
            }
            statement.setString(4, sub);
            statement.setString(5, course);
            statement.setString(6, fileName);
            
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded: "+fileName;
            }
        }catch(SQLIntegrityConstraintViolationException e) {
        	 message = "ERROR: This document is already uploaded ";
             e.printStackTrace();
        }catch (Exception ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (con != null) {
                // closes the database connection
                try {
//                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
             RequestDispatcher rd = request.getRequestDispatcher("/Message.jsp");
             rd.forward(request, response);
        }
	}

}
