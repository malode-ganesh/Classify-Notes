package com.upload;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
public class UploadFileServlet extends HttpServlet {
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
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// gets values of text fields
		int num = Integer.parseInt(request.getParameter("id"));
//		PrintWriter pw = response.getWriter();
//		pw.print(num);
		
		InputStream inputStream = null; // input stream of the upload file
		
		// obtains the upload file part in this multipart request
        Part filePart = request.getPart("pdf");
        //obtain submitted file name
       String fname = filePart.getSubmittedFileName();
       
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            System.out.println(fname); 
            
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        String message = null;  // message will be sent back to client
        try {
            // connects to the database
            
            // constructs SQL statement
            String sql = "INSERT INTO FileDemo(id,filename, pdf) values (?,?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, num);
            //statement.setString(2, lastName);
             
            statement.setString(2, fname);
            
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(3, inputStream);
            }
 
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        } catch (Exception ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (con != null) {
                // closes the database connection
                try {
                    con.close();
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
