package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resultServlet")
public class resultServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt( request.getParameter("num1"));
		int b = Integer.parseInt( request.getParameter("num2"));
		int sum = a+b;
		PrintWriter pw = response.getWriter();
		pw.println("<h2>Result is: "+sum +"</h2>");
	}

}
