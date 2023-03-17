package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt( req.getParameter("num1"));
		int b = Integer.parseInt( req.getParameter("num2"));
	
		PrintWriter pw = res.getWriter();
		pw.println("<h2>Result is: "+a+b +"</h2>");
	}

}
