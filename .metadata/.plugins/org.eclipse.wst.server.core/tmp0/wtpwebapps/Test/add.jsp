<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home | Page</title>
</head>
<body style={background:darkcyan}>
	<%! //Declaration
	int sum;
	%>
	
	<%  //Scriplts
		int a = Integer.parseInt( request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		sum = a+b;
		
	%> 
	
	<h2>Result summ :  <%= sum %> </h2>
	
	
</body>
</html>